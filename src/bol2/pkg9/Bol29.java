/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2.pkg9;

import java.util.Scanner;

/**
 *
 * @author plagoromani
 */
public class Bol29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          float dinero, b100, b20, b5, m1;
        
        System.out.println("billetes de 100€: ");
        Scanner obx=new Scanner (System.in);
        b100=obx.nextFloat();
        System.out.println("billetes de 20€: ");
        b20=obx.nextFloat();
        System.out.println("Billetes de 5€: ");
        b5=obx.nextFloat();
        System.out.println("Monedas de 1€: ");
        m1=obx.nextFloat();
        
        dinero=b100*100+b20*20+b5*5+m1*1;
        
        System.out.println("dinero:"+dinero);
        
        
        
        
        
        
    }
    
}
