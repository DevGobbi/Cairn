public class Gaspar extends Personagem {
    private final String nome = "Gaspar";
    private final int forca = 14;
    private final int vontade = 10;
    private final int destreza = 14 ;
    private int hp;
    protected static Gaspar instance;

    private Gaspar() {
    }

    public static Gaspar getInstance() {
        if (instance == null) {
            instance = new Gaspar();
            return instance;
        }
        else {
            return instance;
        }
    }

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
        int dano = rolarDano();
        if (dano == 10) {
            System.out.println("Gaspar violentamente dilacera seu oponente com um ataque devastador que causa "
                    + dano + " de dano!");
        }
        else {
        int caso = (int)(Math.random() * 3);
        switch (caso) {
            case 1:
                System.out.println("Gaspar ataca o seu alvo, causando " + dano + " de dano!");
                break;
            case 2:
                System.out.println("Gaspar dilacera o torso de seu oponente com sua espada, causando " + dano +" de dano!");
                break;
            case 3:
                System.out.println("Gaspar balança sua espada com vigor, atingindo seu oponente e causando" + dano + " de dano!");
                break;
            default:
                System.out.println("Gaspar causa " + dano + " de dano!");
        }
        }
    }

    @Override
    public int rolarDano() {
        int dano = (int)(Math.random() * 10);
        return dano;
    }
}
