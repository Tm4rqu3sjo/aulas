
import java.util.Scanner;

public class classe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        while (!vitoria(tabuleiro) || !velha(tabuleiro)) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador X: entre com a posição que gostaria de iniciar o jogo:");
            int posicao = scan.nextInt();

            if((posicao>8)||(posicao<8)||(posicao == ' '))
                System.out.println("Posição inválida\nPosições disponíveis: 1, 2, 3, 4, 5, 6, 7, 8\n");

        }
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {

        int x=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("|" +(x++));
                System.out.printf("  " + tabuleiro[i][j]);
                System.out.printf("|");
            }
            System.out.printf("\n");
        }

    }

    public static boolean vitoria (char[][]tabuleiro) {

        //if((tabuleiro[0][0] == 'X' && tabuleiro [0][1] == 'X' && tabuleiro [0][2] == 'X') || () || () ) //linhas
        return true;

    }

    public static boolean velha(char [][] tabuleiro){
        return false;

    }

}

