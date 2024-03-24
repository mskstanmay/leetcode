# Applying the same logic as java 
class Solution:
    def findMinArrowShots(self, points: List[List[int]]) -> int:
        # Sorting balloons
        points.sort(key=lambda x: x[1])
        
        arrows = 1
        prev_end = points[0][1]
        
        # Counting non-overlapping intervals
        for i in range(1, len(points)):
            if points[i][0] > prev_end:
                arrows += 1
                prev_end = points[i][1]
        
        return arrows
