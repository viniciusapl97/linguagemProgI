package aula7.java_logic;

import java.util.Scanner;

public class Main {
    public static void exibirMenu() {
        System.out.println("-----------------------------");
        System.out.println("        MENU DE ESTOQUE      ");
        System.out.println("-----------------------------");
        System.out.println("1. Adicionar novo produto");
        System.out.println("2. Listar produtos em estoque");
        System.out.println("3. Sair");
        System.out.println("-----------------------------");
    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeProduto1 = "";
        int qtdeProduto1 = 0;
        double precoProd1 = 0.0;
        boolean rodando = true;

        while (rodando) {

            exibirMenu();

        }


    }
}