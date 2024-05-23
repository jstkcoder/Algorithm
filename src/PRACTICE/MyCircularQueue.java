package PRACTICE;

public class MyCircularQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.head = -1;
        this.tail = -1;
        this.size = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
        }
        tail = (tail + 1) % capacity;
        queue[tail] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % capacity;
        }
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[head];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(1)); // true
        System.out.println(circularQueue.enQueue(2)); // true
        System.out.println(circularQueue.enQueue(3)); // true
        System.out.println(circularQueue.enQueue(4)); // false
        System.out.println(circularQueue.Rear()); // 3
        System.out.println(circularQueue.isFull()); // true
        System.out.println(circularQueue.deQueue()); // true
        System.out.println(circularQueue.enQueue(4)); // true
        System.out.println(circularQueue.Rear()); // 4
    }
}

