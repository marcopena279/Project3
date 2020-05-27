import java.awt.Dimension;
import javax.swing.JFrame;


public class Game{
    public static void main(String[] args){
    	//CREATES THE WINDOW
    	Window _w = new Window();
    	//THIS CODE IS WHAT CREATES THE GAME FOR THE USER
    	_w.msg("Welcome to Memory"
    			+ "\n A random sized game will appear and you will have to match all the cards");
        Board b = new Board();
        b.setPreferredSize(new Dimension(500,500)); //need to use this instead of setSize
        b.setLocation(500, 250);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.pack();
        b.setVisible(true);
    }   
}