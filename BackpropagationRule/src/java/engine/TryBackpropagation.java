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
package engine;

import dao.BackpropagationDao;
import dao.DataRuleDao;
import dao.DatabaseConection;
import dao.ParameterDao;
import java.util.List;
import model.DataRule;
import model.Parameter;

/**
 *
 * @author DanyCandra
 */
public class TryBackpropagation {

    public static void pembelajaranRule() {

        BackpropagationDao backpropagation = new BackpropagationDao(DatabaseConection.getConnection());
        ParameterDao parameterDao = new ParameterDao(DatabaseConection.getConnection());
        DataRuleDao service = new DataRuleDao(DatabaseConection.getConnection());
        List<DataRule> dataLearnings = service.getAll();
        Parameter parameter = parameterDao.getParamter(1);

        int jumlahData = dataLearnings.size();
        int unitInput = 3;
        int unitHidden = 4;
        int unitOutput = 1;

        BackPropagation backPropagation = new BackPropagation();
        backPropagation.setJumlah_data(jumlahData);
        backPropagation.setUnit_input(unitInput);
        backPropagation.setUnit_hidden(unitHidden);
        backPropagation.setUnit_output(unitOutput);
        backPropagation.setLearningRate(parameter.getLearningRate());
        backPropagation.setTargetError(parameter.getTargetError());
        backPropagation.setEpoh(parameter.getMakEpoh());


        //inisialisai x (input)
        double x[][] = new double[jumlahData][unitInput];
        int no = -1;
        for (DataRule dataLearning : dataLearnings) {
            no = no + 1;
            try {
                x[no][0] = dataLearning.getRuleRaport();
                x[no][1] = dataLearning.getRuleUn();
                x[no][2] = dataLearning.getRuleWawancara();

            } catch (IndexOutOfBoundsException boundsException) {
            }
        }

        //inisialisasi target
        double t[] = new double[jumlahData];
        int noTarget = -1;
        for (DataRule dataLearning : dataLearnings) {
            noTarget = noTarget + 1;
            try {
                t[noTarget] = dataLearning.getTarget();
            } catch (IndexOutOfBoundsException boundsException) {
            }
        }

        //inisialisasi bias pada unit hidden
        double v0[] = new double[unitHidden];
        for (int i = 0; i < unitHidden; i++) {
            try {
                v0[i] = (-1 * Math.random() * 1);
            } catch (IndexOutOfBoundsException boundsException) {
            }
            backpropagation.updateBiasAwalHidden(v0[i], i + 1);
            System.out.println("v0[" + i + "] = " + v0[i]);
        }
        //inisialisasi bias input pada hidden
        double v[][] = new double[unitInput][unitHidden];
        for (int i = 0; i < unitInput; i++) {
            for (int j = 0; j < unitHidden; j++) {
                try {
                    v[i][j] = (-1 * Math.random() * 1);
                } catch (IndexOutOfBoundsException boundsException) {
                }
                backpropagation.updateBobotAwalInputHidden(v[i][0], v[i][1], v[i][2], v[i][3], i + 1);
                System.out.println("v[" + i + "] [" + j + "] = " + v[i][j]);
            }
        }
        //inisialisasi bias pada unit output
        double w0[] = new double[unitOutput];
        for (int i = 0; i < unitOutput; i++) {
            try {
                w0[i] = (-1 * Math.random() * 1);
            } catch (IndexOutOfBoundsException boundsException) {
            }
            backpropagation.updateBiasAwalOutput(w0[i], i + 1);
            System.out.println("w0[" + i + "] = " + w0[i]);
        }
        //inisialisasi bias pada unit hidden output
        double w[][] = new double[unitHidden][unitOutput];
        for (int i = 0; i < unitHidden; i++) {
            for (int j = 0; j < unitOutput; j++) {
                try {
                    w[i][j] = (-1 * Math.random() * 1);

                } catch (IndexOutOfBoundsException boundsException) {
                }
                backpropagation.updateBobotAwalHiddenOutput(w[i][j], i + 1);
                System.out.println("w[" + i + "] [" + j + "] = " + w[i][j]);
            }

        }


        backPropagation.learn(x, v0, v, w0, w, t);

        String hasil = "";
        int akurasi = 0;
        for (DataRule dataLearning : dataLearnings) {
            double inputBaru[] = {dataLearning.getRuleRaport(), dataLearning.getRuleUn(),
                dataLearning.getRuleWawancara()};
            double ouputReal = backPropagation.test(inputBaru, v0, v, w0, w);
            int output = (int) ouputReal;

            DataRule learning = new DataRule();
            learning.setId(dataLearning.getId());
            learning.setOutput(output);
            if (ouputReal == dataLearning.getTarget()) {
                hasil = "Cocok";
                akurasi = akurasi + 1;
            } else {
                hasil = "Tidak Cocok";
            }
            learning.setHasil(hasil);

            service.updateOutput(learning.getOutput(), hasil, learning.getId());
        }

        double persenAkurasi = (akurasi / jumlahData) * 100.0;
        parameterDao.updateTingkatAkurasi(persenAkurasi, 1);

        System.out.println(backPropagation.getIterasi());

    }
}
