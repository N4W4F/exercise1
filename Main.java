import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        1. Develop a program that takes the weight (in kilograms)
//        and height (in meters) as input and calculates the BMI, then print it.

        System.out.print("Please, enter your weight (in kilograms): ");
        double weight = input.nextDouble();

        System.out.print("Please, enter your height (in meters): ");
        double height = input.nextDouble();

        System.out.println("\nYour BMI based on your weight and height is: " + (weight / (height * height)));


//      2. Write a program that takes the obtained marks and total marks as input and
//      calculates the percentage, then prints it.

        System.out.print("\n\nEnter the obtained marks: ");
        double obtainedMarks = input.nextDouble();

        System.out.print("Enter the total marks: ");
        double totalMarks = input.nextDouble();

        System.out.println("\nThe percentage = " + ((obtainedMarks / totalMarks) * 100) + "%");


//      3. Create a program that takes an amount in one currency and an exchange rate
//      as input, then converts and prints the amount in another currency.

        System.out.print("\n\nEnter the the amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the exchange rate: ");
        double rate = input.nextDouble();

        System.out.println("\nThe new amount is: " + (amount * rate));


//      4. Create a program that takes a string as input, calculates its length, and then
//      reverse the string using the StringBuilder class, finally printing both the length and
//      reverse string.

        System.out.print("\n\nEnter a string: ");
        String userString = input.nextLine();

        StringBuilder reversedStr = new StringBuilder(userString);
        reversedStr.reverse();

        int str1Length = userString.length();

        System.out.println("\nLength of the string: " + str1Length + " And Reversed string: " + reversedStr.toString());


//      5. Develop a program that takes a sentence as input and extracts a substring from
//      it, then prints the extracted substring.

        System.out.print("\n\nEnter a sentence: ");
        String userSubs = input.nextLine();

        System.out.print("Enter the start index: ");
        int startIndex = input.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = input.nextInt();

        System.out.println("\n" + userSubs.substring(startIndex, endIndex));


//      6. Write a program that takes a sentence and a keyword as input, then check if
//      the keyword is present in the sentence and prints the result.

        System.out.print("\n\nEnter a sentence: ");
        String userSentence = input.nextLine();

        System.out.print("Enter a keyword: ");
        String userKeyword = input.nextLine();

        System.out.println("\nKeyword \"" + userKeyword + "\" is present in the sentence");


//      7. Develop a program that takes a sentence and a word to replace as input, then
//      replace all occurrences of the word with another word and prints the modified sentence.

        System.out.print("\n\nEnter a sentence: ");
        String sentence1 = input.nextLine();

        System.out.print("Enter a word to replace: ");
        String wordToReplace = input.nextLine();

        System.out.print("Enter a replacement word: ");
        String replacementWord = input.nextLine();

        System.out.println("\n" + sentence1.replace(wordToReplace, replacementWord));


//      8. Write a program that takes two strings as input and check if they are equal,
//      ignoring the case, then prints whether they are equal or not.

        System.out.print("\n\nEnter the first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        System.out.println("\nStrings are equal (ignoring case): "
                + firstString.equalsIgnoreCase(secondString));
    }
}
