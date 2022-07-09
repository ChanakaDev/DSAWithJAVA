import java.util.Arrays;

class ArraysInJava{
    public static void main(String args[]){
        // this is a starting point for all the other data structures
        
        // Declare an integer array.
        int[] numbers = new int[3];
        System.out.println(numbers); // Output: [I@5acf9800
        // Print array
        System.out.println(Arrays.toString(numbers)); //[0, 0, 0]

        // Give values to an array
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        // Print array
        System.out.println(Arrays.toString(numbers)); // Output: [100, 200, 300]

        // Shorter and smarter way of declaring and initializing an array
        int[] studentMarks = {90, 80, 95};
        System.out.println("Marks of the students : " + Arrays.toString(studentMarks)); 
        // Output: Marks of the students : [90, 80, 95] 
    }
}