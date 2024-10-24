public class TicTacToe {
    private boolean[][] tableroVerificado;
    private char[][] tablero;

    public TicTacToe() {
        tableroVerificado = new boolean[3][3];
        tablero = new char[3][3];
    }

    public void agregarFicha(char ficha, int x, int y) {
        tablero[x - 1][y - 1] = ficha;
    }
}
