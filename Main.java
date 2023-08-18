import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main (String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1000, 1000);
        frame.setVisible(true);
        
        for(int i=0; i<50;i++ ){
            add(new RedSquare());
            add(new BlueSquare());
        
        }
    }
}
