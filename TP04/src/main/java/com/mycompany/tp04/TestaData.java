/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp04;

/**
 *
 * @author Gabriel Ribeiro CB3021726
 */

public class TestaData {
    public static void main(String[] args) {
        System.out.println("Data digitada pelo usuário:");
        Data data1 = new Data();
        System.out.println("Data no formato 1: " + data1.mostra1());
        System.out.println("Data no formato 2: " + data1.mostra2());
        System.out.println("Ano bissexto? " + data1.bissexto());
        System.out.println("Dias transcorridos no ano: " + data1.diasTranscorridos());
        data1.apresentaDataAtual();

        System.out.println("\nCriando uma data...:");
        Data data2 = new Data(29, 2, 2024);
        System.out.println("Data: " + data2.mostra2());
        System.out.println("Ano bissexto? " + data2.bissexto());
        System.out.println("Dias transcorridos: " + data2.diasTranscorridos());

        System.out.println("\nAlterando componentes:");
        data2.entraDia(15);
        data2.entraMes(10);
        data2.entraAno(2025);
        System.out.println("Nova data: " + data2.mostra1());
    }
}
