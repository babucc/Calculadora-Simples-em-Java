
package CalculadoraSimples;

import java.util.Scanner;


public class CalculadoraSimples {

   
    public static void main(String[] args) {
        double valor01, valor02, calculo = 0;
        int op;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1- Somar ");
        System.out.println("2- Subtrair");
        System.out.println("3- Dividir");
        System.out.println("4- Multiplicar");
        System.out.println("Informe a operacao desejada:");
        op = entrada.nextInt();
        
        System.out.println("Informe o primeiro valor: ");
        valor01 = entrada.nextDouble();
        System.out.println("Informe o segundo valor:");
        valor02 = entrada.nextDouble();
        
        switch(op){
            case 1:
                calculo = valor01 + valor02;
                break;
            case 2:
                calculo = valor01 - valor02;
                break;
            case 3:
                calculo = valor01 / valor02;
                break;
            case 4:
                calculo = valor01 * valor02;
                break;
        }      
        System.out.println("Resultado: "+calculo);
    }  
}
