// Patrick Roraff
// September 21, 2022
//EGR222-A-Software Engineering
// Professor Larry Clement
// Homework #2
// This assignment is designed to Draw a image of a Cafe Wall illusion that is in the size of 650 pixels by 420 pixels with a gray background
// Use source code for reference to image I am deriving to produce from this program (https://learn-us-east-1-prod-fleet02-xythos.content.blackboardcdn.com/5df7f1d815fec/17959246?X-Blackboard-Expiration=1663804800000&X-Blackboard-Signature=FhWVXSL2IfinmknAnQVnoRIC4N1UqBJIHEvFmnGumKQ%3D&X-Blackboard-Client-Id=103873&response-cache-control=private%2C%20max-age%3D21600&response-content-disposition=inline%3B%20filename%2A%3DUTF-8%27%27EGR%2520222%2520-%2520HW2%2520Cafe%2520Wall%2520Specification.v1.01.pdf&response-content-type=application%2Fpdf&X-Amz-Security-Token=IQoJb3JpZ2luX2VjENL%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJGMEQCIHDiLPQNior%2B47src4cqywVrqFiN02%2F%2BcA1KxNRJsO3IAiAK1YylYjMEvrVCByIzyDqM5wk1lRWU6Uy62Az1YlbEMirNBAh7EAIaDDYzNTU2NzkyNDE4MyIMq3gSAiwY8smvwDlYKqoEjFIzpqWXMRtwscWkCW1hNoipK%2FWH32p58InXIDYzVRFOzBW6Y5sgMvnZ78pt%2B1IUvjoRDUxE06zT3qK0W5tN%2FbCyr%2FRoSic9TTMhY%2Bgzo4hgksQTNkNuOqqqoBsVJtnYgb8x7gJIDkxJuuo%2BBvQ1yge5pE4RqppELpWUWE3cZifMFHHV2CoAXcMj2SDQWhb5LPewtA5hP%2FY2hnFyzhnhqLoQVEqx3scV6%2FL0c6GHqIqUj2CahB%2F920jwKJCjAGf%2FM1W9p8yYs4bA9ge8FtKOZfRGf%2B%2FU2ESfTVIkGKHn6Svz0afguCNcEl16iyug1LwAcCzoliyWfJHKsgk0pIDTzRJqZaFkgFqtRhH6D8MR2Yp3pVCwF6V9Lkf9nBEttnuQdc76rQjzvN3vK5m%2FcI1JuTBZnLBBL3vH71IMueHbtA%2FaHH31NJj%2FZwLKffcRPcDOa40Ke6QpfURIu7Pho6l0TTA07gPDzdxx67r1s9baFJH14c7fFzYzBAbxUHN8SdEUUDvjO5s3jDbWu2JdGAYytorFYyC1F1VeVAkFIo0EPmHlElskSCYVkU5Lf%2F15M52mLIDTg6WvvHZHoJv1lejvdr7v742YIIWwQdApFE8a%2BRHWEGcEdLMNua0rIJan0ziJMq6FHn4WpyX8af5vBcffGBXqU0aJ3BinSoAj62dhjBrijkFJQ8YHCm9zCoGXudEr6WQhM69bsPaQkjia5aw0K9DEJ7uNsk%2FvjpMwwqGtmQY6qgGQ3sOSbADTnZLo7fw8SuSUjuJpbeGAkkLWW4YCDXV1CFr1u961ZeI56Se8A6x32%2FMG5M6MR%2BK9vbV2xve1c%2FRip8DYIPppHDZW5poXRpfUWrw5e8tkcmViSK0LtFc2pBOU4f8A9YqCYiiSvG6RiOE5nBpspCnyooUgNf4jXPZIXdLQi1dLr5n%2FWEIbSX0nTEBWu1M1PPvvXZ1dwmYUgu%2Ft%2BfbaXfUHCQKBnA%3D%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20220921T180000Z&X-Amz-SignedHeaders=host&X-Amz-Expires=21600&X-Amz-Credential=ASIAZH6WM4PLZFO2QIGH%2F20220921%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=eb0c5cbc17dc6f54953b143d42d639c201866ae44752d265f74c2b1c5013cea1)
import java.awt.*;

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
