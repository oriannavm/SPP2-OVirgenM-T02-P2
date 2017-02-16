/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.t02.p2;
import java.util.Scanner;
/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables

        Scanner keyboard = new Scanner (System.in);
        int valinferior;
        int valsuperior;
        
        //Datos
        System.out.println("Ingresa valor inferior");
        valinferior=keyboard.nextInt();
        System.out.println("Ingresa valor superior");
        valsuperior=keyboard.nextInt();
        
        //Ejecución del programa
        if (valinferior%2==0){
            System.out.println("El valor inferior es número par");
            } if (valinferior%3==0){
            System.out.println("El valor inferior es divisble entre 3");
                } if (valinferior%5==0){
            System.out.println("El valor inferior es divisble entre 5");
                    }
        if (valsuperior%2==0){
            System.out.println("El valor superior es número par");
            } if (valsuperior%3==0){
            System.out.println("El valor superior es divisble entre 3");
                } if (valsuperior%5==0){
            System.out.println("El valor superior es divisble entre 5");
                }
        System.out.println("Los valores entre estos números son: ");        
        while (valinferior<valsuperior - 1){
            System.out.println(valinferior + 1);
            valinferior = valinferior+1;
            
        }
    }
    
}
