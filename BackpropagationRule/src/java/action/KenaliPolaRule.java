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
package action;

import engine.TryBackpropagation;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author DanyCandra
 */
public class KenaliPolaRule implements ActionInterface{

    @Override
    public String execute(HttpServletRequest request) {
        TryBackpropagation.pembelajaranRule();
        
        return "controller?action=DataRule.dnx";
    }
    
}
