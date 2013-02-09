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
public class DataRule {
    
    private Integer id;
    private double ruleRaport;
    private double ruleUn;
    private double ruleWawancara;
    private int target;
    private int output;
    private String hasil;

    public DataRule() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getRuleRaport() {
        return ruleRaport;
    }

    public void setRuleRaport(double ruleRaport) {
        this.ruleRaport = ruleRaport;
    }

    public double getRuleUn() {
        return ruleUn;
    }

    public void setRuleUn(double ruleUn) {
        this.ruleUn = ruleUn;
    }

    public double getRuleWawancara() {
        return ruleWawancara;
    }

    public void setRuleWawancara(double ruleWawancara) {
        this.ruleWawancara = ruleWawancara;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
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
