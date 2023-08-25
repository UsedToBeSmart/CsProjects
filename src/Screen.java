package src;
import java.awt.*;
import javax.swing.*;

//attaches jpanel onto frame
//runnable=thread
public class Screen extends JPanel implements Runnable{
    //new thread object
    public Thread thread = new Thread(this);

    public static Image[] ground=new Image[100];
    public static Image[] air=new Image[100];

    public static int myWidth,myHeight;
    public static boolean isFirst=true;
    public static Room room;
    public Screen(){
        thread.start();        
    }

    public void define(){
        room=new Room();

        for(int i=0;i<tileset_ground.length;i++){
            ground[i]=new ImageIcon("res/ground.jpeg").getImage();
            ground[i]=createImage(new FilteredImageSource(ground[i].getSource(),new CropImageFilter(0,26*i,26,26)));
            //54
        }
    }
    //draw method, called by default by jPanel
    public void paintComponent(Graphics g){
        if(isFirst){
            myWidth=getWidth();
            myHeight=getHeight();
            define();
            isFirst=false;
        }
        //clear the screen
        g.clearRect(0,0,getWidth(),getHeight());

        room.draw(g);
    }

    //game loop
    public void run(){
        while(true){
            if(!isFirst){

            }
            repaint();
            try{
                Thread.sleep(1);
            }catch(Exception e){}
            
        }
    }
}
