import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * De decomentat pentru a nu transforma in upper case in timpul citirii/scrierii
         * */
        ChangeToUpperCaseInputStream in = new ChangeToUpperCaseInputStream("src/in.txt");
        //FileInputStream in = new FileInputStream("src/in.txt");
        ChangeToUpperCaseOutputStream out = new ChangeToUpperCaseOutputStream("src/out.txt");
        //FileOutputStream out = new FileOutputStream("src/out.txt");

        int c;

        while((c = in.read()) != -1){
            System.out.print((char)c);
            out.write(c);
        }

        in.close();
        out.close();
    }
}