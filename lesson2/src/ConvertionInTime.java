public class ConvertionInTime {
    public static void main(String[] args) {
        int time = 100000;
        int hours = time / 3600;
        time -= hours * 3600;
        int minutes = time / 60;
        time -= minutes * 60;
        int sec = time;
        System.out.println("Время:" + hours + ":" + minutes + ":" + sec);
    }
}