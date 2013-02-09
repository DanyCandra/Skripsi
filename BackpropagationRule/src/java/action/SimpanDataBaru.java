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
import dao.DataSampleDao;
import dao.DataUjiCobaDao;
import dao.DatabaseConection;
import dao.ParameterDao;
import engine.BackPropagation;
import engine.IdTimeMilliesHelper;
import engine.Sigmoid;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.BiasHiddenAkhir;
import model.BiasOutputAkhir;
import model.BobotHiddenOutputAkhir;
import model.BobotInputHiddenAkhir;
import model.DataUjiCoba;
import model.Parameter;

/**
 *
 * @author DanyCandra
 */
public class SimpanDataBaru implements ActionInterface {

    @Override
    public String execute(HttpServletRequest request) {

        Sigmoid sigmoid = new Sigmoid();
        BackPropagation backPropagation = new BackPropagation();
        BiasHiddenDao biasHiddenDao = new BiasHiddenDao(DatabaseConection.getConnection());
        BiasOutputDao biasOutputDao = new BiasOutputDao(DatabaseConection.getConnection());
        BobotHiddenOutputDao bobotHiddenOutputDao = new BobotHiddenOutputDao(DatabaseConection.getConnection());
        BobotInputHiddenDao bobotInputHiddenDao = new BobotInputHiddenDao(DatabaseConection.getConnection());
        ParameterDao parameterDao = new ParameterDao(DatabaseConection.getConnection());
        DataUjiCobaDao ujiCobaDao = new DataUjiCobaDao(DatabaseConection.getConnection());
        Parameter parameter = parameterDao.getParamter(1);

        Double nilaiRaport = Double.parseDouble(request.getParameter("raport"));
        Double nilaiUN = Double.parseDouble(request.getParameter("un"));
        Double nilaiWawancara = Double.parseDouble(request.getParameter("wawancara"));
        Double nilaiAkhir = (nilaiRaport + nilaiUN + nilaiWawancara) / 3;
        Double sigmoidRaport = sigmoid.nilaiRaport(nilaiRaport);
        Double sigmoidUN = sigmoid.nilaiUN(nilaiUN);
        Double sigmoidWawancara = sigmoid.nilaiWawancara(nilaiWawancara);


        int unitInput = 3;
        int unitHidden = 4;
        int unitOutput = 1;

        backPropagation.setUnit_input(unitInput);
        backPropagation.setUnit_hidden(unitHidden);
        backPropagation.setUnit_output(unitOutput);
        backPropagation.setLearningRate(parameter.getLearningRate());
        backPropagation.setTargetError(parameter.getTargetError());
        backPropagation.setEpoh(parameter.getMakEpoh());

        //inisialisasi bias pada unit hidden 
        double v0[] = new double[unitHidden];
        int noBiasHiden = -1;
        List<BiasHiddenAkhir> biasHiddens = biasHiddenDao.getBiasHiddenAkhirSigmoid();
        for (BiasHiddenAkhir biasHidden : biasHiddens) {
            noBiasHiden =
                    noBiasHiden + 1;
            v0[noBiasHiden] = biasHidden.getV01();
            System.out.println("v0[" + noBiasHiden + "] = " + v0[noBiasHiden]);
        }

        //inisialisasi bobot input pada hidden 
        double v[][] = new double[unitInput][unitHidden];
        int noBobotInput = -1;
        List<BobotInputHiddenAkhir> bobotInputHiddens =
                bobotInputHiddenDao.getBobotInputHidenAkhirSigmoid();
        for (BobotInputHiddenAkhir bobotInputHidden : bobotInputHiddens) {
            noBobotInput = noBobotInput + 1;
            v[noBobotInput][0] = bobotInputHidden.getV1();
            v[noBobotInput][1] = bobotInputHidden.getV2();
            v[noBobotInput][2] = bobotInputHidden.getV3();
            v[noBobotInput][3] = bobotInputHidden.getV4();
        }

        //inisialisasi bias pada unit output 
        double w0[] = new double[unitOutput];
        int noBiasOutput = -1;
        List<BiasOutputAkhir> biasOutputs = biasOutputDao.getBiasOutputAkhirSigmoid();
        for (BiasOutputAkhir biasOutput : biasOutputs) {
            noBiasOutput = noBiasOutput + 1;
            w0[noBiasOutput] = biasOutput.getW0();
        }


        //inisialisasi bobot pada unit hidden output 
        double w[][] = new double[unitHidden][unitOutput];
        int noBobotHidenOutput = -1;
        List<BobotHiddenOutputAkhir> hiddenOutputs = bobotHiddenOutputDao.getBobotAkhirHidenOutputSigmoid();
        for (BobotHiddenOutputAkhir bobotHiddenOutput : hiddenOutputs) {
            noBobotHidenOutput = noBobotHidenOutput + 1;
            w[noBobotHidenOutput][0] = bobotHiddenOutput.getW1();

        }

        double inputBaru[] = {sigmoidRaport, sigmoidUN, sigmoidWawancara};
        double ouputReal = backPropagation.test(inputBaru, v0, v, w0, w);
        int output = (int) ouputReal;
        String hasil = "";
        if (output == 1) {
            hasil = "Tinggi";
        } else {
            hasil = "Rendah";
        }

        DataUjiCoba dataUjiCoba = new DataUjiCoba();
        dataUjiCoba.setIdKoresponden(IdTimeMilliesHelper.getTimeMillies());
        dataUjiCoba.setNilaiRaport(nilaiRaport);
        dataUjiCoba.setNilaiUN(nilaiUN);
        dataUjiCoba.setNilaiWawancara(nilaiWawancara);
        dataUjiCoba.setNilaiAkhir(nilaiAkhir);
        dataUjiCoba.setSigmoidRaport(sigmoidRaport);
        dataUjiCoba.setSigmoidUN(sigmoidUN);
        dataUjiCoba.setSigmoidWawancara(sigmoidWawancara);
        dataUjiCoba.setOutput(output);
        dataUjiCoba.setHasil(hasil);

        ujiCobaDao.insert(dataUjiCoba);

        return "controller?action=DataBaru.dnx";
    }
}
