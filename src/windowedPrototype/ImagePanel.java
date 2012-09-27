

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

//A class that extends JPanel, allowing it to display a java.awt.Image without using Image Icon
public class ImagePanel extends JPanel{

    private Image image;

    public ImagePanel() {
        image = null;
    }

    public void setImage(Image inImage)
    {
        image = inImage;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters   
    }

}
