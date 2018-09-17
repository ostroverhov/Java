import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DrugList implements Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Drug[] ourDrugs;
    private int countDrugs;

    public DrugList(int countDrugs) {
        this.countDrugs = countDrugs;
        ourDrugs = new Drug[countDrugs];
    }

    public LocalDateTime parse(String dateProduction) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime dateTime = LocalDateTime.parse(dateProduction, format);
        return dateTime;
    }

    @Override
    public void input() {
        for (int i = 0; i < countDrugs; i++) {
            System.out.println("Введите номер: ");
            int id = SCANNER.nextInt();
            System.out.println("Введите название: ");
            String name = SCANNER.next();
            System.out.println("Введите лекформу: ");
            String drugform = SCANNER.next();
            System.out.println("Введите номер серии: ");
            int batch = SCANNER.nextInt();
            System.out.println("Введите дату производства: ");
            String hhh = SCANNER.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
            LocalDateTime productionDate = LocalDateTime.parse(hhh, formatter);
            System.out.println("Введите номер: ");
            Boolean qualityControl = SCANNER.nextBoolean();
            System.out.println("Введите количество упаковок: ");
            int amountPackages = SCANNER.nextInt();
            ourDrugs[i] = new Drug(id, name, drugform, batch, productionDate, qualityControl, amountPackages);
        }
    }

    public void output() {
        System.out.println(this);
    }
}
