package Aula_dois.Animais;

public class Gato extends Animal {
    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoEspirito;

    public Gato(String nome, String cor, int altura, double peso, String estadoEspirito) {
        super(nome, cor, altura, peso, estadoEspirito);
        numeroDeGatos ++;
    }

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }

    @Override
    public void soar(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + super.getNome() + '\'' +
                '}';
    }
}
