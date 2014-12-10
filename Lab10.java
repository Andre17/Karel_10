/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <Andre Purits>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab10 {
	 
    public static void clearMaze(Athlete arg) {
		 //TODO Write an algorithm that directs arg to the beeper at the end of the maze
       
       if(arg.rightIsClear()) {
       arg.turnRight();
       arg.move();
       } else if(arg.frontIsClear()) {
       arg.move();
       } else if(arg.leftIsClear()) {
       arg.turnLeft();
       arg.move();
       } else {
       arg.turnAround();
       arg.move();
       }
    }   
	 public static void main(String[] args) {
		 //TODO Open the map 'maze1' or 'maze2' or 'maze3';
		 //TODO Set the display to size 10 by 10
       String map = JOptionPane.showInputDialog("Which maze?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
       Display.setSpeed(10);
		 Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
		 while(!athena.nextToABeeper()) {
         clearMaze(athena);
       }
	 }
}
