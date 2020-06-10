/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclefor;

import java.util.Scanner;


/**
 *
 * @author Notebook
 */
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// INICIO 1
//       for( int i = 1; i< 100; i++){
//           
//           System.out.println(i);
//       
//       }
// FIN 1
//
// INICIO 2
//    int inicio,fin;
//    Scanner leer;
    
// guardamos el valor de limite
//    leer = new Scanner(System.in);
//    
//    System.out.println("Inicio: ");
//    inicio = leer.nextInt();
//    
//    System.out.println("Fin: ");
//    fin = leer.nextInt();
//    
//    
//    for( int i = inicio; i <= fin; i++){
//        System.out.println("El valor de i es -> " + i);
//        
//    }
//   FIN 2

//  INICIO 3

    int nuMul,limite;
    Scanner leer;
    
    leer = new Scanner(System.in);
    
    System.out.print("Tabla de multiplicacion de: ");
    nuMul = leer.nextInt();
    
    System.out.print("Limite: ");
    limite = leer.nextInt();
    
    for(int i = 0; i<= 10; i++ ){
        
        System.out.println( i + " por " + nuMul + " = " + (nuMul * i));
    
    }

    // FIN 3
    }
    
}
