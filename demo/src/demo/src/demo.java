package demo.src;
import java.io.*;
import java.util.List;
import com.sun.xml.internal.ws.developer.UsesJAXBContext;

public class demo {
    public static <User, file> void writeFile(User user) {
        File a = new File("co1.dat");
        try {
            OutputStream is = new FileOutputStream(String.valueOf(a));
            OutputStream OutputStream = null;
            ObjectOutputStream oos = new ObjectOutputStream(OutputStream);
            oos.writeObject(user);
            oos.close();
            OutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(String.valueOf(a));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <User> void main(String[]args){
        List<User>  readFile;
        System.out.println(1);
    }

    private static int readFile() {
        return 0;
    }
}