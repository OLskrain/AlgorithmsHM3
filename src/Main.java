import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        PriorityQueue pq = new PriorityQueue(10);
        pq.insert(15);
        pq.insert(66);
        pq.insert(89);
        pq.insert(4);
        pq.insert(11);
        pq.insert(70);
        pq.insert(58);
        pq.insert(94);
        pq.insert(33);
        pq.insert(26);
        pq.insert(99); //добавили 11 строку
        while (!pq.isEmpty()) {
            System.out.printf("%3d", pq.remove());
        }
        System.out.println();

        //Задание 2
        LineFlip lineFlip = new LineFlip();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        System.out.println(lineFlip.coup(scanner.nextLine()));

        //Задание 3
        System.out.println();
        Deque deque = new Deque(6);
        deque.insertR(1);
        deque.insertL(2);
        deque.insertR(3);
        deque.insertL(4);
        deque.insertL(5);
        deque.insertR(6);
        deque.insertR(7); //этот элемен не войдет в Дек

//        while (!deque.isEmpty()) {
//            System.out.printf("%3d", deque.removeL());
//        }
        while (!deque.isEmpty()) {
            System.out.printf("%3d", deque.removeL());
        }

    }
}
