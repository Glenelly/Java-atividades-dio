import java.util.Scanner;
public class Mensagem {
    /*
         * -A partir da hora do dia , informe a mensagem adequada: Bom dia,
         * Boa tarde e Boa noite.
    */
        public static void main(String[] args) throws Exception {
            Scanner scan = new Scanner(System.in);

            float horario; 

            System.out.print("Que horas são: ");
                horario = scan.nextFloat();

                    if(horario >= 1 | horario <= 11){
                        System.out.println("Bom dia!");
                    }else if(horario >= 12 | horario <= 18){
                        System.out.println("Boa tarde!");
                    } else{ 
                        System.out.println("Boa noite!");
                    }
 
        }
}
