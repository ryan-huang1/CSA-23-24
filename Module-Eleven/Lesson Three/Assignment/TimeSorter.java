import java.util.Arrays;
import java.util.Comparator;

public class TimeSorter {
    public static void main(String[] args) {
        String[] times = {"XII:XXV", "I:XX", "III:XLV", "IV:V"}; // Sample array
        
        // Convert to digital, sort, and then convert back to Roman
        Arrays.sort(times, new Comparator<String>() {
            public int compare(String time1, String time2) {
                String digitalTime1 = Roman.toDigital(time1);
                String digitalTime2 = Roman.toDigital(time2);
                return digitalTime1.compareTo(digitalTime2);
            }
        });
        
        // Convert sorted times back to Roman and print
        for (String time : times) {
            System.out.println(Roman.toDigital(time));
        }
    }
}
