package src;
import java.awt.*;
//loads up levels
public class Room {
    public int worldWidth=12;
    public int worldHeight=8;
    //if you want your images pixely, set size to 26
    public int blockSize=52;

    public Block[][] block;

    public Room(){
        define();
    }
    public void define(){
        block=new Block[worldHeight][worldWidth];

        for(int y=0;y<block.length;y++){
            for(int x=0;x<block[0].length;x++){
                block[y][x]=new Block((Screen.myWidth/2)-((worldWidth*blockSize)/2)+(x*blockSize),y*blockSize,blockSize,blockSize,Value.groundGrass,Value.airAir);
            }
        }
    }
    public void physic(){

    }
    public void draw(Graphics g){
        for(int y=0;y<block.length;y++){
            for(int x=0;x<block[0].length;x++){
                block[y][x].draw(g);
            }
        }
    }
}
