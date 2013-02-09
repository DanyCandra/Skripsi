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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.DataSample;

/**
 *
 * @author DanyCandra
 */
public class DataSampleDao {

    private Connection connection;

    public DataSampleDao(Connection connection) {
        this.connection = connection;
    }

    public List<DataSample> getAll() {
        List<DataSample> list = new ArrayList<DataSample>();
        DataSample test1 = null;
        String query = "select * from data_sample";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                test1 = new DataSample();
                test1.setIdKoresponden(resultSet.getString("id_koresponden"));
                test1.setNilaiRaport(resultSet.getDouble("nilai_raport"));
                test1.setNilaiUN(resultSet.getDouble("nilai_un"));
                test1.setNilaiWawancara(resultSet.getDouble("nilai_wawancara"));
                test1.setNilaiAkhir(resultSet.getDouble("nilai_akhir"));
                test1.setSigmoidRaport(resultSet.getDouble("sigmoid_raport"));
                test1.setSigmoidUN(resultSet.getDouble("sigmoid_un"));
                test1.setSigmoidWawancara(resultSet.getDouble("sigmoid_wawancara"));
                test1.setOutput(resultSet.getInt("output"));
                test1.setHasil(resultSet.getString("hasil"));
                list.add(test1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void updateOutput(int output, String hasil, String id) {
        String query = "update data_sample set output=?,hasil=? where id_koresponden=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, output);
            statement.setString(2, hasil);
            statement.setString(3, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    

    public void updateSigmoid(double sigRaport,double sigUN,double sigWawancra,  String id) {
        String query = "update data_sample set sigmoid_raport=?,sigmoid_un=?,sigmoid_wawancara=? where id_koresponden=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, sigRaport);
            statement.setDouble(2, sigUN);
            statement.setDouble(3, sigWawancra);
            statement.setString(4, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void resetSample() {
        String query = "update data_sample set output=0,hasil='Belum diuji' ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    

    public void resetSigmoid() {
        String query = "update data_sample set sigmoid_raport=0,sigmoid_un=0,sigmoid_wawancara=0 ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
