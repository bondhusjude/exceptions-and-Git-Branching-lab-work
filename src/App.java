

public class App {
    public static void main(String[] args) throws Exception {
        Writer w = new Writer();
        w.writer("input.txt", 5, 5);
        Reader r = new Reader();
        r.reader("input.txt");


    }




}
