public class FizzBuzz {

    public static void main(String[] args) { //declare main method
        fizzBuzz100();                      //call fizzBuzz function
        fizzBuzzSwitch();
    }

    private static void fizzBuzz100() {     //Begin fizzBuzz100 function
        for (int i = 1; i <= 100; i++) {    //Begin for loop
            if ((i % 3) == 0)               //Check if i divides evenly to 3 with no remainder
                System.out.println("fizz"); //Print out fizz
            else if ((i % 5) == 0)          //Else if check if I divides evenly to 5 with no remainder
                System.out.println("buzz");//print out buzz
            else if (((i % 5) == 0) && ((i % 3) == 0)) //Check if number divides evenly with 3 and 5
                System.out.println("fizzbuzz"); //Print fizzBuzz
            else
                System.out.println(i); //else print out the number
        }
    }
    /*The issue with this program is that the if-else block will fail when a number
     * that divides evenly with 3 and 5 will pass through the first if statement and skip the else if
     * resulting in an erroneous printout
     * */

    private static void fizzBuzzSwitch() {
        for (int i = 1; i <= 100; i++) {
            switch (i % 15) {
                case 0:
                    System.out.println("fizzbuzz");
                    break;
                case 5: case 10: case 15: case 20:
                case 25: case 30: case 35:
                    System.out.println("buzz");
                    break;
                case 3: case 6: case 9: case 12: case 18:
                case 21: case 24: case 27: case 33:
                    System.out.println("fizz");
                    break;
                default:
                    System.out.println(i);
                    break;
            }
        }
    }
}