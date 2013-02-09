/*
 *  ########################################################################
 *  #Copyright (c) 2012-2013, Dany Candra Febrianto. All rights reserved.  #
 *  #                       Dany Candra Febrianto                          #  
 *  #Project ini di buat untuk memenuhi kelengkapan kurikulum studi saya di#
 *  #Universitas Muhammadiya Purwokerto, source ini bebas di distribusikan #
 *  #dan di modifikasi tanpa menghilangkan bagian ini.                     #
 *  #                                                                      #
 *  #                                                 Dany Candra Febrianto#
 *  #                                            danydongkrak.wordpress.com#
 *  ########################################################################
 */
package engine;

/**
 *
 * @author Dany Candra F
 */
public class IdTimeMilliesHelper {

    public static String getTimeMillies() {
        String id = "";

        Long timeMillies = System.currentTimeMillis();

        id = String.valueOf(timeMillies);

        return id;
    }
}
