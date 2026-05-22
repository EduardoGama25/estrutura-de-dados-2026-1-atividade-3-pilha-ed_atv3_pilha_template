import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = lerInteiro(scanner, "Escolha uma opcao: ");

            switch (opcao) {
                case 1:
                    executarExercicio01();
                    break;
                case 2:
                    executarExercicio02();
                    break;
                case 3:
                    executarExercicio03(scanner);
                    break;
                case 4:
                    executarExercicio04(scanner);
                    break;
                case 5:
                    executarExercicio05(scanner);
                    break;
                case 6:
                    executarExercicio06(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("=== Exercicios com Pilha ===");
        System.out.println("1 - Pilha com valores fixos");
        System.out.println("2 - Pilha de nomes");
        System.out.println("3 - Remover 10 numeros da pilha");
        System.out.println("4 - Menu interativo de pilha");
        System.out.println("5 - Inverter palavra com pilha");
        System.out.println("6 - Historico de navegacao");
        System.out.println("0 - Sair");
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine();
                return valor;
            }

            System.out.println("Entrada invalida. Digite um numero inteiro.");
            scanner.nextLine();
        }
    }



    private static void executarExercicio01() {
   
    }


    private static void executarExercicio02() {
     
    }


    private static void executarExercicio03(Scanner scanner) {
      
    }


    private static void executarExercicio04(Scanner scanner) {
       
    }

    private static void executarExercicio05(Scanner scanner) {
       
    }


    private static void executarExercicio06(Scanner scanner) {
        
    }

    
}
