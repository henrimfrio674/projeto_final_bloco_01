package LojaBolos.Menu;

import java.util.Scanner;

import LojaBolos.Controller.BoloController;
import LojaBolos.Repository.Bolo;
import LojaBolos.Repository.BoloPronto;

public class Menu {
    private static BoloController boloController = new BoloController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n==== Bem-vindo à Loja de Bolos ====");
            System.out.println("1. Adicionar Bolo");
            System.out.println("2. Listar Bolos");
            System.out.println("3. Atualizar Bolo");
            System.out.println("4. Remover Bolo");
            System.out.println("5. Listar Bolos Removidos");
            System.out.println("6. Restaurar Bolo Removido");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (option) {
                case 1:
                    adicionarBolo();
                    break;
                case 2:
                    listarBolos();
                    break;
                case 3:
                    atualizarBolo();
                    break;
                case 4:
                    removerBolo();
                    break;
                case 5:
                    listarBolosRemovidos();
                    break;
                case 6:
                    restaurarBolo();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void adicionarBolo() {
        System.out.print("Digite o nome do bolo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do bolo: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        System.out.print("Digite o sabor do bolo: ");
        String sabor = scanner.nextLine();

        System.out.print("Digite a cobertura do bolo: ");
        String cobertura = scanner.nextLine();

        BoloPronto bolo = new BoloPronto(0, nome, preco, sabor, cobertura); // ID será gerado pelo controlador
        boloController.adicionarBolo(bolo);
    }

    private static void listarBolos() {
        System.out.println("\n=== Lista de Bolos ===");
        for (Bolo bolo : boloController.listarBolos()) {
            System.out.println(bolo);
        }
    }

    private static void atualizarBolo() {
        System.out.print("Digite o ID do bolo a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Bolo boloExistente = boloController.buscarBoloPorId(id);
        if (boloExistente != null) {
            System.out.print("Digite o novo nome do bolo: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o novo preço do bolo: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha

            System.out.print("Digite o novo sabor do bolo: ");
            String sabor = scanner.nextLine();

            System.out.print("Digite a nova cobertura do bolo: ");
            String cobertura = scanner.nextLine();

            BoloPronto boloAtualizado = new BoloPronto(id, nome, preco, sabor, cobertura);
            boloController.atualizarBolo(boloAtualizado);
        } else {
            System.out.println("Bolo não encontrado.");
        }
    }

    private static void removerBolo() {
        System.out.print("Digite o ID do bolo a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        boloController.removerBolo(id);
    }

    private static void listarBolosRemovidos() {
        System.out.println("\n=== Lista de Bolos Removidos ===");
        for (Bolo bolo : boloController.listarBolosRemovidos()) {
            System.out.println(bolo);
        }
    }

    private static void restaurarBolo() {
        System.out.print("Digite o ID do bolo a ser restaurado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        boloController.restaurarBolo(id);
    }
}
