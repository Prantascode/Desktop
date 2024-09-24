package JavaTutorial;

public class SixDays {

    public static void main(String[] args) {
        // Print the song for days 1 to 6
        for (int day = 1; day <= 6; day++) {
            printVerse(day);
            System.out.println();
        }
    }

    // Method to print the entire verse for each day
    public static void printVerse(int day) {
        printOpening(day);
        printGifts(day);
    }

    // Method to print the opening line for each day
    public static void printOpening(int day) {
        System.out.println("On the " + getOrdinal(day) + " day of \"Xmas\", my true love gave to me");
    }

    // Method to print all the gifts for a specific day in reverse order
    public static void printGifts(int day) {
        if (day >= 6) {
            sixGeese();
        }
        if (day >= 5) {
            fiveRings();
        }
        if (day >= 4) {
            fourBirds();
        }
        if (day >= 3) {
            threeHens();
        }
        if (day >= 2) {
            twoDoves();
        }
        if (day >= 1) {
            partridge();
        }
    }

    // Method to return the ordinal form of the day number (e.g., "1st", "2nd", "3rd")
    public static String getOrdinal(int day) {
        switch (day) {
            case 1: return "1st";
            case 2: return "2nd";
            case 3: return "3rd";
            case 4: return "4th";
            case 5: return "5th";
            case 6: return "6th";
            default: return day + "th";
        }
    }

    // Method to print the gift on day 6
    public static void sixGeese() {
        System.out.println("six geese a-laying,");
    }

    // Method to print the gift on day 5
    public static void fiveRings() {
        System.out.println("five golden rings,");
    }

    // Method to print the gift on day 4
    public static void fourBirds() {
        System.out.println("four calling birds,");
    }

    // Method to print the gift on day 3
    public static void threeHens() {
        System.out.println("three French hens,");
    }

    // Method to print the gift on day 2
    public static void twoDoves() {
        System.out.println("two turtle doves, and");
    }

    // Method to print the gift on day 1
    public static void partridge() {
        System.out.println("a partridge in a pear tree.");
    }
}
