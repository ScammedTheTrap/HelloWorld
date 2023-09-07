public class Array {
    /*public static void main(String[] args) {
        int[] tal = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        double[] numbers = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        System.out.println("kvadratroden af hvert tal:");
        for (int kvadratrod = 0; kvadratrod < numbers.length; kvadratrod++) {
            double squareRoot = Math.sqrt(numbers[kvadratrod]);
            System.out.println("Tal " + numbers[kvadratrod] + ": " + squareRoot);
        }
        int length = tal.length;
        System.out.println("Længden af array er" + " " + length);

    }*/

    //DENNE EKSEMPEL NEDENSTÅENDE VIL VISE HVORDAN MAN KAN ARBEJDE MED ARRAYS/LISTER
    //MED AT BENYTTE ADSKILLIGE FUNKTIONER SAMT PRINTS
    public static void main(String[] args) {
        //ARRAY PÅ 10 PLADSER

        int tal;
        int[] numbers = new int[10];
        numbers[0] = 17;
        numbers[1] = 127;
        numbers[2] = 147;
        numbers[3] = 175;
        numbers[4] = 147;
        numbers[5] = 617;
        numbers[6] = 117;
        numbers[7] = 172;
        numbers[8] = 177;
        numbers[9] = 179;
//vi skriver numbers.length med minus 1 da den ellers vil printe "10" ud og ender
        //out of bounds, så minus 1 gør vi kan få printet 0-9 uden problemer
        System.out.println("Udskriv sidste element " + numbers[numbers.length - 1]);


        //med tuborgklammer gør det at vi ikke ska l manuelt ovenstående indtaste.
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);
        System.out.println(numbers2[3]);
        System.out.println(numbers2[4]);
        System.out.println(numbers2[5]);
        System.out.println(numbers2[6]);
        System.out.println(numbers2[7]);
        System.out.println(numbers2[8]);
        System.out.println(numbers2[9]);

        //DRY - dont repeat yourself
        for (int number : numbers2) {
        System.out.print(number + " ");
    }

// array med objekter (fodboldspillere)
//grundet til fejlene er fordi der ikke er en class for messi som fodbolddemo vi lavede.
    /*String[] fodboldspillere = {"Messi", "Ronaldo"};
    Fodboldspiller messi = new Fodboldspiller("Leo", "Messi", "Miami", 1.67, 68);
    Fodboldspillere[] fodboldspillere2 = {messi};*/


}

}