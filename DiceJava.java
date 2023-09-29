// Old comment from Daniall Mudasar
// Changes, i have added; 1. Spilleren mister alle sine point hvis spilleren slår to 1'ere.
// Spilleren får en ekstra tur hvis spilleren slår to ens.

// Old comment from Abdullah Hassan
// Jeg har tilføjet boolean, hvor spillerne kan kører ektra runder. 
// Hvis spilleren slår 2 ens.

// Old comment by Mustafa A.
// Spilleren kan vinde spillet ved at slå to 6'ere, 
// hvis spilleren også i forrige kast slog to 6'ere, 
// uanset om det var på ekstra kast eller i forrige tur.

// Latest and final Comment by Daniel Rahimpour & Samin Chowdhury.
// We fix some bugs and updatedet, and added the 4 rule.

public class DiceJava {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int sum1 = 0;
        int sum2 = 0;
        int die1 = 0;
        int die2 = 0;
        boolean extra = false;
        boolean special1 = false;
        boolean special2 = false;
        boolean victory1 = false;
        boolean victory2 = false;

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
                    } else if (die1 == 6) {
                        if (special1) {
                            System.out.println("Two 6s!");
                            victory1 = true;
                            break;
                        } else
                            special1 = true;
                    }
                    if (sum1 >=40){
                        victory1=true;
                        break;
                    }
                    extra = true;
                }
                System.out.println("Sum so far: " + sum1 + "\n");
            } while (extra);

            if (victory1)
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
                    } else if (die1 == 6) {
                        if (special2) {
                            System.out.println("Two 6s!");
                            victory1 = true;
                            break;
                        } else
                            special2 = true;
                    }
                    if (sum2 >=40){
                        victory2=true;
                        break;
                    }
                    extra = true;
                }
                System.out.println("Sum so far: " + sum2 + "\n");
            } while (extra);

            if (victory2)
                break;
        }

        if (victory1)
            System.out.println("Player 1 wins!\nFinal sum: " + sum1);
        else if (victory2)
            System.out.println("Player 2 wins!\nFinal sum: " + sum2);
    }
}