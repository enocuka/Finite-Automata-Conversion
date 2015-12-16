
package javafxapplication3;

import java.util.ArrayList;
import java.util.Random;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;


import javafx.scene.shape.Line;

/**
 *
 * @author enocuka
 */
public class Arrow  extends Line{
    
    private String alfabet;
    private Stateauto startstate;
    private Stateauto endstate;
    private Line line1;
    private Line line2;
    private Label label;
    private String labeladd;
    private double linestartx = 0;
    private double linestarty = 0;
    private double lineendx = 0;
    private double lineendy = 0;
    private Arrow arrowover;
    private Color color ;
    private ArrayList<Arrow> inarrow ;
    public Arrow(String alf, Stateauto sa, Stateauto ea){
        inarrow = new ArrayList<Arrow>();
        startstate = sa;
        endstate = ea;
        alfabet = alf;
        arrowover = null;
        labeladd = "";
            Random rand = new Random();
            double red = rand.nextDouble();
            double green = rand.nextDouble();
            double blue = rand.nextDouble();
            
            color = new Color(red,green,blue, .99);
            label = new Label(alfabet);
            label.setStyle("-fx-font-size:24px;");
            label.setTextFill(color);
            
        
        if(startstate.getLayoutX() < endstate.getLayoutX()){
            linestartx = startstate.getLayoutX() + startstate.getWidth();
            linestarty = startstate.getLayoutY() + (startstate.getHeight()/2);
            lineendx = endstate.getLayoutX();
            lineendy = endstate.getLayoutY() + (endstate.getHeight()/2);
            line1 = new Line(lineendx,lineendy,lineendx-10,lineendy-10);
            line2 = new Line(lineendx,lineendy,lineendx-10,lineendy+10);
            line1.setStroke(color);
            line1.setStrokeWidth(3);
            line2.setStroke(color);
            line2.setStrokeWidth(3);
            label.setLayoutX(line1.getEndX() - 15);
            label.setLayoutY(line1.getEndY() + 15);
        }
        else if(startstate.getLayoutX() > endstate.getLayoutX() ){
                
            linestartx = startstate.getLayoutX();
            linestarty = startstate.getLayoutY() + (startstate.heightProperty().getValue()/2);
            lineendx = endstate.getLayoutX() + endstate.getWidth();
            lineendy = endstate.getLayoutY() + (endstate.getHeight()/2);
            line1 = new Line(lineendx,lineendy,lineendx+10,lineendy-10);
            line2 = new Line(lineendx,lineendy,lineendx+10,lineendy+10);
            line1.setStroke(color);
            line1.setStrokeWidth(3);
            line2.setStroke(color);
            line2.setStrokeWidth(3);
            label.setLayoutX(line1.getEndX() + 15);
            label.setLayoutY(line1.getEndY() + 15 );
        }
        else if(startstate.getLayoutX() == endstate.getLayoutX()){
            linestartx = startstate.getLayoutX();
            linestarty = startstate.getLayoutY() + (startstate.getHeight()/2);
            lineendx = endstate.getLayoutX();
            lineendy =endstate.getLayoutY() + (endstate.getHeight()/2);
            if(startstate.getLayoutY() < endstate.getLayoutY()){
            line1 = new Line(lineendx,lineendy,lineendx-10,lineendy-10);
            line2 = new Line(lineendx,lineendy,lineendx+10,lineendy-10);
            line1.setStroke(color);
            line1.setStrokeWidth(3);
            line2.setStroke(color);
            line2.setStrokeWidth(3);
            label.setLayoutX(line1.getEndX() - 15);
            label.setLayoutY(line1.getEndY() - 15);
            }
            else{
                line1 = new Line(lineendx,lineendy,lineendx-10,lineendy+10);
                line2 = new Line(lineendx,lineendy,lineendx+10,lineendy+10);
                line1.setStroke(color);
                line1.setStrokeWidth(3);
                line2.setStroke(color);
                line2.setStrokeWidth(3);
                label.setLayoutX(line1.getEndX() -15);
                label.setLayoutY(line1.getEndY() +15);
            }
        }
        this.setStartX(linestartx);
        this.setStartY(linestarty);
        this.setEndX(lineendx);
        this.setEndY(lineendy);
        this.setStroke(color);
        this.setStrokeWidth(3);
        
    }
    
    void moveline(){
        if(startstate.getLayoutX() < endstate.getLayoutX()){
            linestartx = startstate.getLayoutX() + startstate.getWidth();
            linestarty = startstate.getLayoutY() + (startstate.getHeight()/2);
            lineendx = endstate.getLayoutX();
            lineendy = endstate.getLayoutY() + (endstate.getHeight()/2);
            
            line1.setStartX(lineendx);
            line1.setStartY(lineendy);
            line1.setEndX(lineendx-10);
            line1.setEndY(lineendy-10);
            
            line2.setStartX(lineendx);
            line2.setStartY(lineendy);
            line2.setEndX(lineendx-10);
            line2.setEndY(lineendy+10);
            
            label.setLayoutX(line1.getEndX() - 15);
            label.setLayoutY(line1.getEndY() + 15);
        }
        else if(startstate.getLayoutX() > endstate.getLayoutX() ){
                
            linestartx = startstate.getLayoutX();
            linestarty = startstate.getLayoutY() + (startstate.heightProperty().getValue()/2);
            lineendx = endstate.getLayoutX() + endstate.getWidth();
            lineendy = endstate.getLayoutY() + (endstate.getHeight()/2);
            
            line1.setStartX(lineendx);
            line1.setStartY(lineendy);
            line1.setEndX(lineendx + 10);
            line1.setEndY(lineendy - 10);
            
            line2.setStartX(lineendx);
            line2.setStartY(lineendy);
            line2.setEndX(lineendx + 10);
            line2.setEndY(lineendy+  10);
            
            label.setLayoutX(line1.getEndX() + 15);
            label.setLayoutY(line1.getEndY() + 15 );
        }
        else if(startstate.getLayoutX() == endstate.getLayoutX()){
            linestartx = startstate.getLayoutX();
            linestarty = startstate.getLayoutY() + (startstate.getHeight()/2);
            lineendx = endstate.getLayoutX();
            lineendy =endstate.getLayoutY() + (endstate.getHeight()/2);
            if(startstate.getLayoutY() < endstate.getLayoutY()){
            
            line1.setStartX(lineendx);
            line1.setStartY(lineendy);
            line1.setEndX(lineendx - 10);
            line1.setEndY(lineendy - 10);
            
            line2.setStartX(lineendx);
            line2.setStartY(lineendy);
            line2.setEndX(lineendx + 10);
            line2.setEndY(lineendy - 10);
            
            label.setLayoutX(line1.getEndX() - 15);
            label.setLayoutY(line1.getEndY() - 15);
            }
            else{
                
                line1.setStartX(lineendx);
                line1.setStartY(lineendy);
                line1.setEndX(lineendx - 10);
                line1.setEndY(lineendy + 10);
            
                line2.setStartX(lineendx);
                line2.setStartY(lineendy);
                line2.setEndX(lineendx + 10);
                line2.setEndY(lineendy + 10);
                
                label.setLayoutX(line1.getEndX() -15);
                label.setLayoutY(line1.getEndY() +15);
            }
        }
        this.setStartX(linestartx);
        this.setStartY(linestarty);
        this.setEndX(lineendx);
        this.setEndY(lineendy);
        label.setText(alfabet + labeladd);
        
    }

    public Line getLine1() {
        return line1;
    }

    public Line getLine2() {
        return line2;
    }

    public Label getLabel() {
        return label;
    }

    public Stateauto getStartstate() {
        return startstate;
    }

    public void setStartstate(Stateauto startstate) {
        this.startstate = startstate;
    }

    public Stateauto getEndstate() {
        return endstate;
    }

    public void setEndstate(Stateauto endstate) {
        this.endstate = endstate;
    }

    public String getAlfabet() {
        return alfabet;
    }

    public void setAlfabet(String alfabet) {
        this.alfabet = alfabet;
    }

    public Arrow getArrowover() {
        return arrowover;
    }

    public void setArrowover(Arrow arrowover) {
        this.arrowover = arrowover;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getLabeladd() {
        return labeladd;
    }

    public void setLabeladd(String labeladd) {
        this.labeladd = labeladd;
    }
    
    public void setinarrow(Arrow a){
        inarrow.add(a);
        
    }
    public void setarrows(ArrayList<Arrow> a){
        inarrow = a;
    }
    public ArrayList<Arrow> getinarrow(){
        return inarrow;
    }
    void addletterinlabel(String s){
        System.out.println("shkronja qe do shtohet : " +s);
        System.out.println("shte eshte :" +labeladd);
        labeladd = labeladd+ "," +s; 
        label.setText(alfabet + labeladd);
    }
    void deleteletterinlabel(String s){
        int poz = labeladd.indexOf(s);
         System.out.println("poz eshte :" +poz);
        String tmp = labeladd;
         labeladd = "";
        for(int i=0;i<tmp.length();i++){
            if(i != poz && i != poz - 1)
                labeladd += tmp.charAt(i);
            
        }
        System.out.println("shte eshte :" +labeladd);
        label.setText(alfabet + labeladd);
    }
    
    @Override
    public String toString(){
        return "{" + startstate.getText() + "," + alfabet + "," + endstate.getText() + "}";
    }

    
}
