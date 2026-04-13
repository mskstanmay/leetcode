class Solution {
    public boolean canFinish(int n, int[][] coursesSET) {

        int[] indegree = new int[n];
        int coursesCompleted = 0;
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] x : coursesSET) {
            int course = x[0];
            int prereq = x[1];
            
            // Logic: Prereq -> Course
            graph.get(prereq).add(course); 
            indegree[course]++; // The COURSE is blocked by the prereq
        }

        // Add all courses with NO prerequisites to the queue
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.offer(i);
        }

        while (!q.isEmpty()) {
            int top = q.poll();
            coursesCompleted++;
            
            for(int neighbor : graph.get(top)) {
                indegree[neighbor]--; // "Finish" the prereq, reduce count for neighbor
                if(indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }

        return coursesCompleted == n;
    }
}