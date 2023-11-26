import java.util.*;

public class RequestLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read request limits and duration
        int userLimit = scanner.nextInt();
        int serviceLimit = scanner.nextInt();
        int duration = scanner.nextInt();

        // Initialize data structures
        Map<Integer, Queue<Integer>> userRequests = new HashMap<>();
        Queue<Integer> allRequests = new LinkedList<>();

        int time = scanner.nextInt();
        while (time != -1) {
            int userId = scanner.nextInt();

            // Remove expired requests from data structures
            while (!allRequests.isEmpty() && allRequests.peek() <= time - duration) {
                int removed = allRequests.poll();
                Queue<Integer> userQueue = userRequests.get(userId);
                if (userQueue != null) {
                    userQueue.remove();
                    if (userQueue.isEmpty()) {
                        userRequests.remove(userId);
                    }
                }
            }

            // Check request limits
            if (userRequests.containsKey(userId) && userRequests.get(userId).size() >= userLimit) {
                System.out.println("429"); // Too Many Requests
            } else if (allRequests.size() >= serviceLimit) {
                System.out.println("503"); // Service Unavailable
            } else {
                // Accept the request
                System.out.println("200");
                allRequests.offer(time);
                userRequests.computeIfAbsent(userId, k -> new LinkedList<>()).offer(time);
            }

            System.out.flush(); // Flush output buffer

            time = scanner.nextInt();
        }
    }
}
