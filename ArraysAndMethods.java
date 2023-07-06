public class ArraysAndMethods {
    public static void main(String[] args) {
        /*
         * 1. Create an array of int called ages that contains the following values: 3,
         * 9, 23, 64, 2, 8, 28, 93.
         * a. Programmatically subtract the value of the first element in the array from
         * the value in the last element of the array (i.e. do not use ages[7] in your
         * code). Print the result to the console.
         * b. Add a new age to your array and repeat the step above to ensure it is
         * dynamic (works for arrays of different lengths).
         * c. Use a loop to iterate through the array and calculate the average age.
         * Print the result to the console.
         * 
         */

        // create an array ages
        int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

        // subtract the last age from the first age and save it to a variable
        int subtractFromArray = ages[ages.length - 1] - ages[0];

        // print the result of the subtraction
        System.out.println("----------");
        System.out.println(subtractFromArray);
        System.out.println("----------");

        // To add a new age to the existing array and repeat the subtraction we create a
        // newAge variable
        int newAge = 33;

        // Create a new array with a larger length since Arrays have a fixed length and
        // are immutable
        int[] updatedAges = new int[ages.length + 1];

        // Copy the elements from the original array to the new array using the
        // arraycopy() method
        System.arraycopy(ages, 0, updatedAges, 0, ages.length);

        // Add the new age to the last index of the new array
        updatedAges[updatedAges.length - 1] = newAge;

        // Calculate the difference between the first and last element of the updated
        // array

        int updatedSubtractFromArray = updatedAges[updatedAges.length - 1] - updatedAges[0];

        System.out.println("The first age subtracted from the last age is equal to: " + updatedSubtractFromArray);
        System.out.println("----------");

        // use a loop to iterate through the array and calculate average age

        int averageAge = 0;

        for (int i = 0; i < updatedAges.length; i++) {
            averageAge += (double) updatedAges[i] / (double) updatedAges.length;
        }

        System.out.println("Average age in array of names: " + (double) averageAge);
        System.out.println("----------");

        /*
         * 2. Create an array of String called names that contains the following values:
         * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
         * a. Use a loop to iterate through the array and calculate the average number
         * of letters per name. Print the result to the console.
         * b. Use a loop to iterate through the array again and concatenate all the
         * names together, separated by spaces, and print the result to the console.
         * 
         */

        // create a string array of names
        String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

        // loop that calculates average length of names
        int totalLettersInName = 0;
        for (String name : names) {
            totalLettersInName += name.length();
        }

        double average = (double) totalLettersInName / names.length;

        System.out.println("Average number of letters per name: " + average);
        System.out.println("----------");

        /*
         * 3. How do you access the last element of any array?
         */

        String lastIndexOfNameArray = names[names.length - 1];

        System.out.println(lastIndexOfNameArray);
        System.out.println("----------");

        /*
         * 4. How do you access the first element of any array?
         */

        String firstIndexOfNameArray = names[0];

        System.out.println(firstIndexOfNameArray);
        System.out.println("----------");

        /*
         * 5. Create a new array of int called nameLengths. Write a loop to iterate over
         * the previously created names array and add the length of each name to the
         * nameLengths array.
         */

        int[] nameLengths = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        for (int length : nameLengths) {
            System.out.println(length);
        }

        System.out.println("----------");

        /*
         * 6. Write a loop to iterate over the nameLengths array and calculate the sum
         * of all the elements in the array. Print the result to the console.
         */

        int sumOfNameLengths = 0;

        for (int nameLength : nameLengths) {
            sumOfNameLengths += nameLength;
        }

        System.out.println("The sum of all the elements in the name length array equals: " + sumOfNameLengths);

        System.out.println("----------");

        /*
         * 7. Write a method that takes a String, word, and an int, n, as arguments and
         * returns the word concatenated to itself n number of times. (i.e. if I pass in
         * “Hello” and 3, I expect the method to return “HelloHelloHello”).
         */

        System.out.println(stringMultipliedByN("Hello", 4));

        System.out.println("----------");

        /*
         * 8. Write a method that takes two Strings, firstName and lastName, and returns
         * a full name (the full name should be the first and the last name as a String
         * separated by a space).
         */

        System.out.println(fullName("Bob", "Smith"));
        System.out.println("----------");

        /*
         * 9. Write a method that takes an array of int and returns true if the sum of
         * all the ints in the array is greater than 100.
         */

        int[] numbers = { 10, 9, 8, 7, 7, 6, 5, 4, 3, 2, 2, 1 };

        int[] numbers2 = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

        System.out.println(isGreaterThan100(numbers));
        System.out.println(isGreaterThan100(numbers2));
        System.out.println("----------");

        /*
         * 10. Write a method that takes an array of double and returns the average of
         * all the elements in the array.
         */

        double[] grades = { 100.0, 85.5, 70.5, 40.0, 60.0, 100.0, 95.5 };

        System.out.println(averageOfDoublesArray(grades));

        System.out.println("----------");

        /*
         * 11.Write a method that takes two arrays of double and returns true if the
         * average of the elements in the first array is greater than the average of the
         * elements in the second array.
         */

        /*
         * 12.Write a method called willBuyDrink that takes a boolean isHotOutside, and
         * a double moneyInPocket, and returns true if it is hot outside and if
         * moneyInPocket is greater than 10.50.
         */

        /*
         * 13.Create a method of your own that solves a problem. In comments, write what
         * the method does and why you created it.
         */

    }

    // method for 7:

    public static String stringMultipliedByN(String word, int n) {
        StringBuilder stringToMultiply = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringToMultiply.append(word);
        }
        return stringToMultiply.toString();

    }

    // method for 8:

    public static String fullName(String first, String last) {
        String fullName = "";
        StringBuilder sb = new StringBuilder();
        sb.append(first);
        sb.append(" ");
        sb.append(last);
        fullName = sb.toString();
        return fullName;
    }

    // method for 9:

    public static Boolean isGreaterThan100(int[] intArray) {
        int sum = 0;
        for (int n : intArray) {
            sum += n;
        }

        return sum > 100;

    }

    // method for 10:

    public static Double averageOfDoublesArray(double[] arrayOfDoubles) {
        double average = 0.0;

        for (double n : arrayOfDoubles) {
            average += n / arrayOfDoubles.length;
        }

        return average;

    }

    // method for 11:

    // method for 12:

    // method for 13:

}
