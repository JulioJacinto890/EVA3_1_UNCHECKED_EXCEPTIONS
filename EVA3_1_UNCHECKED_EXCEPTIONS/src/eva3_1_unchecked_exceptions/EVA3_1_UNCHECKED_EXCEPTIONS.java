/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arithmetic exceptions:
        //division entre cero
        /**
         * System.out.println("INICIANDO EL PROGRAMA"); int x =5, y =0;
         * System.out.println("INICIALIZANDO LAS VARIABLES");
         *
         * int resu = x / y; System.out.println("Calculando la divicion");
         * System.out.println("DIVICION="+ resu);
         */

        //INPUT MISMATCH EXCEPCION (ERROR DE CAPTURA)
        /**
         * Scanner input = new Scanner(System.in); System.out.println("Intruduce
         * un numero"); int nume= input .nextInt(); System.out.println("Tu
         * numero es:"+nume);
         */
        int[] arreglo = new int[5];//Arreglo con 5 posiciones
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; //<--? 5 no es un indice válido,
//                          el arreglo va de 0 a 4

        //NULLPOINTER EXCEPTION
        prueba objPrueba = null;
        System.out.println(objPrueba.x);
    }

}
