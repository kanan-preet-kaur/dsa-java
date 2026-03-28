public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        double shortestPath = findShortestPath(path);
        System.out.println("Shortest Path: " + shortestPath);
    }

    // To find the shortest path to reach destination
    // Time complexity: O(n)
    // Space Complexity: O(1)
    public static double findShortestPath(String path) {

        if (path == null || path.isEmpty()) {
            return 0;
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'W') {
                x--;
            }
        }

        return Math.sqrt((x * x) + (y * y));
    }
}