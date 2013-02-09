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

import dao.DataRuleDao;
import dao.DataSampleDao;
import dao.DatabaseConection;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author DanyCandra
 */
public class DataSample implements ActionInterface {

    @Override
    public String execute(HttpServletRequest request) {
        DataSampleDao dataSampleDao = new DataSampleDao(DatabaseConection.getConnection());
        List<model.DataSample> list = dataSampleDao.getAll();
        request.setAttribute("rule", list);
        return "DataSample.jsp";
    }
}
