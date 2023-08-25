package src;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
    public static String title="tower defense";
    public static Dimension size=new Dimension(700,550);

    public Frame(){
        setTitle(title);
        setSize(size);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init();
    }
    
    public void init(){
        //setting screen onto frame
        setLayout(new GridLayout(1,1,0,0));
        //new screen object
        Screen screen=new Screen();
        add(screen);
        setVisible(true);
    }
    public static void main (String[] args) {
        //new frame object
        Frame frame=new Frame();
    }
}
