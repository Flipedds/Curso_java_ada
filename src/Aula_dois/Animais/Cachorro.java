package Aula_dois.Animais;

import java.util.Objects;

public class Cachorro extends Animal {
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        this.tamanhoDoRabo = tamanhoDoRabo;;
        numeroDeCachorros ++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }
    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    @Override
    public void soar(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + super.getNome()+ '\'' +
                '}';
    }
}
