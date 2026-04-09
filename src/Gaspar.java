public class Gaspar extends Personagem {
    private final String nome = "Gaspar";
    private final int forca = 14;
    private final int vontade = 10;
    private final int destreza = 14 ;

    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }

    public int getVontade() {
        return vontade;
    }

    public int getDestreza() {
        return destreza;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca violentamente com a sua espada bastarda, causando " + rolarDano() +" de dano!");
    }

    @Override
    public int rolarDano() {
        int dano = (int)(Math.random() * 10);
        return dano;
    }
}
