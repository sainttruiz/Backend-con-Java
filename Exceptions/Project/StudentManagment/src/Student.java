public class Student{
    private String name;
    private int age;
    private final String ID;

    public Student(String name, int age, String ID){
        this.name=name;
        this.age=age;
        this.ID=ID;
    }

    public String getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    @Override
    public String toString(){
        return ID + " - " + name + " - " + Integer.toString(age) + " años.";
    }
}