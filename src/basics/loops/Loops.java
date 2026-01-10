package basics.loops;

public class Loops {
    public static void main (String args[]) {
        System.out.println("This is loops class");

        //While loop
        int i = 10;

        while (i < 5) {
            System.out.println("This will never be printed");
            i++;
        }

        //do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

        //for loop
        int sum = 0;
        for (int k = 1; k <= 5; k++) {
            sum = sum + k;
        }
        System.out.println("Sum is " + sum);

    /*There is also a "for-each" loop, which is used exclusively to loop through elements in
    an array (or other data structures):*/
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        }

        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
            System.out.println(num);
        }
    }

}
