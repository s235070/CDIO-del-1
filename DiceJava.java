// Old comment from Daniall Mudasar
// Changes, i have added; 1. Spilleren mister alle sine point hvis spilleren slår to 1'ere.
// Spilleren får en ekstra tur hvis spilleren slår to ens.

// New comment 
// Jeg har tilføjet boolean, hvor spillerne kan kører ektra runder. 
// Hvis spilleren slår 2 ens.

public class DiceGame {
    public static void main(String[] args) {
        var random = new java.util.Random();

        int sum1 = 0;
        int sum2 = 0;
        int die1 = 0;
        int die2 = 0;

        boolean extra = false;

        while (true) {
            do {
                extra = false;  
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                sum1 += die1 + die2;

                System.out.println("Player 1:");
                System.out.println("Die 1: " + die1);
                System.out.println("Die 2: " + die2);

                if (die1 == die2) {
                    if (die1 == 1) {
                        sum1 = 0;
                        System.out.println("Snake Eyes!");
                    }
                    extra = true;
                }
                System.out.println("Sum so far: " + sum1 + "\n");
            } while(extra);

            if (sum1 >= 40)
                break;

            do {
                extra = false;

                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                sum2 += die1 + die2;

                System.out.println("Player 2:");
                System.out.println("Die 1: " + die1);
                System.out.println("Die 2: " + die2);

                if (die1 == die2) {
                    if (die1 == 1) {
                        sum2 = 0;
                        System.out.println("Snake Eyes!");
                    }
                    extra = true;
                }
                    System.out.println("Sum so far: " + sum2 + "\n");
                    
            } while(extra);

            if (sum2 >= 40)
                break;
        }

        if (sum1 == 40)
            System.out.println("Player 1 wins!\nFinal sum: " + sum1);
        else
            System.out.println("Player 2 wins!\nFinal sum: " + sum2);
    }
}