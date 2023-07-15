package Aula_dois;

import Aula_dois.Animais.Cachorro;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorroUm = new Cachorro("Puppy", "Marrom", 20, 2.5, 5, "neutro");
        Cachorro cachorroDois = new Cachorro("Puppa", "Marrom", 20, 2.5, 5, "neutro");

        cachorroUm.latir();
        cachorroDois.latir();

        System.out.println("-----------------------------------");
        System.out.println(cachorroUm);
        System.out.println(cachorroDois);
        System.out.println(Cachorro.getNumeroDeCachorros());
/*
        System.out.println("O cachorro pegou uma " + cachorroUm.pegar());
        System.out.println("O cachorro está: " +cachorroUm.interagir("carinho"));
        System.out.println("O cachorro está: " + cachorroUm.interagir("vai dormir"));
*/
    }
}
