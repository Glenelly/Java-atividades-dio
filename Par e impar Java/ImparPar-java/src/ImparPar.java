import java.util.Scanner;
public class ImparPar {
    /*
     * Faça um programa que peça N números inteiros 
     * calcule e mostre a quantidade de números pares 
     * e a quantidade de númeors impares.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

            int quantidadeNumeros;
            int count = 0;
            int numero;
            int quantidadePares = 0; 
            int quantidadeImpares = 0;

                System.out.println("Quantidade de números: ");
                    quantidadeNumeros = scan.nextInt();
            
            do {
                System.out.println("Número: ");
                    numero = scan.nextInt();


                        if (numero % 2 == 0) quantidadePares++; // quantidadePares = quantidadePares + 1;



                        else quantidadeImpares++;

                    count++;
            }while(count < quantidadeNumeros);

                System.out.println("Quantidade Par: " + quantidadePares);
                System.out.println("Quantidade Impar: " + quantidadeImpares);

    }
}
