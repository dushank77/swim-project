
package swimming;

public class Swimmer extends Person{
   
    String colour;

   
    @Override
    public void setName(){
        name="";
    }
   @Override
    public void setAge(){
        age=0;
    }
   @Override
    public void setGender(){
        gender="";
    }
    
    public void setColour(){
        if (this.gender == "male"){
            colour="RED";
        }else{
            colour="BLUE";
        }
    }
    
    
   public void touchingThePad(){ 
   }
   
   
   public void butterflyStroke(){
   }
   public void backStroke(){
   }
   public void breastStroke(){
   }
   public void freeStyle(){
   }
}

