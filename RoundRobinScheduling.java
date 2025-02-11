class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add a new process at the end
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            newProcess.next = head;
            tail = newProcess;
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) return;
        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                } else {
                    if (temp == head) head = head.next;
                    if (temp == tail) tail = prev;
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate Round Robin Scheduling
    public void executeProcesses() {
        if (head == null) return;
        Process temp = head;
        int totalWaitingTime = 0, totalTurnaroundTime = 0, processCount = 0;

        while (head != null) {
            int executionTime = Math.min(timeQuantum, temp.burstTime);
            temp.burstTime -= executionTime;
            System.out.println("Executing Process ID: " + temp.processId + " for " + executionTime + " units.");

            if (temp.burstTime == 0) {
                totalTurnaroundTime += executionTime;
                removeProcess(temp.processId);
            } else {
                tail = temp;
            }
            temp = temp.next;
            processCount++;
        }

        System.out.println("Average Waiting Time: " + (double) totalWaitingTime / processCount);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / processCount);
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.executeProcesses();
    }
}

