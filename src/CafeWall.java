import java.awt.*;
//test push
public class CafeWall {
    //Do not remove the static variable MORTAR
    //You can change the value to either 1 or 2 (Your code should work for both cases)
    // do NOT remove this line OR change the variable name - you CAN change the value
    public static Integer MORTAR = 2;

    public static void main(String[] args) {
        // Pixels and parameter of drawing being 650 by 420
        DrawingPanel panel = new DrawingPanel(650,420);
        // Color of background being Gray
        panel.setBackground(Color.GRAY);
        Graphics g = panel.getGraphics();
        // This is the paramters of the drawing panel of CafeWall is the dimensions and background given below
        drawRow(3, 25, 0, 0, g);
        drawRow(4, 35, 40, 80, g);
        drawGrid(0, 5, 20, 20, 140, g);
        drawGrid(15, 3, 25, 250, 180, g);
        drawGrid(15, 5, 20, 425, 200, g);
        drawGrid(30, 2, 30, 450, 20, g);
    }
    // This gives us the row and covers of the rows in order to make it have multiple stacks of pixel backgrounds on the Cafe Wall
    public static void drawRow(int number, int size, int x, int y, Graphics g) {
        for (int boxes = 0; boxes < number; boxes ++) {
            g.setColor(Color.BLACK);
            g.fillRect(x + 2 * boxes * size, y, size, size);
            g.setColor(Color.WHITE);
            g.fillRect(x + 2 * boxes * size + size, y, size, size);
            g.setColor(Color.BLUE);
            g.drawLine(x + 2 * boxes * size, y, x + 2 * boxes * size + size, y + size);
            g.drawLine(x + 2 * boxes * size, y + size, x + 2 * boxes * size + size, y);
        }
    }
    //This draws out the overall grid that we will be using to draw the Cafe Wall on, giving the background and surface to put our painting on
    public static void drawGrid(int offset, int number, int size, int x, int y, Graphics g) {
        for (int i = 0; i < number * 2; i++) {
            drawRow(number, size, x + offset / 2 - (offset * (int) Math.pow(-1.0, i)) / 2, y + i * (size + MORTAR), g);
        }
    }

}
