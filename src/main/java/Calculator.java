import java.util.UUID;
 
class Calculator {
 
    Calculator(){

    }
// test
    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }

    int fibonacciNumberFinder(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int secondPrevious = 0;
        int previous = 1;
        int current = -1;

        for(int iteration = 1; iteration < n; iteration++){
            current = secondPrevious + previous;
            //prepare for next iteration
            secondPrevious = previous;
            previous = current;
        }

        return current;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        return Integer.toBinaryString(n);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        UUID uuid = UUID.randomUUID();
        return n + uuid.toString();
    }
}
