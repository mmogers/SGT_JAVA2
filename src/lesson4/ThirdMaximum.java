

public class ThirdMaximum {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        int arrayLength = scanner.nextInt();
        int [] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("please enter the number " + (i+1) + "to array");
            array[i] = scanner.nextInt();
        }
        *//*for (int i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);
        }*/

        int [] array = {2,1,3};
        // int [] array = {3,2,1};

        int max = array[0];
        int min = array[0];

        for (int item:array
        ) {
            if (item >= max){ //finds max
                max = item;
            }
            if (item <=min){ //find minimum of the array
                min = item;
            }
        }
        // System.out.println(max + " " + min);
        int secondMax = min;
        for (int item:array //find second max
        ) {
            if(item> secondMax && item < max){
                secondMax = item;
            }
        }


        int thirdMaximum = min; //find third maximum
        for (int item:array
        ) {
            if(item> thirdMaximum && item < secondMax){
                thirdMaximum = item;
            }
        }

          System.out.println(max + " " + secondMax + " " + thirdMaximum);
        if(thirdMaximum == secondMax){
            System.out.println("There is no third maximum , the maximum is " + max);
        }else {
            System.out.println("The third maximum is: " + thirdMaximum);
        }
    }

}
