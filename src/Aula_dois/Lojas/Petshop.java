package Aula_dois.Lojas;

import Aula_dois.Animais.Animal;
import Aula_dois.Animais.Cachorro;

public class Petshop {

    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Saudade");
    }
}
