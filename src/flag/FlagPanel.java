package flag;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;


public class FlagPanel extends JPanel {
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.decode("#FF8F1C"));
        g.drawRect(10,10,400,70);
        g.fillRect(10,10,400,70);
        g.setColor(Color.WHITE);
        g.drawRect(10,80,400,70);
        g.fillRect(10,80,400,70);
        g.setColor(Color.decode("#509E2F"));
        g.drawRect(10,150,400,70);
        g.fillRect(10,150,400,70);
        g.setColor(Color.BLACK);

        g.fillRect(10,10,5,540);

        try {
            Image img = ImageIO.read(new FileInputStream("C:\\Users\\22sin\\OneDrive\\Desktop\\a.png"));
            g.drawImage(img,175,80,80,72,null);
            g.setFont(new Font("Lato",Font.BOLD,30));
            g.setColor(Color.BLUE);
            g.drawString("Happy Independence Day !!",25,400);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
