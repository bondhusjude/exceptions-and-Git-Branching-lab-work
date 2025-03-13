import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Writer {
        public void writer(String inputFileName, Integer rows, Integer columns) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName))) {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (j % 6 < 4){
                            Random r = new Random();
                            writer.write(r.nextInt() + " ");
                        }
                        else {
                            Random ri = new Random();
                            writer.write(ri.nextDouble() + " ");
                        }
                    }
                    writer.newLine();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
}
