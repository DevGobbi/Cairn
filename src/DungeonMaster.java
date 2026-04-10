import java.util.Scanner;

public class DungeonMaster {
    int forca, vontade, destreza;
    void iniciar() {
        menu();
    }



    void menu() {
        System.out.println("Terminal de Combate");
        System.out.println("[1] - Batalhar");
        System.out.println("[2] - Criar Personagem");
        System.out.println("[3] - Sair");
    }

    void navegarMenu() {
        int escolha = 0;
        switch (escolha) {
            case 1:
                iniciarBatalha();
            case 2:
                criarPersonagem();
            case 3:
                return;
        }
    }

    void criarPersonagem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome do seu personagem?");
        String nome = scanner.nextLine();
        int escolha = 0;
        System.out.println("Qual o metodo de geração de atributos?");
        System.out.println("[1] - Escolher um arquetipo");
        System.out.println("[2] - Atribuir manualmente");
        System.out.println("[3] - Atributos aleatorios");
        while (escolha < 4) {
        switch (escolha) {

                case 1:
                    escolherArquetipo(forca, vontade, destreza);
                case 2:
                    atribuirManualmente(forca, vontade, destreza);
                case 3:
                    atributosAleatorios();
            default:
                System.out.println("Comando invalido!");
            }
        }
        }
    int atributosAleatorios(int forca, int vontade, int destreza) {
        forca = 1;
        destreza = 1;
        vontade = 1;
    }
}

