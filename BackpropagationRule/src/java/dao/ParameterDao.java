/*
 * ########################################################################
 * # Copyright (c) 2012-2013, Dany Candra Febrianto. All rights reserved. #
 * #                       Dany Candra Febrianto                          #  
 * #Project ini di buat untuk memenuhi kelengkapan kurikulum studi saya di#
 * #Universitas Muhammadiya Purwokerto, source ini bebas di distribusikan #
 * #dan di modifikasi tanpa menghilangkan bagian ini.                     #
 * #                                                                      #
 * #                                                 Dany Candra Febrianto#
 * #                                            danydongkrak.wordpress.com#
 * ########################################################################
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Parameter;

/**
 *
 * @author DanyCandra
 */
public class ParameterDao {

    private Connection connection;

    public ParameterDao(Connection connection) {
        this.connection = connection;
    }

    public void updateParamter(Parameter parameter) {
        String query = "update paramter set mak_epoh=?,target_error=?,learning_rate=? ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, parameter.getMakEpoh());
            statement.setDouble(2, parameter.getTargetError());
            statement.setDouble(3, parameter.getLearningRate());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateLearning(int iterasi, double mse, int id) {
        String query = "update paramter set iterasi=?,mse=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, iterasi);
            statement.setDouble(2, mse);
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void updateTingkatAkurasi(double akurasi, int id) {
        String query = "update paramter set akurasi=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, akurasi);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public Parameter getParamter(int id) {
        String query = "select * from paramter where id=?";
        Parameter parameter = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                parameter = new Parameter();
                parameter.setId(set.getInt("id"));
                parameter.setTargetError(set.getDouble("target_error"));
                parameter.setIterasi(set.getInt("iterasi"));
                parameter.setLearningRate(set.getDouble("learning_rate"));
                parameter.setMakEpoh(set.getInt("mak_epoh"));
                parameter.setMse(set.getDouble("mse"));
                parameter.setAkurasi(set.getDouble("akurasi"));

            }
        } catch (SQLException e) {
        }
        return parameter;

    }

    public void reserParameter() {
        String query = "update paramter set iterasi=0,mse=0,akurasi=0";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
        }
    }
}
