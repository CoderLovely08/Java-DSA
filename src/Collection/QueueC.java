// package Collection;

// import java.time.OffsetDateTime;
// import java.util.ArrayDeque;
// import java.util.Comparator;
// import java.util.LinkedList;
// import java.util.PriorityQueue;
// import java.util.Queue;

// public class QueueC {
//     public static void myqueue() {
//         Queue<Integer> queue = new LinkedList<>();
//         // for (int i = 0; i < 7; i++) {
//         //     queue.offer(i);
//         // }
//         System.out.println(queue);
//         System.out.println(queue.poll());
//         System.out.println(queue.element());
//         System.out.println(queue);
//         /*
//         use offer instead of add
//         poll instead of remove
//         peek instead of element
//         */
//     }

//     public static void priorityQueue() {
//         // usually its a min heap
//         PriorityQueue p = new PriorityQueue<>(Comparator.reverseOrder());
//         //pass Comparator.reverseOrder();
//         //using this it will act as a max heap
//         p.offer(45);
//         p.offer(23);
//         p.offer(19);
//         System.out.println(p);
//         System.out.println(p.poll());
//         System.out.println(p);
//     }

//     //double ended queue
//     public static void deque() {
//         ArrayDeque ad=new ArrayDeque<>();
//         ad.offer(23);
//         ad.offerFirst(32);
//         ad.offerFirst(11);
//         ad.offer(212);
//         ad.offerLast(77);
//         System.out.println(ad);
//         System.out.println(ad.peekFirst());
//         System.out.println(ad.pollFirst());
//     }
//     public static void main(String[] args) {
//         deque();
//     }
// }
