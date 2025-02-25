class Task {
    private String taskName;

    public Task(String name) {
        this.taskName = name;
    }

    public void performTask() {
        System.out.println("Performing task: " + taskName);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called for: " + taskName);
    }
}

public class MemoryManagementDemo {
    public static void main(String[] args) {
        // Stack allocation: reference variables
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");

        // Heap allocation: actual objects
        task1.performTask();
        task2.performTask();

        // Making objects eligible for Garbage Collection
        task1 = null;
        task2 = null;

        // Requesting Garbage Collection
        System.gc();

        System.out.println("End of main method");
    }
}
