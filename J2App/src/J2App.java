import java.io.IOException;
/**
 * Based on: Oracle, Trail: Essential Classes: Exceptions, Basic I/O, The Java Tutorials Sixth Edition
 * @author Francisco Fraga
 */
public class J2App {

    public static void main(String[] args) throws IOException{
        final String file = "xanadu.txt";
        ScanAndPrint callIt=new ScanAndPrint();
        callIt.readIt(file);
    }
    
}