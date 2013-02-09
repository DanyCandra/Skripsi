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

import dao.BiasHiddenDao;
import dao.BiasOutputDao;
import dao.BobotHiddenOutputDao;
import dao.BobotInputHiddenDao;
import dao.DatabaseConection;
import dao.ParameterDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.HTMLDocument;
import model.BiasHiddenAkhir;
import model.BiasHiddenAwal;
import model.BiasOutputAkhir;
import model.BiasOutputAwal;
import model.BobotHiddenOutputAkhir;
import model.BobotHiddenOutputAwal;
import model.BobotInputHiddenAkhir;
import model.BobotInputHiddenAwal;
import model.Parameter;

/**
 *
 * @author DanyCandra
 */
public class HasilPelatihan implements ActionInterface {

    @Override
    public String execute(HttpServletRequest request) {
        ParameterDao parameterDao = new ParameterDao(DatabaseConection.getConnection());
        Parameter parameter = parameterDao.getParamter(1);
       
        
        if (parameter.getAkurasi() > 0) {
            
            BobotInputHiddenDao bobotInputHiddenDao = new BobotInputHiddenDao(DatabaseConection.getConnection());
            BiasHiddenDao biasHiddenDao = new BiasHiddenDao(DatabaseConection.getConnection());
            BobotHiddenOutputDao bobotHiddenOutputDao = new BobotHiddenOutputDao(DatabaseConection.getConnection());
            BiasOutputDao biasOutputDao = new BiasOutputDao(DatabaseConection.getConnection());


            List<BiasHiddenAwal> biasHiddenAwals = biasHiddenDao.getBiasHiddenAwalAll();
            List<BiasHiddenAkhir> biasHiddenAkhirs = biasHiddenDao.getBiasHiddenAkhirSigmoid();


            List<BobotInputHiddenAwal> bobotInputHiddenAwals = bobotInputHiddenDao.getBobotInputHidenAwal();
            List<BobotInputHiddenAkhir> bobotInputHiddenAkhirs = bobotInputHiddenDao.getBobotInputHidenAkhirSigmoid();


            List<BobotHiddenOutputAwal> bobotHiddenOutputAwals = bobotHiddenOutputDao.getBobotAwalHodenOutputAll();
            List<BobotHiddenOutputAkhir> bobotHiddenOutputAkhirs = bobotHiddenOutputDao.getBobotAkhirHidenOutputSigmoid();


            List<BiasOutputAwal> biasOutputAwals = biasOutputDao.getBiasOutputAwalAll();
            List<BiasOutputAkhir> biasOutputAkhirs = biasOutputDao.getBiasOutputAkhirSigmoid();


            request.setAttribute("biasAwalKeHidden", biasHiddenAwals);
            request.setAttribute("biasAkhirSigmoidKeHidden", biasHiddenAkhirs);

            request.setAttribute("bobotAwalInputHidden", bobotInputHiddenAwals);
            request.setAttribute("bobotAkhirSigmoidInputHidden", bobotInputHiddenAkhirs);


            request.setAttribute("bobotAwalHiddenOutput", bobotHiddenOutputAwals);
            request.setAttribute("bobotAkhirSigmoidHiddenOutput", bobotHiddenOutputAkhirs);


            request.setAttribute("biasOutputAwal", biasOutputAwals);
            request.setAttribute("biasOutputAkhirSigmoid", biasOutputAkhirs);

            request.setAttribute("parameter", parameter);

            return "HasilPelatihan.jsp";
        } else {
            return "Error.jsp";
        }
        
    }
}
