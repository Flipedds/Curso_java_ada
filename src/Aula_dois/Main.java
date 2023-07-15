package Aula_dois;

import Aula_dois.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorroUm = new Cachorro("Puppy", "Marrom", 20, 2.5, 5, "neutro");

        cachorroUm.latir();
        System.out.println("O cachorro pegou uma " + cachorroUm.pegar());

        System.out.println("O cachorro está: " +cachorroUm.interagir("carinho"));
        System.out.println("O cachorro está: " + cachorroUm.interagir("vai dormir"));
    }
}
