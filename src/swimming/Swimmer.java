package swimming;

public class Swimmer extends Person implements butterflyStroke,backStroke,breastStroke,freeStyle{

    public static int swimmerCount=0;
    
    public Swimmer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        swimmerCount++;
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


    public static int getNumber() {
        System.out.println("Number of swimers : "+swimmerCount);
        return swimmerCount;
    }
}
