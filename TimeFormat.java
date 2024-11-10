public class TimeFormat {
    public static void main(String args[]) {

        String m = "AM";
        String time = args[0];
        String hours = time.substring(0, 2);
        String minutes = time.substring(2, 5);
        int hoursNum = Integer.parseInt(hours);

        if (hoursNum == 24){
            hoursNum = 0;
            }

        if (hoursNum >= 13){
            m = "PM";
            hoursNum -= 12;
            }

        System.out.print(hoursNum+minutes+" "+m);
    }
}