package adder;

public class Main {

    public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Please provide integers to add");
			System.exit(1);
		}
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
			System.err.println("Invalid character passed");
        }
    }

    private static int addArguments(String[] args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += Integer.valueOf(args[i]);
		}
		return total;
    }
}
