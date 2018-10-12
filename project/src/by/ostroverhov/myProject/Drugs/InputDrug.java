package by.ostroverhov.myProject.drugs;

import by.ostroverhov.myProject.menu.MenuItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InputDrug implements MenuItem {
    private Scanner scanner = new Scanner(System.in);
    List<Drug> ourDrugs;

    public InputDrug(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    @Override
    public void execute() {
        System.out.println("Введите номер: ");
        int id = scanner.nextInt();
        System.out.println("Введите название: ");
        String name = scanner.next();
        System.out.println("Введите лекформу: ");
        String drugform = scanner.next();
        System.out.println("Введите номер серии: ");
        String batch = scanner.next();
        System.out.println("Введите дату производства: ");
        Date productionDate = parse(scanner.next());
        System.out.println("Контроль качества true/false: ");
        Boolean qualityControl = scanner.nextBoolean();
        System.out.println("Введите количество упаковок: ");
        int amountPackages = scanner.nextInt();
        ourDrugs.add(new Drug(id, name, drugform, batch, productionDate, qualityControl, amountPackages));
    }

    private Date parse(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
