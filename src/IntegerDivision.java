public class IntegerDivision {
    public static void main(String[] args) {
        // Declare two integer variables and assign an integer to each
        double num1 = 25;
        double num2 = 5;

        //Divide the larger number by the smaller number and assign the result to a variable
        double result = num1 / num2;

        //Print the result
        System.out.println("Dividing " + num1 + " by " + num2 + " results in " + result);

        //Change the larger number to a decimal
        num1 = 50.0; // Will not execute. Num1 is now a double, must change all int to double

        double resultA = num1 / num2;

        System.out.println("Dividing " + num1 + " by " + num2 + " results in " + result);



    }
}
