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
public class UpdateParameter implements ActionInterface{

    @Override
    public String execute(HttpServletRequest request) {
        Double targetError = Double.parseDouble(request.getParameter("targetError"));
        Double learningRate = Double.parseDouble(request.getParameter("learningRate"));
        Integer makEpoh = Integer.parseInt(request.getParameter("epoh"));

        Parameter parameter = new Parameter();
        parameter.setTargetError(targetError);
        parameter.setLearningRate(learningRate);
        parameter.setMakEpoh(makEpoh);

        ParameterDao dao = new ParameterDao(DatabaseConection.getConnection());
        dao.updateParamter(parameter);

        return "controller?action=FirstAccess.dnx";
    }
    
}
