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
import model.DataRule;

/**
 *
 * @author DanyCandra
 */
public class DataRuleDao {

    private Connection connection;

    public DataRuleDao(Connection connection) {
        this.connection = connection;
    }

    public List<DataRule> getAll() {
        List<DataRule> list = new ArrayList<DataRule>();
        DataRule rule = null;
        String query = "select * from data_rule order by id";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                rule = new DataRule();
                rule.setId(resultSet.getInt("id"));
                rule.setRuleRaport(resultSet.getDouble("rule_raport"));
                rule.setRuleUn(resultSet.getDouble("rule_un"));
                rule.setRuleWawancara(resultSet.getDouble("rule_wawancara"));
                rule.setTarget(resultSet.getInt("target"));
                rule.setOutput(resultSet.getInt("output"));
                rule.setHasil(resultSet.getString("hasil"));
                list.add(rule);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public void updateOutput(int output, String hasil, int id) {
        String query = "update data_rule set output=?,hasil=? where id=?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, output);
            statement.setString(2, hasil);
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void resetRuler() {
        String query = "update data_rule set output=0,hasil='Belum diuji'";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
