
import java.io.BufferedReader;
import java.io.FileReader;

class Reader {
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