package action;

import dao.BiasHiddenDao;
import dao.BiasOutputDao;
import dao.BobotHiddenOutputDao;
import dao.BobotInputHiddenDao;
import dao.DataSampleDao;
import dao.DatabaseConection;
import dao.ParameterDao;
import engine.BackPropagation;
import engine.Sigmoid;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.BiasHiddenAkhir;
import model.BiasOutputAkhir;
import model.BobotHiddenOutputAkhir;
import model.BobotInputHiddenAkhir;
import model.Parameter;

public class SimulasiDataSample implements ActionInterface {

    @Override
    public String execute(HttpServletRequest request) {

        Sigmoid sigmoid = new Sigmoid();
        BackPropagation backPropagation = new BackPropagation();
        BiasHiddenDao biasHiddenDao = new BiasHiddenDao(DatabaseConection.getConnection());
        BiasOutputDao biasOutputDao = new BiasOutputDao(DatabaseConection.getConnection());
        BobotHiddenOutputDao bobotHiddenOutputDao = new BobotHiddenOutputDao(DatabaseConection.getConnection());
        BobotInputHiddenDao bobotInputHiddenDao = new BobotInputHiddenDao(DatabaseConection.getConnection());
        ParameterDao parameterDao = new ParameterDao(DatabaseConection.getConnection());
        DataSampleDao dataSampleDao = new DataSampleDao(DatabaseConection.getConnection());
        Parameter parameter = parameterDao.getParamter(1);



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

        List<model.DataSample> dataLearnings = dataSampleDao.getAll();
        String hasil = "";
        for (model.DataSample dataLearning : dataLearnings) {

            Double sigmoidRaport = sigmoid.nilaiRaport(dataLearning.getNilaiRaport());
            Double sigmoidUN = sigmoid.nilaiUN(dataLearning.getNilaiUN());
            Double sigmoidWawancara = sigmoid.nilaiWawancara(dataLearning.getNilaiWawancara());

            double inputBaru[] = {sigmoidRaport, sigmoidUN, sigmoidWawancara};
            double ouputReal = backPropagation.test(inputBaru, v0, v, w0, w);
            int output = (int) ouputReal;

            model.DataSample learning = new model.DataSample();
            learning.setIdKoresponden(dataLearning.getIdKoresponden());
            learning.setOutput(output);
            if (ouputReal == 1) {
                hasil = "Tinggi";
            } else {
                hasil = "Rendah";
            }
            learning.setHasil(hasil);
            
            dataSampleDao.updateSigmoid(sigmoidRaport, sigmoidUN, sigmoidWawancara, learning.getIdKoresponden());
            dataSampleDao.updateOutput(learning.getOutput(), learning.getHasil(), learning.getIdKoresponden());
        }

        return "controller?action=DataSample.dnx";
    }
}
