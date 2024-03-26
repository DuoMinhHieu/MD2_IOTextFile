package demo.src;
import java.io.*;
import java.util.List;

public class demo {
    public static <User, file> void readFile(User user) {
        File a = new File("co1.dat");
        try {
            InputStream is = new FileInputStream(String.valueOf(a));
            InputStream InputStream = null;
            ObjectInputStream oos = new ObjectInputStream(InputStream);
            oos.readObject();
            oos.close();
            InputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(String.valueOf(a));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static <User> void main(String[]args){
        List<User> readFile;
        System.out.println(1);
    }
}