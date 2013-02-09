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
import model.BiasOutputAkhir;
import model.BiasOutputAwal;

/**
 *
 * @author DanyCandra
 */
public class BiasOutputDao {

    private Connection connection;

    public BiasOutputDao(Connection connection) {
        this.connection = connection;
    }


    public List<BiasOutputAwal> getBiasOutputAwalAll() {
        String query = "select * from bias_ouput_awal order by id";
        List<BiasOutputAwal> list = new ArrayList<BiasOutputAwal>();
        BiasOutputAwal output = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                output = new BiasOutputAwal();
                output.setId(resultSet.getInt("id"));
                output.setW0(resultSet.getDouble("w0"));
                list.add(output);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<BiasOutputAkhir> getBiasOutputAkhirSigmoid() {
        String query = "select * from bias_ouput_akhir order by id";
        List<BiasOutputAkhir> list = new ArrayList<BiasOutputAkhir>();
        BiasOutputAkhir output = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                output = new BiasOutputAkhir();
                output.setId(resultSet.getInt("id"));
                output.setW0(resultSet.getDouble("w0"));
                list.add(output);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
