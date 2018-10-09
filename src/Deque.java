public class Deque {

    private int[] deque;
    private int size;
    private int head;
    private int tail;
    private int items; //счетчик наполнения

    public Deque(int size) {
        this.size = size;
        this.deque = new int[size];
        head = -1;
        tail = -1;
        items = 0;
    }

    public boolean insertR(int value) {
        if (isFull()) {
            return false;
        }
        if (tail == size - 1) {
            tail = -1;
        }
        deque[++tail] = value;
        items++;
        return true;
    }

    public int removeR() {
        if (isEmpty()) {
            throw new RuntimeException(" is empty");
        }
        if (tail < 0) {
            tail = size - 1;
        }
        int result = deque[tail];
        tail--;
        items--;
        return result;
    }

    public boolean insertL(int value) {
        if (isFull()) {
            return false;
        }
        if (head < 0) {
            head = size - 1;
        }
        deque[head] = value;
        head--;
        items++;
        return true;
    }

    public int removeL() {
        if (isEmpty()) {
            throw new RuntimeException(" is empty");
        }
        if (head == size - 1) {
            head = -1;
        }
        head++;
        int result = deque[head];
        items--;
        return result;
    }

    public boolean isEmpty() {
        return items == 0;
    }

    public boolean isFull() {
        return items == size;
    }
}