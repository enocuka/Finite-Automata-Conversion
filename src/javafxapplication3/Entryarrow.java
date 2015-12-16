/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;


import javafx.scene.shape.Line;

/**
 *
 * @author enocuka
 */
public class Entryarrow  {
    
    private Stateauto endstate;
    private Line line1;
    private Line line2;
    
    private double linestartx ;
    private double linestarty ;
    private double lineendx  ;
    private double lineendy ;
    
    public Entryarrow( Stateauto ea){
            endstate = ea;
            linestartx = endstate.getLayoutX() + (endstate.getHeight()/ 2);
            linestarty = endstate.getLayoutY() + 20;
            lineendx = endstate.getLayoutX() + (endstate.getHeight() / 2);
            lineendy = endstate.getLayoutY();
            line1 =  new Line(lineendx, lineendy, lineendx - 10, lineendy - 10);
            line2 = new Line(lineendx, lineendy, lineendx + 10, lineendy - 10);
            
        }
    
    void moveline(){
        
        linestartx = endstate.getLayoutX() + (endstate.getHeight()/ 2);
            linestarty = endstate.getLayoutY() + 20;
            lineendx = endstate.getLayoutX() + (endstate.getHeight() / 2);
            lineendy = endstate.getLayoutY();
        
        line1.setStartX(lineendx);
        line1.setStartY(lineendy);
        line1.setEndX(lineendx - 10);
        line1.setEndY(lineendy - 10);
            
        line2.setStartX(lineendx);
        line2.setStartY(lineendy);
        line2.setEndX(lineendx + 10);
        line2.setEndY(lineendy - 10);
    }
 

    public Line getLine1() {
        return line1;
    }

    public Line getLine2() {
        return line2;
    }

    public Stateauto getEndstate() {
        return endstate;
    }

    public void setEndstate(Stateauto endstate) {
        this.endstate = endstate;
    }


}
