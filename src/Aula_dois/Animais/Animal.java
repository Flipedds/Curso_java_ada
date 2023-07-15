package Aula_dois.Animais;

public class Animal {
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    void comer(){}
    void dormir(){}
    void soar(){}

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
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

}
