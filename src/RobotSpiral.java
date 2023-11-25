public class RobotSpiral {
    public static void main(String[] args) {
        int n = 20; // Number of steps

        int x = 0; // Initial x-coordinate
        int y = 0; // Initial y-coordinate
        int dx = 0; // Initial x-direction
        int dy = -1; // Initial y-direction

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (dx == 0) {
                    dx = dy;
                    dy = 0;
                } else {
                    dy = -dx;
                    dx = 0;
                }
            }
            x += dx;
            y += dy;
        }

        System.out.println("After " + n + " steps, the robot will be at position (" + x + ", " + y + ")");
    }
}
