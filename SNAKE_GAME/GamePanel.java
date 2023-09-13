package SNAKE_GAME;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

    private int[] snakexlength = new int[750];
    private int[] snakeylength = new int[750];

    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;

    private int moves = 0;
    private int lengthOfSnake = 3;

    private ImageIcon snakeTitle = new ImageIcon(getClass().getResource("snaketitle.jpg"));
    private ImageIcon leftmouth = new ImageIcon(getClass().getResource("leftmouth.png"));
    private ImageIcon rightmouth = new ImageIcon(getClass().getResource("rightmouth.png"));
    private ImageIcon upmouth = new ImageIcon(getClass().getResource("upmouth.png"));
    private ImageIcon snakeimage = new ImageIcon(getClass().getResource("snakeimage.png"));
    private ImageIcon downmouth = new ImageIcon(getClass().getResource("downmouth.png"));

    GamePanel() {

    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);

        // make white borders
        g.setColor(Color.white);
        g.drawRect(24, 10, 851, 55);

        // g.setColor(Color.BLACK);
        // g.fillRect(26, 12, 848, 52);

        // g.setColor(Color.white);
        // g.setFont(new Font("Arial", Font.BOLD, 28));
        // g.drawString("Snake Game", 380, 45);

        g.drawRect(24, 74, 851, 576);

        snakeTitle.paintIcon(this, g, 25, 11);
        g.setColor(Color.black);
        g.fillRect(25, 75, 850, 575);

        if (moves == 0) {
            snakexlength[0] = 100;
            snakexlength[1] = 75;
            snakexlength[2] = 50;

            snakeylength[0] = 100;
            snakeylength[1] = 100;
            snakeylength[2] = 100;
            moves++;
        }

        if (left) {
            leftmouth.paintIcon(this, g, snakexlength[0], snakeylength[0]);
        }
        if (right) {
            rightmouth.paintIcon(this, g, snakexlength[0], snakeylength[0]);
        }
        if (up) {
            upmouth.paintIcon(this, g, snakexlength[0], snakeylength[0]);
        }
        if (down) {
            downmouth.paintIcon(this, g, snakexlength[0], snakeylength[0]);
        }

        for (int i = 1; i < lengthOfSnake; i++) {
            snakeimage.paintIcon(this, g, snakexlength[i], snakeylength[i]);
        }

    }

}
