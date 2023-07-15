package Aula_dois.Animais;

public class Passaro extends Animal {
    static int numeroDePassaros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;


    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        numeroDePassaros ++;
    }

    public static int getNumeroDePassaros() {
        return numeroDePassaros;
    }

    @Override
    public void soar(){
        System.out.println("PIU PIU");
    }
}
