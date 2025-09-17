package main.java.fag;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== ATIVIDADE JAVA BÁSICO - 10 QUESTÕES ===\n");

        // Executar todas as questões
        questao1_Scanner(scan);
        questao2_Print();
        questao3_For();
        questao4_If(scan);
        questao5_While(scan);
        questao6_Metodos();
        questao7_ScannerIf(scan);
        questao8_ForPrint();
        questao9_WhileScanner(scan);
        questao10_MetodosFor();

        scan.close();
    }

    // ========================================
    // QUESTÃO 1 - SCANNER (Entrada de Dados)
    // ========================================
    public static void questao1_Scanner(Scanner scan) {
        System.out.println("=== QUESTÃO 1 - SCANNER ===");

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Olá " + nome + "! Você tem " + idade + " anos. Seja bem-vindo(a)!");
        System.out.println();
    }

    // ========================================
    // QUESTÃO 2 - PRINT (Saída de Dados)
    // ========================================
    public static void questao2_Print() {
        System.out.println("=== QUESTÃO 2 - PRINT ===");

        for (int i = 1; i <= 10; i++) {
            int resultado = 5 * i;
            System.out.printf("5 x %2d = %2d%n", i, resultado);
        }
        System.out.println();
    }

    // ========================================
    // QUESTÃO 3 - FOR (Laço de Repetição)
    // ========================================
    public static void questao3_For() {
        System.out.println("=== QUESTÃO 3 - FOR ===");

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 até 100 é: " + soma);
        System.out.println();
    }

    // ========================================
    // QUESTÃO 4 - IF (Estrutura Condicional)
    // ========================================
    public static void questao4_If(Scanner scan) {
        System.out.println("=== QUESTÃO 4 - IF ===");
        System.out.print("Digite sua nota (0 a 10): ");
        double nota = scan.nextDouble();

        if (nota >= 7) {
            System.out.println("Parabéns! Você foi APROVADO!");
        } else if (nota >= 4) {
            System.out.println("Você está em RECUPERAÇÃO. Estude mais!");
        } else {
            System.out.println("Infelizmente você foi REPROVADO. Tente novamente!");
        }
        System.out.println();
    }

    // ========================================
    // QUESTÃO 5 - WHILE (Laço de Repetição)
    // ========================================
    public static void questao5_While(Scanner scan) {
        System.out.println("=== QUESTÃO 5 - WHILE ===");
        int numero;
        int soma = 0;

        while (true) {
            System.out.print("Digite um número (0 para parar): ");
            numero = scan.nextInt();

            if (numero == 0) {
                break;
            }
            soma += numero;
        }
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println();
    }

    // ========================================
    // QUESTÃO 6 - MÉTODOS (Função)
    // ========================================
    public static void questao6_Metodos() {
        System.out.println("=== QUESTÃO 6 - MÉTODOS ===");

        System.out.println("Maior entre 10 e 20: " + encontrarMaior(10, 20));
        System.out.println("Maior entre 7 e 3: " + encontrarMaior(7, 3));
        System.out.println("Maior entre 15 e 15: " + encontrarMaior(15, 15));
        System.out.println("Maior entre -5 e 8: " + encontrarMaior(-5, 8));
        System.out.println();
    }

    public static int encontrarMaior(int a, int b) {
        return (a > b) ? a : b;
    }

    // ========================================
    // QUESTÃO 7 - SCANNER + IF
    // ========================================
    public static void questao7_ScannerIf(Scanner scan) {
        System.out.println("=== QUESTÃO 7 - SCANNER + IF ===");
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }
        System.out.println();
    }

    // ========================================
    // QUESTÃO 8 - FOR + PRINT
    // ========================================
    public static void questao8_ForPrint() {
        System.out.println("=== QUESTÃO 8 - FOR + PRINT ===");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println();
    }

    // ========================================
    // QUESTÃO 9 - WHILE + SCANNER
    // ========================================
    public static void questao9_WhileScanner(Scanner scan) {
        System.out.println("=== QUESTÃO 9 - WHILE + SCANNER ===");
        int numero;
        int contadorPositivos = 0;

        while (true) {
            System.out.print("Digite um número (negativo para parar): ");
            numero = scan.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero > 0) {
                contadorPositivos++;
            }
        }
        System.out.println("Quantidade de números positivos digitados: " + contadorPositivos);
        System.out.println();
    }

    // ========================================
    // QUESTÃO 10 - MÉTODOS + FOR
    // ========================================
    public static void questao10_MetodosFor() {
        System.out.println("=== QUESTÃO 10 - MÉTODOS + FOR ===");

        System.out.println("Fatorial de 5 = " + calcularFatorial(5));
        System.out.println("Fatorial de 7 = " + calcularFatorial(7));
        System.out.println();
    }

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}