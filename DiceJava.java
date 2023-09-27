public class DiceJava {
    public static void main(String[] args) {
        var random = new java.util.Random();

        int sum1 = 0;
        int sum2 = 0;

        while (true) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            sum1 += die1 + die2;

            System.out.println("Player 1:");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);

            if(sum1 >= 40)
                break;

            System.out.println("Sum so far: " + sum1 + "\n");

            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;
            sum2 += die1 + die2;

            System.out.println("Player 2:");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);

            if (sum2 >= 40)
                break;

            System.out.println("Sum so far: " + sum2 + "\n");
        }

        if (sum1 == 40)
            System.out.println("Player 1 wins!\nFinal sum: " + sum1);
        else
            System.out.println("Player 2 wins!\nFinal sum: " + sum2);
    }
}