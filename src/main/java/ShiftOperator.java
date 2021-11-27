public class ShiftOperator {
    public static void main(String[] args) {
        int i = -20;
        System.out.println(Integer.toBinaryString(i) + " binary representation of " + i);
        i = i << 27;
        System.out.println(Integer.toBinaryString(i) + " binary representation of " + i);

    }
}
