
package criancaesperanca;

import java.util.Scanner;

public class CriancaEsperanca {

    public static void main(String[] args) {
       int doacao, valor;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a doação desejada:");
        doacao = leia.nextInt();
        switch (doacao){
            case 10:
                System.out.println("Você doou 10 Reais!Obrigado!");
                 break;
            case 15:
                System.out.println("Você doou 15 Reais!obrigado!");
                 break;
            case 20:
                System.out.println("Você doou 20 Reais!obrigado!");
                 break;
            case 40:
                System.out.println("Você doou 40 Reais!Obrigado!");
                 break;
            case 5:
                System.out.println("Qual valor você deseja doar!");
                valor = leia.nextInt();
                                System.out.println("Sua doação foi de:"+valor);

                break;
            default:
                System.out.println("para cancelar a doacao!");
                //alterado da web
                
          
        }
                
    }
    
}
