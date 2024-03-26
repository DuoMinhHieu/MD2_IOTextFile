import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner() {
            @Override
            public Symbol next_token() throws Exception {
                return null;
            }
        };
        String path = String.valueOf(scanner.next_token());

        ReadFileExample readfileEx = new ReadFileExample();
        ReadFileExample ReadfileEx = null;
        ReadfileEx.readFileText(path);
    }
    System.out.println("Hello world!");
}
