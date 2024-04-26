/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isc_fundprog_24550008;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ISC_FUNDPROG_24550008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
                        INSTRUCCIONES:
        COMPETIR CONTRA LA COMPUTADORA AL PIEDRA, PAPEL O TIJERA
        */
        double resp;
        int terminar;
        double computadora;
        computadora = Math.random();
        int ganadorU = 0;
        int ganadorC = 0;
        int empate = 0;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("ALICIA ESCALANTE SOSA  No.Control: 24550008");
        System.out.println("");
        do {
            System.out.println("PIEDRA = De 0. 0 a 0.4");
            System.out.println("PAPEL = De 0.5 a 0.7");
            System.out.println("TIJERA = De 0.8 a 1");
            System.out.println("");
            System.out.println("Introduce lo que vas a poner:  ");
            resp = captu.nextDouble();
            System.out.println("La respuesta de la computadora es: "+computadora);
            
            if (resp > computadora) {
                ganadorU++;
                
            }else{
                if (resp < computadora) {
                    ganadorC++;
                    
                }else{
                    if (resp == computadora) {
                       empate++;
                    }
                }
            }
        System.out.println("");
        System.out.println("RESULTADOS:");
        System.out.println("Ganados por la computadora: "+ganadorC);
        System.out.println("Ganados por el usuario: "+ganadorU);
        System.out.println("Empates: "+empate);
        System.out.println("");
        System.out.println("Quieres volver a jugar?  Si = 2  No = 3");
        terminar = captu.nextInt();

            
        if (terminar ==3) {
            System.out.println("Ganados de la computadora: "+ganadorC);
            System.out.println("Ganados del usuario: "+ganadorU);
            System.out.println("Ganados por empate: "+empate);
            System.out.println("");
            System.out.println("GRACIAS POR JUGAR");
        }
        } while (terminar==2);
        
        
    }
    
}
