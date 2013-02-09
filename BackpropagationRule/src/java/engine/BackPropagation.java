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
import dao.DatabaseConection;
import dao.ParameterDao;

/**
 *
 * @author DanyCandra
 */
public class BackPropagation {

    BackpropagationDao backpropagation = new BackpropagationDao(DatabaseConection.getConnection());
    ParameterDao parameterDao = new ParameterDao(DatabaseConection.getConnection());
    private int jumlah_data;
    // Unit Input 2
    private int unit_input;
    // Unit Hidden 2
    private int unit_hidden;
    private int iterasi;
    // Unit Output 1
    private int unit_output;
    private double learningRate;
    private double targetError;
    private int epoh;
    private double mse;

    public double getMse() {
        return mse;
    }

    public void setMse(double mse) {
        this.mse = mse;
    }

    public double getLearningRate() {
        return learningRate;
    }

    public void setLearningRate(double learningRate) {
        this.learningRate = learningRate;
    }

    public double getTargetError() {
        return targetError;
    }

    public void setTargetError(double targetError) {
        this.targetError = targetError;
    }

    public int getEpoh() {
        return epoh;
    }

    public void setEpoh(int epoh) {
        this.epoh = epoh;
    }

    public int getIterasi() {
        return iterasi;
    }

    public void setIterasi(int iterasi) {
        this.iterasi = iterasi;
    }

    public int getJumlah_data() {
        return jumlah_data;
    }

    public void setJumlah_data(int jumlah_data) {
        this.jumlah_data = jumlah_data;
    }

    public int getUnit_input() {
        return unit_input;
    }

    public void setUnit_input(int unit_input) {
        this.unit_input = unit_input;
    }

    public int getUnit_hidden() {
        return unit_hidden;
    }

    public void setUnit_hidden(int unit_hidden) {
        this.unit_hidden = unit_hidden;
    }

    public int getUnit_output() {
        return unit_output;
    }

    public void setUnit_output(int unit_output) {
        this.unit_output = unit_output;
    }

    //penentuan berhenti atau lanjut
    double hitungError(double x[][], double v0[], double v[][], double w0[], double w[][], double t[]) throws IndexOutOfBoundsException {

        double z_in[] = new double[unit_hidden];
        //Input pada Hidden (z)
        double z[] = new double[z_in.length];

        double akumY = 0;
        //~ itung z_in dan z
        for (int h = 0; h < jumlah_data; h++) {
            for (int j = 0; j < unit_hidden; j++) {
                //itung sigma xi vij
                double jum_xv = 0;
                for (int i = 0; i < unit_input; i++) {
                    double cc = x[h][i] * v[i][j];
                    jum_xv = jum_xv + cc;
                    //System.out.println(x[h][j]);
                }
                z_in[j] = v0[j] + jum_xv;
                //itung z
                z[j] = 1 / (1 + (double) Math.exp(-z_in[j]));//fungsi aktivasi sigmoid biner
                // System.out.println(" dan z= "+z[j]);
            }

            double y_in[] = new double[unit_output];
            //Output pada Output (y)
            double y[] = new double[y_in.length];

            //~ itung y_in dan y     (output)
            double cxc = 0;
            for (int k = 0; k < unit_output; k++) {
                double jum_zw = 0;
                for (int j = 0; j < unit_hidden; j++) {
                    double cc = z[j] * w[j][k];
                    jum_zw = jum_zw + cc;
                }
                y_in[k] = w0[k] + jum_zw;
                y[k] = 1 / (1 + (double) Math.exp(-y_in[k]));
                akumY = akumY + Math.pow((t[h] - y[k]), 2);
                //System.out.println(t[h]+"-"+y[k]+"="+(t[k]-y[k]));
            }
        }
        double E = 0.5 * akumY;
        //System.out.println(E);
        return E;
    }

    public void learn(double x[][], double v0[], double v[][], double w0[], double w[][], double t[]) throws IndexOutOfBoundsException {

        double z_in[] = new double[unit_hidden];
        //Input pada Hidden (z)
        double z[] = new double[z_in.length];

        double y_in[] = new double[unit_output];
        //Output pada Output (y)
        double y[] = new double[y_in.length];


        //Delta Bias pada unit Hidden (bHx)  --- untuk perbaikan bias Hidden
        double v0x[] = new double[v0.length];
        //Bobot antara Input-HIdden (v)

        //Delta Bobot antara Input-HIdden (vx) --- untuk perbaikan  bobot Input-Hidden
        double vx[][] = new double[v.length][v[0].length];
        //Kesalahan pada setelah Hidden (Err_z)
        double Err_in[] = new double[unit_hidden];
        //Kesalahan pada Hidden (Err_z)
        double Err_z[] = new double[unit_hidden];
        //------ output
        //Unit Output pada Output (y_in)
        //Bias pada unit Output (bO)

        //Delta Bias pada unit Output (bOx)  ---- untuk perbaikan bias pada Output
        double w0x[] = new double[w0.length];
        //Bobot antara Hidden-Output (w)

        //Delta Bobot antara Hidden-Output (wx) --- untuk perbaikan bobot Hidden-Output
        double wx[][] = new double[w.length][w[0].length];
        //Kesalahan pada Ouput (Err_y)
        double Err_y[] = new double[unit_output];
        //------------- aha
        //Minimum Error Kuadrat ERR
        double ERR;

        int iterasi = 0;
        double vAkhir = 0.0;
        double wAkhir = 0.0;
        double v0Akhir = 0.0;
        double w0Akhir = 0.0;
        do {
            //~ itung z_in dan z
            iterasi = iterasi + 1;

            for (int h = 0; h < jumlah_data; h++) {
                for (int j = 0; j < unit_hidden; j++) {
                    //itung sigma xi vij
                    double jum_xv = 0;
                    for (int i = 0; i < unit_input; i++) {
                        double cc = x[h][i] * v[i][j];
                        jum_xv = jum_xv + cc;
                    }
                    z_in[j] = v0[j] + jum_xv;
                    //itung z
                    z[j] = 1 / (1 + (double) Math.exp(-z_in[j]));
                }

                //~ itung y_in dan y     (output)
                double cxc = 0;
                for (int k = 0; k < unit_output; k++) {
                    double jum_zw = 0;
                    for (int j = 0; j < unit_hidden; j++) {
                        double cc = z[j] * w[j][k];
                        jum_zw = jum_zw + cc;
                    }
                    y_in[k] = w0[k] + jum_zw;
                    y[k] = 1 / (1 + (double) Math.exp(-y_in[k]));
                    //System.out.println(y[k]);
                }
                //System.out.println(y[0]);

                //ngitung error output dan delta bias dan delta bobot
                for (int k = 0; k < unit_output; k++) {
                    //error otput
                    Err_y[k] = (t[h] - y[k]) * y[k] * (1 - y[k]);
                    //System.out.println(Err_y[k]);

                    double cc = 0;
                    for (int j = 0; j < unit_hidden; j++) {
                        //delta bobot hO
                        wx[j][k] = learningRate * Err_y[k] * z[j];
                        //delta bias hO
                        w0x[k] = learningRate * Err_y[k];
                        //System.out.println("delta wx = "+wx[j][k]);
                    }
                    //System.out.println("delta w0 = "+w0x[k]);
                }

                //ngitung error hiden dan delta bias dan delta bobot
                for (int j = 0; j < unit_hidden; j++) {
                    double cc = 0;
                    for (int k = 0; k < unit_output; k++) {
                        cc = cc + (Err_y[k] * w[j][k]);
                    }
                    // eror sebelum output / setelah hidden
                    Err_in[j] = cc;
                    //System.out.println(Err_in[j]);

                    // eror hidden               (t[h]-y[k])*y[k]*(1-y[k]);
                    Err_z[j] = Err_in[j] * (z[j]) * (1 - z[j]);
                    //System.out.println(Err_z[j]);

                    for (int i = 0; i < unit_input; i++) {
                        //delta bobot iH
                        vx[i][j] = learningRate * Err_z[j] * x[h][i];
                        //System.out.println("delta vx = "+vx[i][j]);
                    }
                    //delta bias  hidden
                    v0x[j] = learningRate * Err_z[j];
                    //System.out.println("delta v0 = "+v0x[j]);
                    //System.out.println(learningRate+" "+Err_z[j]+" "+v0x[j]);
                }

                //update bobot dan bias
                //update bobot bias outpuut
                for (int j = 0; j < unit_hidden; j++) {
                    for (int k = 0; k < unit_output; k++) {
                        w[j][k] = w[j][k] + wx[j][k];
                        wAkhir = w[j][k];
                        //w0[k]=w0[k]+w0x[k];
                        // System.out.println("w = "+w[j][k]);
                    }
                }
                for (int k = 0; k < unit_output; k++) {
                    //w[j][k]=w[j][k]+wx[j][k];
                    w0[k] = w0[k] + w0x[k];
                    w0Akhir = w0[k];
                    // System.out.println("w0 = "+w0[k]);
                }

                //update bobot bias hidden
                for (int i = 0; i < unit_input; i++) {
                    for (int j = 0; j < unit_hidden; j++) {
                        v[i][j] = v[i][j] + vx[i][j];
                        vAkhir = v[i][j];
                        //v0[j]=v0[j]+v0x[j];
                        // System.out.println("v = "+v[i][j]);
                    }
                }

                for (int j = 0; j < unit_hidden; j++) {
                    //v[i][j]=v[i][j]+vx[i][j];
                    v0[j] = v0[j] + v0x[j];
                    v0Akhir = v0[j];
                    //System.out.println("v0 = "+v0[j]);
                }
            }
            //System.out.println(hitungError(x,v0,v,w0,w,t));
        } while ((iterasi <= epoh) && (hitungError(x, v0, v, w0, w, t) > targetError));
        double error = hitungError(x, v0, v, w0, w, t);
        System.out.println("error akhir" + error);
        System.out.println("iterasi" + iterasi);

        ///mendapatkan nilai mse dan iterasi
        setIterasi(iterasi);
        setMse(error);

        parameterDao.updateLearning(iterasi, error, 1);

        /// bagian ini untuk ngeprint doang...
        /// jadi dihapus gpp

        for (int j = 0; j < unit_hidden; j++) {
            for (int k = 0; k < unit_output; k++) {
                backpropagation.updateBobotAkhirHiddenOutput(w[j][k], j + 1);
                System.out.println("w akhir [" + j + "] [" + k + "]= " + w[j][k]);
            }
        }
        for (int k = 0; k < unit_output; k++) {
            backpropagation.updateBiasAkhirOutput(w0[k], k + 1);
            System.out.println("w0 [" + k + "]akhir = " + w0[k]);
        }
        for (int i = 0; i < unit_input; i++) {
            for (int j = 0; j < unit_hidden; j++) {
                backpropagation.updateBobotAkhirInputHidden(v[i][0], v[i][1], v[i][2], v[i][3], i + 1);
                System.out.println("v akhir [" + i + "] [" + j + "]= " + v[i][j]);
            }
        }
        for (int j = 0; j < unit_hidden; j++) {
            backpropagation.updateBiasAkhirHidden(v0[j], j + 1);
            System.out.println("v0 akhir [" + j + "]= " + v0[j]);
        }
    }

    public double test(double inputan[], double v0[], double v[][], double w0[], double w[][]) throws IndexOutOfBoundsException {

        double ouputRieal = 0.0;

        double z_in[] = new double[unit_hidden];
        //Input pada Hidden (z)
        double z[] = new double[z_in.length];

        double y_in[] = new double[unit_output];

        //pada hidden
        for (int j = 0; j < unit_hidden; j++) {
            double cc = 0;
            for (int i = 0; i < inputan.length; i++) {
                cc = cc + (inputan[i] * v[i][j]);
            }
            z_in[j] = v0[j] + cc;
            z[j] = 1 / (1 + (double) Math.exp(-z_in[j]));
        }

        //pada ouotpr
        for (int k = 0; k < unit_output; k++) {
            double cc = 0;
            for (int j = 0; j < unit_hidden; j++) {
                cc = cc + z[j] * w[j][k];
            }
            y_in[k] = w0[k] + cc;

            double y = 1 / (1 + (double) Math.exp(-y_in[k]));

            if (y > 0.5) {
                y = 1;
                //System.out.print("Berprestasi ");
            } else {
                y = 0;
                // System.out.print("Tidak Berprestasi ");
            }
            System.out.println("Output " + (double) y);
            ouputRieal = y;
        }

        return ouputRieal;
    }

    public String hasilOutput(Double output) {
        String hasil = "";
        if (output >= 0.5) {
            hasil = "Tinggi";
            //System.out.print("Berprestasi ");
        } else {
            hasil = "Rendah";
            // System.out.print("Tidak Berprestasi ");
        }
        return hasil;
    }
}
