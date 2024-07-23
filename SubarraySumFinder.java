public class SubarraySumFinder {
    void findSubarrayWithSum(int[] array, int length, int targetSum) {
        for (int startIndex = 0; startIndex < length; startIndex++) {
            int currentSum = array[startIndex];

            if (currentSum == targetSum) {
                System.out.println("Sum found at index " + startIndex);
                return;
            } else {
                for (int endIndex = startIndex + 1; endIndex < length; endIndex++) {
                    currentSum += array[endIndex];

                    if (currentSum == targetSum) {
                        System.out.println("Sum found between indexes " + startIndex + " and " + endIndex);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        SubarraySumFinder subarraySumFinder = new SubarraySumFinder();
        int inputArray[] = { 1, 2, 3, 7, 5 };
        int arrayLength = inputArray.length;
        int targetSum = 12;
        subarraySumFinder.findSubarrayWithSum(inputArray, arrayLength, targetSum);
    }
}
