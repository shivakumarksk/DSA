package Arrays;

public class MaximumContinousSum {
    public static void main(String[] args) {
        int[] candies = {-1, 2, 3, 4, 5, -7, 5, 8};
        int[] result = findMaxCandies(candies);
        System.out.println("Max candies: " + result[0]);
        System.out.println("Start index: " + result[1]);
        System.out.println("End index: " + result[2]);
    }

    public static int[] findMaxCandies(int[] candies) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;
        int tempStartIndex = 0;

        for (int i = 0; i < candies.length; i++) {
            currentSum += candies[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = tempStartIndex;
                endIndex = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStartIndex = i + 1;
            }
        }

        return new int[]{maxSum, startIndex, endIndex};
    }

}
