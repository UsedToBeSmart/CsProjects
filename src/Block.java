package src;
import java.awt.*;

public class Block extends Rectangle{
    //type of block
   public int groundID;
   public int airID;

   public Block(int x,int y,int width, int height, int g,int a){
    setBounds(x,y,width,height);
    this.groundID=g;
    this.airID=a;
   }
   public void draw(Graphics g){
    g.drawRect(x, y, width, height);

    if(airID != Value.airAir){

    }
   }
   
}
