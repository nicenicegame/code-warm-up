/**
 * Read data from one or more files given as command line args.
 * After each file is read the count and sum so far is printed.
 */
public class Main {
    
    public static void main(String[] args) {
		Counter c = new Counter();
		for(String filename: args) {
			System.out.println("Reading data from "+filename);
			c.readfile(filename);
			System.out.printf("Sum of %d values is %,.2f%n", c.getCount(), c.getTotal());
		}
    }
}
