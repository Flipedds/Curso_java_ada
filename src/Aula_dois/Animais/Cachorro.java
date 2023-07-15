package Aula_dois.Animais;

import java.util.Objects;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;

    public void comer(){}
    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        switch (acao) {
            case "carinho" -> this.estadoDeEspirito = "feliz";
            case "vai dormir" -> this.estadoDeEspirito = "bravo";
            case "pisar na patinha" -> this.estadoDeEspirito = "triste";
            default -> this.estadoDeEspirito = "Neutro";
        }
        return this.estadoDeEspirito;


    }

}
