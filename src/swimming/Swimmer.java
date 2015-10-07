package swimming;

public class Swimmer extends Person {

    String colour;

    public Swimmer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setColour() {
        if (this.gender == "male") {
            colour = "RED";
        } else {
            colour = "BLUE";
        }
    }

    public void touchingThePad() {
    }

    public void butterflyStroke() {
    }

    public void backStroke() {
    }

    public void breastStroke() {
    }

    public void freeStyle() {
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return age;
    }

    @Override
    public String getGender() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return gender;
    }
}
