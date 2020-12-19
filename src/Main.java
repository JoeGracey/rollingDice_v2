public class Main {

    public static void main(String[] args) {
        RollTheDice rollTheDice = new RollTheDice(); // Create the RollTheDice Object

        int count = 1;
        if (count <= 20) {
            do {
                rollTheDice.rolling();
                rollTheDice.storingNumberRolled();
            } while (count <= 20); {
                count++;
            }
            rollTheDice.table();
        }
    }

    public static class RollTheDice {
        public int d20Dice;
        int[] diceNumberFrequency = new int[21]; // 20 sided die adding 1 everytime a num is rolled

        // Rolls the dice
        public void rolling() {
            d20Dice = (int)(Math.random() * 20) + 1;
            System.out.println("Number rolled: " + d20Dice);
        }

        // Adds one to the index each time a number is rolled
        public void storingNumberRolled() {
            ++diceNumberFrequency[d20Dice];
            System.out.println(d20Dice + " has been rolled " + diceNumberFrequency[d20Dice] + " times");
            rolling();
        }

        // Table showing each number rolled and how many times it was rolled
        public void table() {
            System.out.println("Number\tTimes Rolled");
            System.out.println(d20Dice + "\t\t" + diceNumberFrequency[d20Dice]);
        }
    }

}

// Create a dice object
// Create an array to store each number rolled
// Stop when 100 numbers have been added

//int diceRollCount = 0; // Number of times the dice have been rolled

// create an array that stores every number rolled


//        do {
//            // roll the dice
//            // print number that gets rolled
//            // add one to the number count
//            // print the diceNumberFrequency
//        } while (diceRollCount <= 100) {
//            // keep rolling it again
//            // and adding to the total
//        }
