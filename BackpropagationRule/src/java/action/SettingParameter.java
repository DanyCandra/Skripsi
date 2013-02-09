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

import dao.DatabaseConection;
import dao.ParameterDao;
import javax.servlet.http.HttpServletRequest;
import model.Parameter;

/**
 *
 * @author DanyCandra
 */
public class SettingParameter implements ActionInterface {

    @Override
    public String execute(HttpServletRequest request) {
        ParameterDao parameterDao = new ParameterDao(DatabaseConection.getConnection());
        Parameter parameter = parameterDao.getParamter(1);
        request.setAttribute("parameter", parameter);
        return "SettingParameter.jsp";
    }
}
