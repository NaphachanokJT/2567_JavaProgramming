import java.util.Scanner;

public class Lab502 {
    public static void main(String[] args) {
    	
        int[] nums = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input number " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }
        
        int sum = sumOfPos(nums);
        System.out.println("\nSummation of positive number is " + sum);
        sc.close();
    }
    public static int sumOfPos(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }
}