public class Main {

    public static void main(String[] args) {
        Dice dice = new Dice();

        int count = 1;
        do {
            dice.rollTheDice();
            dice.storingNumberRolled();
            count++;
        } while (count <= 20); {
            dice.table();
        }
    }

    public static class Dice {
        int d20Dice;
        int[] diceNumberFrequency = new int[21];

        public void rollTheDice() {
            d20Dice = (int)(Math.random() * 20) + 1;
            System.out.println("Number rolled: " + d20Dice);
        }

        // Adds one to the index each time a number is rolled
        public void storingNumberRolled() {
            ++diceNumberFrequency[d20Dice];
            System.out.println(d20Dice + " has been rolled " + diceNumberFrequency[d20Dice] + " " +
                    "time(s)");
        }

        // Table showing each number rolled and how many times it was rolled
        public void table() {
            int index = 1;
            System.out.println("Number\tTimes Rolled");
            for (int count = 1; count < diceNumberFrequency.length; count++) {
                System.out.println(index++ + "\t\t" + diceNumberFrequency[count]);
            }
        }
    }
}
