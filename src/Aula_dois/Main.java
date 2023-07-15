package Aula_dois;

import Aula_dois.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorroUm = new Cachorro();
        cachorroUm.setNome("Puppy");
        cachorroUm.setCor("Marrom");
        cachorroUm.setAltura(20);
        cachorroUm.setPeso(2.5);
        cachorroUm.setTamanhoDoRabo(5);

        cachorroUm.latir();
        System.out.println("O cachorro pegou uma " + cachorroUm.pegar());

        System.out.println("O cachorro está: " +cachorroUm.interagir("carinho"));
        System.out.println("O cachorro está: " + cachorroUm.interagir("vai dormir"));
    }
}
