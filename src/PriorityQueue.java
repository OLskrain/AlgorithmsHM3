public class PriorityQueue {
    private int[] queue;
    private int size;
    private int items;

    public PriorityQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        items = 0;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == size);
    }

    public void insert(int item) {
        if (isFull()){
            size *= 2;
            int[] temp = new int[size];
            System.arraycopy( queue, 0, temp,0, queue.length);
            queue = temp;
        }
        int i;
        if (items == 0)
            queue[items++] = item;
        else {
            for (i = items - 1; i >= 0; i--) {
                if (item > queue[i])
                    queue[i + 1] = queue[i];
                else
                    break;
            }
            queue[i + 1] = item; // Вставка элемента
            items++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        return queue[--items];
    }

    public long peek() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        return queue[items - 1];
    }
}
