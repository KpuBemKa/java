import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChangeToUpperCaseOutputStream extends FileOutputStream {
    ChangeToUpperCaseOutputStream(String name) throws FileNotFoundException {
        super(name);
    }

    @Override
    public void write(int b) throws IOException {
        super.write(Character.toUpperCase(b));
    }
}
