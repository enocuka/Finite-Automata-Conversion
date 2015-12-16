
package javafxapplication3;

import java.util.ArrayList;
import javafx.scene.control.Button;

/**
 *
 * @author enocuka
 */
class Stateauto extends Button {
   
   
   private ArrayList<Stateauto> state;
   private ArrayList<Arrow> inarrow;
   private ArrayList<Arrow> outarrow;
   private Entryarrow entryarrow;
   private   String normalstyle;
   private   String finalstyle;
   private   Boolean statefinal;
   
   public Stateauto(String name,double x, double y){
       
       state = new ArrayList<Stateauto>();
       inarrow = new ArrayList<Arrow>();
       outarrow = new ArrayList<Arrow>();
       statefinal = false;
       this.normalstyle = "-fx-background-radius: 50;-fx-border-radius: 50;-fx-border-width:10;";
       this.finalstyle = "-fx-background-radius: 50;-fx-border-radius: 50;-fx-border-width:10;-fx-border-color:black;";
       this.setText(name);
       this.wrapTextProperty().setValue(true);
       this.setStyle(normalstyle);
       this.setPrefSize(100, 100);
       this.setLayoutX(x);
       this.setLayoutY(y);
   }

    public Entryarrow getEntryarrow() {
        return entryarrow;
    }

    public void setEntryarrow(Entryarrow entryarrow) {
        this.entryarrow = entryarrow;
    }
   

    public ArrayList<Stateauto> getState() {
        return state;
    }

    public void setState(ArrayList<Stateauto> state) {
        this.state = state;
    }
    
   public void addState(Stateauto state) {
        this.state.add(state);
    }

    public Boolean getStatefinal() {
        return statefinal;
    }

    public void setStatefinal(Boolean statefinal) {
        this.statefinal = statefinal;
        if(statefinal) this.setStyle(finalstyle);
        else this.setStyle(normalstyle);
    }

    public void addinarrow(Arrow arrow){
       inarrow.add(arrow);
    }

    public ArrayList<Arrow> getInarrow() {
        return inarrow;
    }
    
    public void setInarrow(ArrayList<Arrow> inarrow) {
        this.inarrow = inarrow;
    }
    
    public void addoutarrow(Arrow arrow){
       outarrow.add(arrow);
    }

    public ArrayList<Arrow> getOutarrow() {
        return outarrow;
    }

   

    public void setOutarrow(ArrayList<Arrow> outarrow) {
        this.outarrow = outarrow;
    }
    
    public void deletearrow(){
       inarrow = new ArrayList<Arrow>();
       outarrow = new ArrayList<Arrow>();
    }
    
    @Override
    public String toString(){
        return this.getText();
    }

   
}
    

