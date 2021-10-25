import java.util.HashMap;

public class Enumeration {
    public enum Weekdays{
        Monday("Monday", 0),
        Tuesday("Tuesday",1),
        Wednesday("Wednesday",2),
        Thursday("Thursday",3),
        Friday("Friday",4),
        Saturday("Saturday",5),
        Sunday("Sunday",6);

        private String stringValue;
        private int value;

        static HashMap<String, Integer> hm = new HashMap<>();

        static{
            for(Weekdays w: values()){
                hm.put(w.getStringValue(), w.getValue());
            }
        }

        Weekdays(String i, int j) {
            this.stringValue = i;
            this.value = j;
        }

        private int getValue(){
            return this.value;
        }

        private String getStringValue(){
            return this.stringValue;
        }

        public static int getDayNumber(String s){
            return hm.getOrDefault(s, -1);
        }
    }

    public static void main(String[] args) {
        String string = "Wednesday";
        System.out.println(Weekdays.getDayNumber(string));
    }
}
