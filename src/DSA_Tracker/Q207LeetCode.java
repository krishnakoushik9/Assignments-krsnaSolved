package DSA_Tracker;

import java.util.ArrayList;
import java.util.List;

public class Q207LeetCode {

    public static void main(String[] args) {
        int[][] p2 = {{1, 0}, {0, 1}};
        System.out.println("Can finish: " + canFinish(2, p2));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build adjacency list
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] state = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) {
                if (hasCycle(i, adj, state)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean hasCycle(int node, List<List<Integer>> adj, int[] state) {

        state[node] = 1; // visiting

        List<Integer> neighbors = adj.get(node);

        for (int neighbor : neighbors) {

            if (state[neighbor] == 1) {
                return true;
            }

            if (state[neighbor] == 0) {
                if (hasCycle(neighbor, adj, state)) {
                    return true;
                }
            }
        }

        state[node] = 2; // done
        return false;
    }
}