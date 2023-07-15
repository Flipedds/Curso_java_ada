package Aula_dois.Animais;

import java.util.Objects;

public class Cachorro {
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros ++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }
    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    private String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    private void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void comer(){}
    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        switch (acao) {
            case "carinho" -> setEstadoDeEspirito("feliz");
            case "vai dormir" -> setEstadoDeEspirito("bravo");
            case "pisar na patinha" -> setEstadoDeEspirito("triste");
            default -> setEstadoDeEspirito("neutro");
        }
        return getEstadoDeEspirito();


    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
