import java.util.Arrays;
import java.util.PriorityQueue;

// we can use primitive array in collections but we have to write comparator so that it will not how to compare
public class PrimitiveArrayCheck{

    public static void main(String[] args) {

//        int events[][]={{1,4},{4,4},{2,2},{3,4},{1,1}};
//        PriorityQueue<Integer[]> pq = new PriorityQueue<>();
//
//        int l = events.length;
//        for(int i=0; i<l; i++){
//            pq.add(IntStream.of(events[i]).boxed().toArray(Integer[]::new));
//        }

        // above will not work because comparator is not written
        // this method works because we are writing comparator
        int events[][]={{1,4},{4,4},{2,2},{3,4},{1,1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[0] == y[0]? x[1] - y[1]: x[0] -y[0]);

        int l = events.length;
        for(int i=0; i<l; i++){
            pq.add(events[i]);
        }
        while(pq.peek() != null){
            System.out.println(Arrays.toString(pq.poll()));
        }
    }

}
