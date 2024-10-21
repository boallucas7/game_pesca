import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("==================================");
            System.out.println("     Bem-vindo ao Game de Pesca!");
            System.out.println("==================================");
            System.out.println("1. Iniciar Nova Pescaria");
            System.out.println("2. Ver Inventário");
            System.out.println("3. Loja de Itens");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    iniciarPescaria();
                    break;
                case 2:
                    verInventario();
                    break;
                case 3:
                    lojaDeItens();
                    break;
                case 4:
                    rodando = false;
                    System.out.println("Obrigado por jogar! Até a próxima.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void iniciarPescaria() {
        System.out.println("Você começou a pescaria. Boa sorte!");
        // Lógica de pescaria...
    }

    public static void verInventario() {
        System.out.println("Este é o seu inventário:");
        // Mostrar itens no inventário...
    }

    public static void lojaDeItens() {
        System.out.println("Bem-vindo à loja de itens! O que você deseja comprar?");
        // Lógica para compra de itens...
    }
}
