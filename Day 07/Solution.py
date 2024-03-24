from collections import Counter
from typing import List

class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        task_counts = Counter(tasks)
        max_count = max(task_counts.values())
        max_count_tasks = sum(1 for count in task_counts.values() if count == max_count)
        intervals_needed = (max_count - 1) * (n + 1) + max_count_tasks
        return max(intervals_needed, len(tasks))