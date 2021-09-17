import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChangeToUpperCaseInputStream extends FileInputStream {

    public ChangeToUpperCaseInputStream(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        if(c != -1){
            return (int)Character.toUpperCase((char)c);
        }else{
            return -1;
        }
    }
}