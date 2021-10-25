import java.util.HashMap;

public class EnumerationImp2 {
    public enum Weekdays{
        Monday( 0),
        Tuesday(1),
        Wednesday(2),
        Thursday(3),
        Friday(4),
        Saturday(5),
        Sunday(6);

        private int value;

        Weekdays(int i) {
            this.value = i;
        }
    }

    public static void main(String[] args) {
        String string = "Tuesday";
        System.out.println(Weekdays.valueOf(string).value);
    }
}
