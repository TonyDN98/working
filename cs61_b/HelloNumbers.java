
public class HelloNumbers {
    /*
     * Variable x must be declared before it's used;
     * Every variable must have a type;
     */
    public static void main(String[] args) {
        System.out.println("Exercise 1.1.1");
        int x = 0;
        while (x < 10) {
            System.out.print(x + " ");
            x+=1;
        }

        /*
         *
         * Exercise 1.1.2. Modify HelloNumbers so that it prints out the cumulative sum of the integers from 0 to 9.
         *  For example, your output should start with 0 1 3 6 10... and should end with 45.
         */
        System.out.println("Exercise 1.1.2");
        int y = 0;
        int sum = 0;
        while (y<9) {
            // each time take sum and y and add them;
            sum = y + sum;
            y+=1;
            System.out.print(sum + " ");
        }


    }
}
