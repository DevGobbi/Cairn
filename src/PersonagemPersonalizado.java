public class PersonagemPersonalizado extends Personagem{
    private String nome;
    private int forca;
    private int vontade;
    private int destreza;

    public PersonagemPersonalizado(String nome, int forca, int vontade, int destreza) {
        this.nome = nome;
        this.forca = forca;
        this.vontade = vontade;
        this.destreza = destreza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVontade() {
        return vontade;
    }

    public void setVontade(int vontade) {
        this.vontade = vontade;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca e causa " + rolarDano() + " de dano!");
    }
}
