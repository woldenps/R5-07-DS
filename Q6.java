public class Q6 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java Q6 <N>");
            return;
        }

        int N = Integer.parseInt(args[0]);

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
