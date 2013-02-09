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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.BobotInputHiddenAkhir;
import model.BobotInputHiddenAwal;

/**
 *
 * @author DanyCandra
 */
public class BobotInputHiddenDao {
    
    private Connection connection;

    public BobotInputHiddenDao(Connection connection) {
        this.connection = connection;
    }
    
    
    public List<BobotInputHiddenAwal> getBobotInputHidenAwal() {
        String query = "select * from bobot_input_hidden_awal order by id";
        List<BobotInputHiddenAwal> list = new ArrayList<BobotInputHiddenAwal>();
        BobotInputHiddenAwal hidden = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                hidden = new BobotInputHiddenAwal();
                hidden.setId(resultSet.getInt("id"));
                hidden.setV1(resultSet.getDouble("v1"));
                hidden.setV2(resultSet.getDouble("v2"));
                hidden.setV3(resultSet.getDouble("v3"));
                hidden.setV4(resultSet.getDouble("v4"));
                list.add(hidden);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<BobotInputHiddenAkhir> getBobotInputHidenAkhirSigmoid() {
        String query = "select * from bobot_input_hidden_akhir order by id";
        List<BobotInputHiddenAkhir> list = new ArrayList<BobotInputHiddenAkhir>();
        BobotInputHiddenAkhir hidden = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                hidden = new BobotInputHiddenAkhir();
                hidden.setId(resultSet.getInt("id"));
                hidden.setV1(resultSet.getDouble("v1"));
                hidden.setV2(resultSet.getDouble("v2"));
                hidden.setV3(resultSet.getDouble("v3"));
                hidden.setV4(resultSet.getDouble("v4"));
                list.add(hidden);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
}
