package Aula_dois;

import Aula_dois.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorroUm = new Cachorro();
        cachorroUm.nome = "Puppy";
        cachorroUm.cor = "Marrom";
        cachorroUm.altura = 20;
        cachorroUm.peso = 2.5;
        cachorroUm.tamanhoDoRabo = 5;

        cachorroUm.latir();
        System.out.println("O cachorro pegou uma " + cachorroUm.pegar());

        System.out.println(cachorroUm.interagir("carinho"));
        System.out.println(cachorroUm.interagir("vai dormir"));
    }
}
