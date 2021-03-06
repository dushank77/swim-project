package swimming;

public class Spectator extends Person {
    
    public static int spectatorCount=0;

    Spectator(String name, String gender) {
        this.name = name;
        this.gender = gender;
        spectatorCount++;
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
        return age;
    }

    @Override
    public String getGender() {
        return gender;
    }
    
    

    public static int getNumber() {
        System.out.println("Number of spectators : "+spectatorCount);
        return spectatorCount;
    }
}
