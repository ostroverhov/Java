package by.ostroverhov.myProject.Drugs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DrugList implements InputDrug, OutputDrug {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Drug[] ourDrugs;
    private int countDrugs;

    public DrugList(int countDrugs) {
        this.countDrugs = countDrugs;
        ourDrugs = new Drug[countDrugs];
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
            Date productionDate = parse(SCANNER.next());
            System.out.println("Введите номер: ");
            Boolean qualityControl = SCANNER.nextBoolean();
            System.out.println("Введите количество упаковок: ");
            int amountPackages = SCANNER.nextInt();
            ourDrugs[i] = new Drug(id, name, drugform, batch, productionDate, qualityControl, amountPackages);
        }
    }

    private Date parse (String date){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    @Override
    public void output() {
        for (int i = 0; i < countDrugs; i++) {
            System.out.println(ourDrugs[i]);
        }
    }
}
