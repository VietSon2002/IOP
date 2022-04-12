import java.io.Serializable;
import java.util.jar.Attributes.Name;

public class Student extends Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String studenID;
    private String address;

    public Student(){

    }
    public Student(String studenID, String address, String name, String phone, int age){
        super(name, phone, age);
        this.studenID = studenID;
        this.address = address;
    }
    @Override 
    public void display(){
        System.out.println("Student ID: "+studenID);
        System.out.println("Address: "+address);
        System.out.println("Name: "+super.getName());
        System.out.println("Phone: "+super.getAge());
        System.out.println("Age: "+super.getAge());
    }
    @Override
    public String toString(){
        return "StudentID: "+studenID+" Address: "+address +" Name: "+getName()+" Age: "+getAge()+" Phone: "+getPhone();
    }
}
