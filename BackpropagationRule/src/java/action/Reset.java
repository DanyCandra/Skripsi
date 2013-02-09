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

import dao.BackpropagationDao;
import dao.DataRuleDao;
import dao.DataSampleDao;
import dao.DatabaseConection;
import dao.ParameterDao;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author DanyCandra
 */
public class Reset implements ActionInterface{

    @Override
    public String execute(HttpServletRequest request) {
        BackpropagationDao backpropagationDao=new BackpropagationDao(DatabaseConection.getConnection());
        DataRuleDao dataRuleDao=new DataRuleDao(DatabaseConection.getConnection());
        DataSampleDao dataSampleDao=new DataSampleDao(DatabaseConection.getConnection());
        ParameterDao parameterDao=new ParameterDao(DatabaseConection.getConnection());
        
        backpropagationDao.resetBiasAkhirHidden();
        backpropagationDao.resetBiasAkhirOutput();
        backpropagationDao.resetBobotAkhirHiddenOutput();
        backpropagationDao.resetBobotAkhirInputHidden();
        
        backpropagationDao.resetBiasAwalHidden();
        backpropagationDao.resetBiasAwalOutput();
        backpropagationDao.resetBobotAwalHiddenOutput();
        backpropagationDao.resetBobotAwalInputHidden();
        
        dataRuleDao.resetRuler();
        
        dataSampleDao.resetSample();
        dataSampleDao.resetSigmoid();
        
        parameterDao.reserParameter();
        return "Index.jsp";
    }
    
}
