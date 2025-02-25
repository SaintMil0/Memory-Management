# Memory-Management

flowchart: 

challenges: 1. Understanding Stack vs. Heap Allocation
It was important to distinguish between stack memory (which stores reference variables) and heap memory (which stores actual objects).
A common mistake is thinking objects themselves are in the stack when only their references are.
2. Ensuring Garbage Collection Works
Challenge: Garbage Collection (GC) in Java is not immediate, even after calling System.gc().
Solution: The finalize() method was used to confirm when an object was collected, though relying on it isn’t best practice since GC runs on its own schedule.

Video:
