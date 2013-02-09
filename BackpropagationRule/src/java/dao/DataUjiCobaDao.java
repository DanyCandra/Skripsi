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
import model.DataUjiCoba;

/**
 *
 * @author DanyCandra
 */
public class DataUjiCobaDao {

    private Connection connection;

    public DataUjiCobaDao(Connection connection) {
        this.connection = connection;
    }

    public List<DataUjiCoba> getAll() {
        List<DataUjiCoba> list = new ArrayList<DataUjiCoba>();
        DataUjiCoba test1 = null;
        String query = "select * from data_uji_coba order by id_koresponden";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                test1 = new DataUjiCoba();
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

    public void insert(DataUjiCoba dataUjiCoba) {
        String query = "insert into data_uji_coba (id_koresponden,nilai_raport,nilai_un,nilai_wawancara,nilai_akhir,"
                + "sigmoid_raport,sigmoid_un,sigmoid_wawancara,output,hasil) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, dataUjiCoba.getIdKoresponden());
            statement.setDouble(2, dataUjiCoba.getNilaiRaport());
            statement.setDouble(3, dataUjiCoba.getNilaiUN());
            statement.setDouble(4, dataUjiCoba.getNilaiWawancara());
            statement.setDouble(5, dataUjiCoba.getNilaiAkhir());
            statement.setDouble(6, dataUjiCoba.getSigmoidRaport());
            statement.setDouble(7, dataUjiCoba.getSigmoidUN());
            statement.setDouble(8, dataUjiCoba.getSigmoidWawancara());
            statement.setInt(9, dataUjiCoba.getOutput());
            statement.setString(10, dataUjiCoba.getHasil());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    
}
