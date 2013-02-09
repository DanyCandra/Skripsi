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
import model.BobotHiddenOutputAkhir;
import model.BobotHiddenOutputAwal;

/**
 *
 * @author DanyCandra
 */
public class BobotHiddenOutputDao {

    private Connection connection;

    public BobotHiddenOutputDao(Connection connection) {
        this.connection = connection;
    }

    public List<BobotHiddenOutputAwal> getBobotAwalHodenOutputAll() {
        String query = "select * from bobot_hiden_output_awal order by id";
        List<BobotHiddenOutputAwal> list = new ArrayList<BobotHiddenOutputAwal>();
        BobotHiddenOutputAwal output = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                output = new BobotHiddenOutputAwal();
                output.setId(resultSet.getInt("id"));
                output.setW1(resultSet.getDouble("w1"));
                list.add(output);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<BobotHiddenOutputAkhir> getBobotAkhirHidenOutputSigmoid() {
        String query = "select * from bobot_hiden_output_akhir order by id";
        List<BobotHiddenOutputAkhir> list = new ArrayList<BobotHiddenOutputAkhir>();
        BobotHiddenOutputAkhir output = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                output = new BobotHiddenOutputAkhir();
                output.setId(resultSet.getInt("id"));
                output.setW1(resultSet.getDouble("w1"));
                list.add(output);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
