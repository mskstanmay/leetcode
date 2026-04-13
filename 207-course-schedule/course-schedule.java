class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        /* Approach 1 : Using hashmaps, queue and arraylist
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
        
        */

        // 1. Array of Lists: Faster indexing than HashMap
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] indegree = new int[n];

        // 2. Build the graph (Prereq -> Course)
        for (int[] x : prerequisites) {
            int course = x[0];
            int prereq = x[1];
            graph[prereq].add(course);
            indegree[course]++;
        }

        // 3. ArrayDeque is faster than LinkedList for Queue operations
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int coursesCompleted = 0;

        while (!q.isEmpty()) {
            int top = q.poll();
            coursesCompleted++;

            // 4. Standard Kahn's neighbor processing
            for (int neighbor : graph[top]) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }

        // If we completed all 'n' courses, there were no cycles
        return coursesCompleted == n;
    }
}