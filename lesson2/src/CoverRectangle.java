public class CoverRectangle {
    public static void main(String[] args) {
        int width = 6, height = 8, radius = 5;
        double expected_radius = (Math.sqrt(width * width + height * height)) / 2 ;
        if (expected_radius <= radius)
            System.out.println("Окружность перекрывает отверстие");
        else
            System.out.println("НЕ перекрывает");
    }
}