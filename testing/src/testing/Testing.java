package testing;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class Testing {
    public static void main(String[] args) {
        int w = 1360/2; 
        int h = 768/2;
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel label1 = new JLabel();
        BufferedImage img = null;
        Image dimg = null;
        Icon c = null;
        AlphaIcon ac = null;
        try {
         img = ImageIO.read(new File("/home/ryzen/NetBeansProjects/testing/src/testing/images/pink.png"));
        }
        catch(IOException e) {
            System.out.print(e);
        }
        label1.setSize(w, h - 100);
        dimg = img.getScaledInstance(label1.getWidth(), label1.getHeight(),Image.SCALE_SMOOTH);
        c = new ImageIcon(dimg);
        ac = new AlphaIcon(c, (float)1.0);
        label1.setIcon(ac);
        
        JLabel label2 = new JLabel();
        label2.setSize(w, h);
        try {
         img = ImageIO.read(new File("/home/ryzen/NetBeansProjects/testing/src/testing/images/girl.jpg"));
        }
        catch(IOException e) {
            System.out.print(e);
        }
        dimg = img.getScaledInstance(label2.getWidth(), label2.getHeight(),Image.SCALE_SMOOTH);
        c = new ImageIcon(dimg);
        ac = new AlphaIcon(c, (float)0.8);
        label2.setIcon(ac);
        f.add(label2);
        f.add(label1);
        f.setVisible(true);
        f.setSize(w + 10, h + 10);
    }
}
