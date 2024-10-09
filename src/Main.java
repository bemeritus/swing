import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        ImageIcon image = new ImageIcon("worker.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Bro, dou you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("Ubuntu Mono", Font.PLAIN , 50));
        label.setIconTextGap(100);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.add(label);


    }
}