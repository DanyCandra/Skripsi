/*
 *  ########################################################################
 *  # Copyright (c) 2012-2013, Dany Candra Febrianto. All rights reserved. #
 *  #                       Dany Candra Febrianto                          #  
 *  #Project ini di buat untuk memenuhi kelengkapan kurikulum studi saya di#
 *  #Universitas Muhammadiya Purwokerto, source ini bebas di distribusikan #
 *  #dan di modifikasi tanpa menghilangkan bagian ini.                     #
 *  #                                                                      #
 *  #                                                 Dany Candra Febrianto#
 *  #                                            danydongkrak.wordpress.com#
 *  ########################################################################
 */
package action;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dany Candra
 */
public interface ActionInterface {

    public String execute(HttpServletRequest request);
}
