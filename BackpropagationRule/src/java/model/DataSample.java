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
package model;

/**
 *
 * @author DanyCandra
 */
public class DataSample {

    private String idKoresponden;
    private double nilaiRaport;
    private double nilaiUN;
    private double nilaiWawancara;
    private double sigmoidRaport;
    private double sigmoidUN;
    private double sigmoidWawancara;
    private double nilaiAkhir;
    private int output;
    private String hasil;

    public DataSample() {
    }

    public String getIdKoresponden() {
        return idKoresponden;
    }

    public void setIdKoresponden(String idKoresponden) {
        this.idKoresponden = idKoresponden;
    }

    public double getNilaiRaport() {
        return nilaiRaport;
    }

    public void setNilaiRaport(double nilaiRaport) {
        this.nilaiRaport = nilaiRaport;
    }

    public double getNilaiUN() {
        return nilaiUN;
    }

    public void setNilaiUN(double nilaiUN) {
        this.nilaiUN = nilaiUN;
    }

    public double getNilaiWawancara() {
        return nilaiWawancara;
    }

    public void setNilaiWawancara(double nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }

    public double getSigmoidRaport() {
        return sigmoidRaport;
    }

    public void setSigmoidRaport(double sigmoidRaport) {
        this.sigmoidRaport = sigmoidRaport;
    }

    public double getSigmoidUN() {
        return sigmoidUN;
    }

    public void setSigmoidUN(double sigmoidUN) {
        this.sigmoidUN = sigmoidUN;
    }

    public double getSigmoidWawancara() {
        return sigmoidWawancara;
    }

    public void setSigmoidWawancara(double sigmoidWawancara) {
        this.sigmoidWawancara = sigmoidWawancara;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    
    
}
