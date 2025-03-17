import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        //window variables
        int tileSize = 32;
        int rows = 16;
        int columns = 16;
        int boardWidth = tileSize * columns; // 32*16=512
        int boardHeight = tileSize * rows; // 32*16

        JFrame frame = new JFrame("Space Fight Game");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SpaceFight spaceFight = new SpaceFight();
        frame.add(spaceFight);
        frame.pack();
        spaceFight.requestFocus();
        frame.setVisible(true);
    }
}
