import java.util.Scanner;

class Queue {
    protected int rear, front, size, capacity;
    protected int[] arr;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = rear = size = 0;
    }

    public void enqueue(int item) {
        if(isFull()) {
            System.out.println("Queue full");
            return;
        } 
        arr[rear] = item;
        rear = (rear+1) % capacity;
        size++;
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue emoty");
            return -1;
        }
        int item = arr[front];
        front = (front+1) % capacity;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        int i = front;
        for(int j = 0;j<size;j++) {
            System.out.print(arr[i] + " ");
            i = (i+1) % capacity;
        }
        System.out.println();
    }

}

interface QueueMethods {
    public void enqueue(int item);
    public int dequeue();
    public int size();
    public boolean isFull();
    public boolean isEmpty();
    public void display();
}

class QueueClass implements QueueMethods {
    private Queue queue;

    public QueueClass(int capacity) {
        this.queue = new Queue(capacity);
    }

    public void enqueue(int item) {
        queue.enqueue(item);
    }

    public int dequeue() {
        return queue.dequeue();
    }

    public int size() {
        return queue.size();
    }

    public boolean isFull() {
        return queue.isFull();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        queue.display();
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of queue: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        QueueClass queue = new QueueClass(10);

        while(true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Count");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter an element in queue: ");
                    int e = sc.nextInt();
                    sc.nextLine();
                    queue.enqueue(e);
                    break;
                case 2:
                    int d = queue.dequeue();
                    if(d != -1) {
                        System.out.println("Dequeued element: "+d);
                    }
                    break;
                case 3:
                    System.out.print("Queue elements: ");
                    queue.display();
                    break;
                case 4:
                    System.out.print("Queue size: "+queue.size());
                    break;
                case 5:
                    System.out.println("Exited!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}