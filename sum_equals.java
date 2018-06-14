class Point {


    public boolean sum_equals(int[] numbers, int S){
        //Given an array of random integers, and a given integer S, determine if it is possible to select two numbers
        //from this list, so their sum equals to S.

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 9 ) {
                    //System.out.println(numbers[i] + numbers[j] );
                    System.out.print(true);
                    return true;
                }
            }
        }
        System.out.print(false);
    return false;
    }


}

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        int numbers[] = {1, 2, 3, 4, 5};
        int S = 9;
        p.sum_equals(numbers, S);
     
    }
}