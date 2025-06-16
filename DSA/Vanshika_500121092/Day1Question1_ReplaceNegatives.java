public class Day1Question1_ReplaceNegatives {
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) nums[i] = 0;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
