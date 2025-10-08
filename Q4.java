public class Q4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java Q4 <N>");
            return;
        }

        int N = Integer.parseInt(args[0]);

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
