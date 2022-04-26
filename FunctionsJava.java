import java.util.Arrays;

public class FunctionsJava {
    static void helloWorld() {
        System.out.println("Hello, World!");
    }
    static void greeting(String myName) {
        System.out.println("Hello, " + myName);
    }
    static int add(int num1, int num2) {
        return num1 + num2;
    }
    static String faveColorFinder(String myColor) {
        if(myColor == "Red") {
            return "Red is a great color";
        } else if(myColor == "Green") {
            return "Green is a solid favorite color";
        } else if(myColor == "Black") {
            return "So trendy";
        } else
            return "All the colors";
    }

    static String thatsOdd(int oneNum) {
        if(oneNum % 2 == 0) {
            return "That's not Odd!";
        } else
            return "That is Odd indeed";
    }

    static String[] bigOrSmall(int numArr[]) {
        String[] answers = new String[5];
        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] >= 100) {
                answers[i] = "big";
            } else if(numArr[i] < 100) {
                answers[i] = "small";
            } else
                continue;
        }
        printResults(answers);
        return answers;
    }

    static void printResults(String arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main (String[] args) {
        int[] numArray = {10, 30, 440, 500, 25};
        helloWorld();
        greeting("Steve");
        add(4, 5);
        faveColorFinder("Red");
        thatsOdd(5);
        bigOrSmall(numArray);
    }

}
