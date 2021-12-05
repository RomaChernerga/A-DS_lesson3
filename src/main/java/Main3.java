import Deque.Deque;
import Queue.Queue;
import Stack.Stack;
import Stack.StackImpl;
import Queue.QueueImpl;
import Deque.DequeImpl;

public class Main3 {
    public static void main(String[] args) {
//        testStack();
//        testQueue();
//        testDequeImpl();
    }

//    private static void testStack(){
//
//        Stack<Integer> stack = new StackImpl<Integer>(5);  // создаем стек
//        System.out.println(addToStack(stack, 1));
//        System.out.println(addToStack(stack, 2));
//        System.out.println(addToStack(stack, 3));
//        System.out.println(addToStack(stack, 4));
//        System.out.println(addToStack(stack, 5));
//        System.out.println(addToStack(stack, 6));
//
//        stack.display();
//
//        System.out.println("top value: "+ stack.pop() );  // извлекаем 1 элемент
//        System.out.println("top value: "+ stack.peek() ); // смотрим, какой теперь элемент стоит вверху стека
//        stack.display();
//    }
//    private static boolean addToStack(Stack<Integer> stack, int num) {
//        if (!stack.isFull()) {
//            stack.push(num);
//            return true;
//        }
//        return false;
//    }
//    private static void testQueue() {
//
//        Queue<Integer> queue = new QueueImpl<>(5);
////        Queue<Integer> queue = new PriorityQueueImp<>(6);
//
//        System.out.println("add element: " + queue.insert(10)); //пробует добавиться первым
//        System.out.println("add element: " + queue.insert(28)); //пробует добавиться вторым
//        System.out.println("add element: " + queue.insert(36)); //пробует добавиться третьим
//        System.out.println("add element: " + queue.insert(47)); //пробует добавиться четвертым
//        System.out.println("add element: " + queue.insert(58)); //пробует добавиться пятым
//        System.out.println("add element: " + queue.insert(69)); //пробует добавиться шестым
//
//        queue.display();
//        System.out.println("remove: " + queue.remove());// удаляем элемент
//        queue.display();
//    }

    private static void testDequeImpl() {

        DequeImpl<Integer> deque = new DequeImpl<>(6);


        System.out.println("add element: " + deque.insertRight(10)); //пробует добавиться справа
        System.out.println("add element: " + deque.insertRight(20)); //пробует добавиться справа
        System.out.println("add element: " + deque.insertLeft(30)); //пробует добавиться слева
        System.out.println("add element: " + deque.insertRight(40)); //пробует добавиться справа
        System.out.println("add element: " + deque.insertLeft(50)); //пробует добавиться слева
        System.out.println("add element: " + deque.insertLeft(60)); //пробует добавиться слева
        System.out.println("add element: " + deque.insertRight(70)); //пробует добавиться справа


        displayLeftToRight(deque);

//        deque.display();
    }
    private static <E> void insertRight(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }

}
