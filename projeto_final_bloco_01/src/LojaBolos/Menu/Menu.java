package LojaBolos.Menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner ler = new Scanner(System.in);
        
        boolean exit = false;

        while (!exit) {
            System.out.println("\n==== Bem-vindo à Loja de Bolos ====");
            System.out.println("1. Adicionar Bolo");
            System.out.println("2. Listar Bolos");
            System.out.println("3. Atualizar Bolo");
            System.out.println("4. Remover Bolo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int option = ler.nextInt();
            ler.nextLine();  // Consumir a nova linha

            switch (option) {
                case 1:
                    ler.nextLine();
                    System.out.print("Informe o novo bolo: ");
                    String NBolo = ler.nextLine();
                    break;
                case 2:

                    System.out.print("Lista de bolos: ");

                    break;
                case 3:
                	System.out.print("Lista de bolos: ");
                    ler.nextLine();
                    System.out.print("Informe o bolo a ser atualizado: ");
                    String ABolo = ler.nextLine();
                    break;
                case 4:
                	System.out.print("Lista de bolos: ");
                    ler.nextLine();
                    System.out.print("Informe o bolo a ser removido: ");
                    String RBolo = ler.nextLine();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        ler.close();
	}

}
