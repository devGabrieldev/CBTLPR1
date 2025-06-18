/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp04;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gabriel Ribeiro CB3021726
 */

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static final int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final String[] nomesMeses = {
        "janeiro", "fevereiro", "março", "abril", "maio", "junho",
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
    };

    private Scanner sc = new Scanner(System.in);

    // Construtor com entrada do usuário
    public Data() {
        entraAno();
        entraMes();
        entraDia();
        
    }
    
    public void entraAno() {
    int a;
    do {
        System.out.print("Digite o ano: ");
        while (!sc.hasNextInt()) {
            System.out.println("Valor inválido! Digite um número inteiro.");
            sc.next(); // descarta entrada inválida
        }
        a = sc.nextInt();
        if (!validaData(dia == 0 ? 1 : dia, mes == 0 ? 1 : mes, a)) {
            System.out.println("Ano inválido. Tente novamente.");
        }
    } while (!validaData(dia == 0 ? 1 : dia, mes == 0 ? 1 : mes, a));
    ano = a;
}
public void entraMes() {
    int m;
    do {
        System.out.print("Digite o mês: ");
        while (!sc.hasNextInt()) {
            System.out.println("Valor inválido! Digite um número inteiro.");
            sc.next();
        }
        m = sc.nextInt();
        if (!validaData(dia == 0 ? 1 : dia, m, ano)) {
            System.out.println("Mês inválido. Tente novamente.");
        }
    } while (!validaData(dia == 0 ? 1 : dia, m, ano));
    mes = m;
}
 public void entraDia() {
    int d;
    do {
        System.out.print("Digite o dia: ");
        while (!sc.hasNextInt()) {
            System.out.println("Valor inválido! Digite um número inteiro.");
            sc.next();
        }
        d = sc.nextInt();
        if (!validaData(d, mes, ano)) {
            System.out.printf("Dia %d é inválido para %02d/%04d. Tente novamente.\n", d, mes, ano);
        }
    } while (!validaData(d, mes, ano));
    dia = d;
}

    // Construtor com parâmetros
    public Data(int d, int m, int a) {
        if (validaData(d, m, a)) {
            dia = d;
            mes = m;
            ano = a;
        } else {
            System.out.println("Data inválida. Atribuindo valores padrão (01/01/2000).");
            dia = 1;
            mes = 1;
            ano = 2000;
        }
    }   
    // Métodos de entrada com parâmetro
    public void entraDia(int d) {
        if (validaData(d, mes, ano)) dia = d;
        else System.out.println("Dia inválido.");
    }

    public void entraMes(int m) {
        if (validaData(dia, m, ano)) mes = m;
        else System.out.println("Mês inválido.");
    }

    public void entraAno(int a) {
        if (validaData(dia, mes, a)) ano = a;
        else System.out.println("Ano inválido.");
    }
    // Métodos de retorno
    public int retDia() {
        return dia;
    }

    public int retMes() {
        return mes;
    }

    public int retAno() {
        return ano;
    }

    // Formatações
    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String mostra2() {
        return String.format("%02d/%s/%04d", dia, nomesMeses[mes - 1], ano);
    }

    // Ano bissexto
    public boolean bissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Dias transcorridos
    public int diasTranscorridos() {
        int total = 0;
        for (int i = 0; i < mes - 1; i++) {
            if (i == 1 && bissexto()) total += 29;
            else total += diasPorMes[i];
        }
        total += dia;
        return total;
    }

    // Mostra a data atual do sistema
    public void apresentaDataAtual() {
        Date hoje = new Date();
        DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual do sistema: " + formato.format(hoje));
    }

    // Validação de data
    private boolean validaData(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1) return false;
        int maxDias = diasPorMes[m - 1];
        if (m == 2 && ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)) maxDias = 29;
        return d <= maxDias;
    }
}
