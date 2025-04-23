/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;
import org.apache.commons.math3.linear.*;
import java.util.Scanner;
/**
 *
 * @author Gabriel Ribeiro - CB3021726
 * Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
 */

public class TP02EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        do {
            System.out.print("Digite M ordem da matriz quadrada: ");
            m = scanner.nextInt();
            System.out.print("Digite N ordem da matriz quadrada (N deve ser igual a M): ");
            n = scanner.nextInt();
            if (m != n) {
                System.out.println("Matriz precisa ser quadrada! M deve ser igual a N. Digite novamente!\n");
            }
        } while (m != n || m <= 0);
        double[][] matriz = new double[m][n];
        System.out.println("\nDigite os valores da matriz " + m + "x" + n + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        // Utilizando Apache Commons Math para calcular a inversa
        try {
            RealMatrix realMatrix = MatrixUtils.createRealMatrix(matriz);
            RealMatrix inversa = new LUDecomposition(realMatrix).getSolver().getInverse();

            System.out.println("\nMatriz Inversa:");
            for (int i = 0; i < inversa.getRowDimension(); i++) {
                for (int j = 0; j < inversa.getColumnDimension(); j++) {
                    System.out.printf("%.2f\t", inversa.getEntry(i, j));
                }
                System.out.println();
            }
        } catch (SingularMatrixException e) {
            System.out.println("A matriz não possui inversa (determinante = 0 ou matriz singular).");
        }

        scanner.close();
    }
}
