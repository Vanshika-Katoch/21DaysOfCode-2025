import java.util.*;

public class Day1Question2_MissingAndRepeated {
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 2, 1, 1};
        int n = nums.length;
        int sum = 0;
        int expectedSum = n * (n + 1) / 2;
        Set<Integer> seen = new HashSet<>();
        int duplicate = -1;

        for (int num : nums) {
            if (seen.contains(num)) duplicate = num;
            seen.add(num);
            sum += num;
        }

        int missing = expectedSum - (sum - duplicate);
        System.out.println("Missing: " + missing + ", Twice: " + duplicate);
    }
}
