//Raja Hammad Mehmood.
// There are five 6-sided dice. The player gets three throws per turn and 10 turns in total. All of the dice are rolled on the first throw.
//After every throw, some dice may be frozen and they are not rolled again on that turn.
//The sum of scores after 3 throws(1 turn) is printed out.
import java.util.Scanner;
public class DiceGame {
    /* prints the scores of the dices
     *@param1 is array of the dice
     **/
    public static void printDice(FreezeDice[] dice) {
        System.out.print("Your dice values are : ");
        for ( int i = 0 ; i < dice.length ; i++ ) {
            System.out.print(dice[i].getValue() + ", ");
        }
        System.out.println();
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        FreezeDice[] dice=new FreezeDice[5]; // creating 5 FreezeDice slots

        for ( int i = 0 ; i < dice.length ; i++ ) {
            dice[i] = new FreezeDice(6);// creating 5 dices
        }
        int sum=0;
        for(int count=0; count<10; count++) { // 10 turns

            for(int i=0; i<dice.length; i++) { // unfreezing each dice after every turn before the first throw.
                dice[i].unfreeze();
            }

            for(int count1=0; count1<dice.length; count1++) { // rolling every dice for the first throw
                dice[count1].roll();
            }
            printDice(dice);//calling the subroutine printDice.
            System.out.println("Enter a value between 0-6 (including 0 and 6). Any dice with this number would be frozen");
            int choice=scanner.nextInt();// user's choice

            while(choice<0 || choice>6) {
                System.out.println("Out of range.Enter a value between 0-6 (including 0 and 6). Any dice with this number would be frozen");
                choice=scanner.nextInt();
            }

            for ( int i1 = 0 ; i1 < dice.length ; i1++ ) {// freezing the dices that match the user's choice number.
                if (dice[i1].getValue()==choice) {
                    dice[i1].freeze();
                }
            }

            for(int count2=0; count2<dice.length; count2++) { // rolling dices for the second time
                dice[count2].roll();
            }
            printDice(dice);

            System.out.println("Enter a value between 0-6 (including 0 and 6). Any dice with this number would be frozen");
            choice=scanner.nextInt();// user's choice

            while(choice<0 || choice>6) {
                System.out.println("Out of range.Enter a value between 0-6 (including 0 and 6). Any dice with this number would be frozen");
                choice=scanner.nextInt();
            }

            for ( int i3 = 0 ; i3 < dice.length ; i3++ ) {
                if (dice[i3].getValue()==choice) {
                    dice[i3].freeze();
                }
            }

            for(int count3=0; count3<dice.length; count3++) { // rolling for the third time.
                dice[count3].roll();
            }
            printDice(dice);

            for(int count4=0; count4<dice.length; count4++) { // Performing the sum of scores for every turn
                sum=sum+dice[count4].getValue();
            }
             System.out.println("Your total score for this turn is " + sum);
             sum=0;
            if (count!=9) {
                System.out.println("It's the next turn now.");
            }
        }

       





    }
}