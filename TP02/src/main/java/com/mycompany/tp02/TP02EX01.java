/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;
import java.util.Scanner;
/**
 *
 * @author Gabriel Ribeiro - CB3021726
 * 
 * Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.
 */
public class TP02EX01 {
    public static void main (String args[]){
    Scanner scan= new Scanner(System.in);
System.out.println("Digite valores crescentes... \n");
System.out.println("Digite o primeiro valor: "); 
double vl1= scan.nextDouble();
System.out.println("Digite o segundo valor: ");
double vl2 = scan.nextDouble();
while (vl2 <= vl1){
    System.out.println("Digite novamente o segundo valor, que deve ser maior que o primeiro");
    vl2 = scan.nextDouble();
}
System.out.println("Valores digitados corretamente :)");
}
}
