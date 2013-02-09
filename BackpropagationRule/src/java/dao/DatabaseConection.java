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

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author DanyCandra
 */
public class DatabaseConection {

    public static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setUser("root");
                dataSource.setPassword("");
                dataSource.setServerName("localhost");
                dataSource.setPort(3306);
                dataSource.setDatabaseName("db_jst_revisi");
                connection = dataSource.getConnection();
                System.out.println("sukses");
            } catch (SQLException e) {
                System.out.println("gagal");
            }
        }
        return connection;
    }
}
