package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
      printHelloWorld();
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int n) {
      return n % 2 != 0;
    }

    public static boolean isMultipleOfThree(int n) {
      return n % 3 == 0;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
      return isOdd(n) && isMultipleOfThree(n);
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        String repeatedInput = "";

        for (int i = 0; i < times; i++) {
            repeatedInput += input;
        }

        return repeatedInput;
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".
        String inputTilQ = "";

        if (input.contains("q")) {
            inputTilQ = input.substring(0, input.indexOf("q"));
        }

        return inputTilQ;
    }

    public static Person declareAndReturnPersonNamedAda() {

        return new Person("Ada");
    }

    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
        return new Person("Alan Turing", "London");
    }

    public static boolean isFromLondon(Person person) {
        if (person.getCity()==null) {
            return false;
        }
        return person.getCity().equalsIgnoreCase("London");
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        ArrayList<Place> threePlaces = new ArrayList<Place>();
        Place portlandMaine = new Place("Portland, Maine", 43.67, -70.27);
        Place montrealQuebec = new Place("Montreal, Quebec", 45.50, -73.57);
        Place newYorkNewYork = new Place("New York, New York");
        threePlaces.add(portlandMaine);
        threePlaces.add(montrealQuebec);
        threePlaces.add(newYorkNewYork);

        return threePlaces;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
        HashMap<String, Person> people = new HashMap<String, Person>();
        Person alan = declareAndReturnPersonNamedAlanTuringFromLondon();
        Person grace = new Person("Grace Hopper", "Arlington");

        people.put(alan.getName(), alan);
        people.put(grace.getName(), grace);

      return people;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
        people.get("Alan Turing").setCity("Princeton");
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {
        int sum = 0;
        int fib0 = 0;
        int fib1 = 1;
        int nthFib;

        for (int i = 0; i <= 10; i++) {
            sum += fib1;
            nthFib = fib0;
            fib0 = fib1 + nthFib;
            fib1 = nthFib;

        }

        System.out.println(sum);
    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {
        long sum = 0;
        long fib0 = 0;
        long fib1 = 1;
        long nthFib;

        for (int i = 0; i <= 40; i++) {
            sum += fib1;
            nthFib = fib0;
            fib0 = fib1 + nthFib;
            fib1 = nthFib;

        }

        System.out.println(sum);
    }
}
