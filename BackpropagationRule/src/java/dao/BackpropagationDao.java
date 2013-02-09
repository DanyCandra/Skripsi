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

/**
 *
 * @author DanyCandra
 */
public class BackpropagationDao {

    private Connection connection;

    public BackpropagationDao(Connection connection) {
        this.connection = connection;
    }

    public void updateBiasAwalOutput(double w0, int id) {
        String query = "update bias_ouput_awal set w0=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, w0);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void resetBiasAwalOutput() {
        String query = "update bias_ouput_awal set w0=0";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateBiasAwalHidden(double v01, int id) {
        String query = "update bias_hidden_awal set v01=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, v01);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void resetBiasAwalHidden() {
        String query = "update bias_hidden_awal set v01=0";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateBobotAwalHiddenOutput(double w, int id) {
        String query = "update bobot_hiden_output_awal set w1=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, w);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void resetBobotAwalHiddenOutput() {
        String query = "update bobot_hiden_output_awal set w1=0";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateBobotAwalInputHidden(double v1, double v2, double v3, double v4, int id) {
        String query = "update bobot_input_hidden_awal set v1=?,v2=?,v3=?,v4=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, v1);
            statement.setDouble(2, v2);
            statement.setDouble(3, v3);
            statement.setDouble(4, v4);
            statement.setInt(5, id);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void resetBobotAwalInputHidden() {
        String query = "update bobot_input_hidden_awal set v1=0,v2=0,v3=0,v4=0 ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    // bobot dan bias akhir untuk sigmoid 
    public void updateBiasAkhirOutput(double w0, int id) {
        String query = "update bias_ouput_akhir set w0=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, w0);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void resetBiasAkhirOutput() {
        String query = "update bias_ouput_akhir set w0=0";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateBiasAkhirHidden(double v01, int id) {
        String query = "update bias_hidden_akhir set v01=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, v01);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void resetBiasAkhirHidden() {
        String query = "update bias_hidden_akhir set v01=0";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateBobotAkhirHiddenOutput(double w, int id) {
        String query = "update bobot_hiden_output_akhir set w1=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, w);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void resetBobotAkhirHiddenOutput() {
        String query = "update bobot_hiden_output_akhir set w1=0";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateBobotAkhirInputHidden(double v1, double v2, double v3, double v4, int id) {
        String query = "update bobot_input_hidden_akhir set v1=?,v2=?,v3=?,v4=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, v1);
            statement.setDouble(2, v2);
            statement.setDouble(3, v3);
            statement.setDouble(4, v4);
            statement.setInt(5, id);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void resetBobotAkhirInputHidden() {
        String query = "update bobot_input_hidden_akhir set v1=0,v2=0,v3=0,v4=0";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (Exception e) {
        }
    }
}
