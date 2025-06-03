/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp03;

/**
 *
 * @author Gabriel Ribeiro CB3021726
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    private static final Scanner sc = new Scanner(System.in);
   
    public Hora() {
        this.hora = lerValor("hora", 0, 23);
        this.min = lerValor("minuto", 0, 59);
        this.seg = lerValor("segundo", 0, 59);
    }
    public Hora(int h, int m, int s) {
        if (validaHora(h)) this.hora = h;
        else throw new IllegalArgumentException("Hora inválida.");

        if (validaMinSeg(m)) this.min = m;
        else throw new IllegalArgumentException("Minuto inválido.");

        if (validaMinSeg(s)) this.seg = s;
        else throw new IllegalArgumentException("Segundo inválido.");
    }
    public void setHor(int h) {
        if (validaHora(h)) this.hora = h;
        else throw new IllegalArgumentException("Hora inválida.");
    }

    public void setMin(int m) {
        if (validaMinSeg(m)) this.min = m;
        else throw new IllegalArgumentException("Minuto inválido.");
    }

    public void setSeg(int s) {
        if (validaMinSeg(s)) this.seg = s;
        else throw new IllegalArgumentException("Segundo inválido.");
    }
    public void setHor() {
        this.hora = lerValor("hora", 0, 23);
    }

    public void setMin() {
        this.min = lerValor("minuto", 0, 59);
    }

    public void setSeg() {
        this.seg = lerValor("segundo", 0, 59);
    }
    
    public int getHor() {
        return this.hora;
    }

    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }
    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }
    public String getHora2() {
        int h = hora % 12;
        if (h == 0) h = 12;
        String periodo = (hora < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h, min, seg, periodo);
    }
    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }
    private boolean validaHora(int h) {
        return h >= 0 && h <= 23;
    }

    private boolean validaMinSeg(int v) {
        return v >= 0 && v <= 59;
    }
    private int lerValor(String nomeCampo, int min, int max) {
        int valor;
        while (true) {
            try {
                System.out.print("Digite o valor de " + nomeCampo + " (" + min + "-" + max + "): ");
                valor = sc.nextInt();
                if (valor >= min && valor <= max) return valor;
                System.out.println("Valor inválido! Deve estar entre " + min + " e " + max + ".");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                sc.next();
            }
        }
    }
}

