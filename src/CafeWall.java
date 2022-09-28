import java.awt.*;

public class CafeWall {
    //define the gap between rows
    public static final int MORTAR = 2;

    public static void main(String[] args){
        // set the panel and background
        DrawingPanel panel = new DrawingPanel(650, 420);
        panel.setBackground(Color.GRAY);
        Graphics g = panel.getGraphics();

        //draw upper left row
        drawRow(0, 0, 3, 25, g);
        //draw middle left row
        drawRow(40,80,4,35,g);

        //draw lower left grid
        drawGrid(20,140,5,20,g,0);

        //draw upper right grid
        drawGrid(450,20,2,30,g,30);

        //draw lower middle grid
        drawGrid(250,180,3,25,g,15);

        //draw lower right grid
        drawGrid(425,200,5,20,g,15);
    }

    //method to draw one row
    public static void drawRow(int x, int y, int numPairs, int size, Graphics g){
        //draw a row
        for(int i = 1; i <= numPairs; i++){
            //draw one black box
            g.setColor(Color.BLACK);
            g.fillRect(x+(i-1)*2*size, y, size, size);

            //draw blue X in black box
            g.setColor(Color.BLUE);
            g.drawLine(x+(i-1)*2*size, y, x+(i-1)*2*size+size, y+size);
            g.drawLine(x+(i-1)*2*size, y+size, x+(i-1)*2*size+size, y);

            //draw one white box
            g.setColor(Color.WHITE);
            g.fillRect(x+(i-1)*2*size+size, y, size, size);
        }

    }

    //method to draw one grid
    public static void drawGrid(int x, int y, int numPairs, int size, Graphics g, int offset){
        //draw a grid
        for(int j = 1; j <= numPairs; j++){
            //draw the first row
            drawRow(x,y+(j-1)*2*size+4*(j-1),numPairs,size,g);
            //draw the second row
            drawRow(x+offset,y+(j-1)*2*size+4*(j-1)+size+MORTAR,numPairs,size,g);
        }
    }

}
