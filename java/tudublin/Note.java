
package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Note extends PApplet{
    
    
    // decalring encapsulated class feilds/attriburtes.
    private char note; 
    private int duration; 

    // creating default constructor. 
    public Note(){
    }// end constructor.

    public remnder(PApplet pa){
        float x = PApplet.map(xG, -5, 5, border, pa.width - border);
        pa.stroke(255, 255, 0);
        pa.line(x - 5, y, x + 5, y);
        pa.noFill();
        pa.circle(x, y);
    }// End method.

    // constructor chaining.
    public Note(TableRow row){
        this(
            row.getChar('D','E','F','F','F','E','F', 'A', 'A', 'B', 'A', 'F', 'D', 'E', 'D', 'D', 'D')
        );
    }// End constructor.

    // creating constructor.
    public Note(char note, int duration){
        this.note = note;
        this.duration = duration;
    }// End constructor

    
    
    // Implmenting setters and getters. 
    public char getNote(){return note;}// End getter. 
    public void setNote(char note){this.note = note;}// End setter.  
    
    public int getDuration(){return duration;}//  End getter.
    public void setDuration(int duration){this.duration = duration;}// // End setter. 
    
    // Implementing toString.
    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }// End method.  

}// End class. 
    

