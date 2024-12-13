package org.example;

import java.util.Scanner;

public class verificacaoIdade {
    public static void idade(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if(idade <= 12){
            System.out.println("Criança");
        }else if( idade >= 12 && idade <= 17){
            System.out.println("Adolescente");
        }else if(idade >= 18 && idade <= 59){
            System.out.println("Adulto");
        }else if(idade >= 60){
            System.out.println("Idoso");

        }
    }
}
