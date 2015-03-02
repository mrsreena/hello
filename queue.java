import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class queue {
public static void main(String args[]){
	Queue<Integer> q=new LinkedList<Integer>();
	Queue<Integer> q1=new PriorityQueue<Integer>();
	q.add(10);
	q1.add(10);
	q.add(20);
	q1.add(20);
	q.add(5);
	q1.add(5);
	System.out.println(q.poll());
	System.out.println(q1.poll());
}
}
