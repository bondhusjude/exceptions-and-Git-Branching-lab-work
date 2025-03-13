
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {


    }

    class writer {
        public void writer(String inputFileName, Integer rows, Integer columns) {
            
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName))) {
                writer.write("Hello World");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    class reader {
        public void reader(String inputFileName) {
            try (BufferedReader Reader = new BufferedReader(new FileReader(inputFileName))) {
                String line;
                while ((line = Reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
