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

/**
 *
 * @author DanyCandra
 */
public class Sigmoid {

    /**
     * @param args the command line arguments
     */
    
    public double nilaiRaport(double input) {
        //drajat keanggotaan
        double x = 0.0;

        double bb = 5;
        double ba = 8;

        if (input <= bb) {
            x = 0.0;
        } else if (input >= bb && input <= (bb+ba)/2) {
            x = 2 * Math.pow((input - bb) / (ba - bb),2);
        } else if (input >= (bb+ba)/2 && input <= ba) {
            x =  1-2 * Math.pow((ba-input) / (ba - bb),2);
        } else {
            x = 1.0;
        }
        System.out.println("penyusutan: " + x);
        return x;
    }

    public double nilaiUN(double input) {
        //drajat keanggotaan
        double x = 0.0;

        double bb = 4.5;
        double ba = 8;

        if (input <= bb) {
            x = 0.0;
        } else if (input >= bb && input <= (bb+ba)/2) {
            x = 2 * Math.pow((input - bb) / (ba - bb),2);
        } else if (input >= (bb+ba)/2 && input <= ba) {
            x =  1-2 * Math.pow((ba-input) / (ba - bb),2);
        } else {
            x = 1.0;
        }

        System.out.println("derajat keasaman: " + x);
        return x;
    }
    
    public double nilaiWawancara(double input) {
        //drajat keanggotaan
        double x = 0.0;

        double bb = 6;
        double ba = 8;

        if (input <= bb) {
            x = 0.0;
        } else if (input >= bb && input <= (bb+ba)/2) {
            x = 2 * Math.pow((input - bb) / (ba - bb),2);
        } else if (input >= (bb+ba)/2 && input <= ba) {
            x =  1-2 * Math.pow((ba-input) / (ba - bb),2);
        } else {
            x = 1.0;
        }

        System.out.println("cacat kemasan: " + x);
        return x;
    }
    
    
   
}
