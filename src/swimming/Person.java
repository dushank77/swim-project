package swimming;

public abstract class Person {

    public String name;
    public int age;
    public String gender; // "male" or "female"

    public abstract void setName(String name);

    public abstract void setAge(int age);

    public abstract void setGender(String gender);

    public abstract String getName();

    public abstract int getAge();

    public abstract String getGender();

}
