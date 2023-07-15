package Aula_dois;

import Aula_dois.Animais.Cachorro;
import Aula_dois.Animais.Gato;
import Aula_dois.Animais.Passaro;
import Aula_dois.Lojas.Petshop;


public class Main {
    public static void main(String[] args) {

        Cachorro cachorroUm = new Cachorro("Puppy", "Marrom", 20, 2.5, 5, "neutro");
        Gato gatoUm = new Gato("pedro", "Laranja", 20, 10.2, "neutro");
        Passaro passaroUm = new Passaro("peter", "verde", 2, 1.2, "feliz");

        cachorroUm.soar();
        gatoUm.soar();
        passaroUm.soar();

        Petshop petshop = new Petshop();

        petshop.deixarNoHotel(cachorroUm);
        System.out.println(cachorroUm.getEstadoDeEspirito());

        petshop.darBanho(cachorroUm);
        System.out.println(cachorroUm.getEstadoDeEspirito());

        petshop.tosar(cachorroUm);
        System.out.println(cachorroUm.getEstadoDeEspirito());


        /*
        System.out.println("O cachorro pegou uma " + cachorroUm.pegar());
        System.out.println("O cachorro está: " +cachorroUm.interagir("carinho"));
        System.out.println("O cachorro está: " + cachorroUm.interagir("vai dormir"));
*/
    }
}
