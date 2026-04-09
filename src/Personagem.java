import java.util.Random;

public abstract class Personagem {
    protected String nome;
    protected int forca;
    protected int vontade;
    protected int destreza;

    public void atacar() {
        System.out.println(nome + " ataca e causa " + rolarDano() + " de dano!");
    }

    public int rolarDano() {
        Random random = new Random();
        int dano = (int)(Math.random() * 8);
        return dano;
    }
}
