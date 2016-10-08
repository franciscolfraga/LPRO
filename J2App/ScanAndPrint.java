import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Based on: Oracle, Trail: Essential Classes: Exceptions, Basic I/O, The Java
 * Tutorials Sixth Edition
 *
 * @author Francisco Fraga
 */
public class ScanAndPrint {

    public void readIt(String fileString) throws FileNotFoundException, IOException {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(fileString))) {
            String myString;
            while ((myString = inputStream.readLine()) != null) {
                System.out.println(myString);
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());

        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());

        }
    }
}