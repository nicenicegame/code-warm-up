import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Counter {
    private int count;
    private double total;

    public void readfile(String filename) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("#"))
                    continue;
                if (line.isBlank())
                    continue;
                this.count += 1;
                this.total += Double.parseDouble(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Can't read the file");
        }
    }

    public int getCount() {
        return this.count;
    }

    public double getTotal() {
        return this.total;
    }
}