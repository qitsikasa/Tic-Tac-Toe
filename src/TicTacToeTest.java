import org.junit.Test;

public class TicTacToeTest {
    @Test
    public void testAgregarFicha() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.agregarFicha('X', 1, 2);
        
    }

    @Test
    public void testAgregarDobleFicha() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.agregarFicha('X', 1, 2);
        ticTacToe.agregarFicha('X', 1, 2);
    }
}
