import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.List;  

public class QuanLy {
    public static void main(String[] args) throws IOException {
            Student s1 = new Student("20T1020242", "34 Nguyen Sinh Cung", "Viet Son", "0363228610", 20);
            Student s2 = new Student("20T1030265", "10 Doi Cung", "Le Trang", "0361597510", 21);
            Student s3 = new Student("20T9517535", "3 Le Loi", "Thuy Linh", "0363224567", 19);
            Student s4 = new Student("20T7879156", "9 Dien Bien Phu", "Phan Yen", "0363114610", 23);
            Student s5 = new Student("20T6678157", "2 Ba Trieu", "Viet Trung", "0364768610", 24);
            Student s6 = new Student("20T1239782", "100 Nguyen Trai", "Viet Hung", "0336728610", 20);
            try {
                FileOutputStream fo = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Bai 84\\Test.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fo);
                oos.writeObject(s1);
                oos.writeObject(s2);
                oos.writeObject(s3);
                oos.writeObject(s4);
                oos.writeObject(s5);
                oos.writeObject(s6);
                oos.close();
                fo.close();
                FileInputStream fi = new FileInputStream("C:\\Users\\Admin\\Desktop\\Bai 84\\Test.txt");
                ObjectInputStream ois = new ObjectInputStream(fi);
                Student ss = (Student) ois.readObject();
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(s4);
                System.out.println(s5);
                System.out.println(s6);
                ois.close();
                fi.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
    }
}
