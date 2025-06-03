/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp03;

/**
 *
 * @author Gabriel  Ribeiro CB3021726
 */

    
    public class TesteHora {
    public static void main(String[] args) {        
        Hora hora1 = new Hora();
        System.out.println("\nHora no formato 24h: " + hora1.getHora1());
        System.out.println("Hora no formato 12h: " + hora1.getHora2());
        System.out.println("Segundos totais: " + hora1.getSegundos());

        System.out.println("\nCriando hora com construtor parametrizado:");
        try {
            Hora hora2 = new Hora(00, 00, 00);
            System.out.println("Hora 2 (24h): " + hora2.getHora1());
            System.out.println("Hora 2 (12h): " + hora2.getHora2());
            System.out.println("Segundos totais: " + hora2.getSegundos());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar hora2: " + e.getMessage());
        }

        System.out.println("\nModificando hora1:");
        hora1.setHor(18);
        hora1.setMin(15);
        hora1.setSeg(37);
        System.out.println("Hora 1 atualizada: " + hora1.getHora1());
    }
}
