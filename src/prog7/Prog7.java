/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog7;

import java.util.Scanner;

/**
 *
 * @author balvarezescudero
 */
public class Prog7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, i, t;
        System.out.print("Nominal=");
        Scanner obx = new Scanner(System.in);
        n = obx.nextInt();
        System.out.print("Interés anual=");
        i= obx.nextInt();
        System.out.print("Nº de anos=");
        t= obx.nextInt();
        System.out.print("Renda mensual="+ (n+i/1200 +12*t));
        
        
    }

}
