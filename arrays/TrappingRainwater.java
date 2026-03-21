public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int totalWater = findTrappedWater(height);
        System.out.println("Total trapped Rainwater: " + totalWater);

        // Edge cases
        System.out.println("Two bars:    " + findTrappedWater(new int[] { 3, 3 })); // 0
        System.out.println("Flat:        " + findTrappedWater(new int[] { 3, 3, 3 })); // 0
        System.out.println("Single bar:  " + findTrappedWater(new int[] { 5 })); // 0
        System.out.println("Empty:       " + findTrappedWater(new int[] {}));
    }

    // Calculates Total Rainwater Trapped between the bars
    // Time Complexity: 0(n)
    // Space Complexity: 0(n)
    public static int findTrappedWater(int[] height) {

        if (height == null || height.length < 2) {
            return 0;
        }

        int n = height.length;
        // Calculating left max boundary
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculating right max boundary
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Find water trapped
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWater += waterLevel - height[i];
        }

        return totalWater;
    }
}
