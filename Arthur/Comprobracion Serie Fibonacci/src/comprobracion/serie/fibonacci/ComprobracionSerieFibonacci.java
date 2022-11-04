/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comprobracion.serie.fibonacci;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ComprobracionSerieFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int[] numero = new int[10];
        int index=0;
        System.out.println("Introduce 10 numeros");
        do{
            System.out.println("Numero: " + (index+1));
            numero[index] = sc.nextInt();
            index+=1;
        }while(index<10);
        
                
         
        for (int i = 0; i < 10; i++) {
            int num1 = 0, num2 = 1, suma = 1;
            while(true){                
                //primero sumamos
                suma = num1 + num2;
                //Despues, cambiamos la segunda variable por la primera
                num1 = num2;
                //Por ultimo, cambiamos la suma por la segunda variable
                num2 = suma;
                
                if(numero[i] == suma || numero[i] == 0){
                    System.out.println("El numero " + numero[i] + " SI pertenece a la serie de fibonacci");
                    break;
                }else if(suma > numero[i]){
                    System.out.println("El numero " + numero[i] + " NO pertenece a la serie de fibonacci");
                    break;
                }
            }
                                                                           
        }
        
    }
    
    
    
    
}
