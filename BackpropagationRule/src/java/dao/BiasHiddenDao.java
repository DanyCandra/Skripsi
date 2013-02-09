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
import model.BiasHiddenAkhir;
import model.BiasHiddenAwal;

/**
 *
 * @author DanyCandra
 */
public class BiasHiddenDao {

    private Connection connection;

    public BiasHiddenDao(Connection connection) {
        this.connection = connection;
    }

    
    public List<BiasHiddenAwal> getBiasHiddenAwalAll() {
        String query="select * from bias_hidden_awal order by id";
        List<BiasHiddenAwal> list = new ArrayList<BiasHiddenAwal>();
        BiasHiddenAwal hidden=null;
        try {
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()) {                
                hidden=new BiasHiddenAwal();
                hidden.setId(resultSet.getInt("id"));
                hidden.setV01(resultSet.getDouble("v01"));
                list.add(hidden);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<BiasHiddenAkhir> getBiasHiddenAkhirSigmoid() {
        String query="select * from bias_hidden_akhir order by id";
        List<BiasHiddenAkhir> list = new ArrayList<BiasHiddenAkhir>();
        BiasHiddenAkhir hidden=null;
        try {
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()) {                
                hidden=new BiasHiddenAkhir();
                hidden.setId(resultSet.getInt("id"));
                hidden.setV01(resultSet.getDouble("v01"));
                list.add(hidden);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
