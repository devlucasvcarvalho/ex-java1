public class Quest1 {
    public static void main(String[] args) {
        int x = 80;

        while (x != 1) {
            int y;

            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }

            System.out.print(y + " -> ");

            x = y;
        }

        System.out.println("1"); 
    }
}
