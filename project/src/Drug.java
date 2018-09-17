import java.time.LocalDateTime;
import java.util.Date;

public class Drug {
    int id;
    String name;
    String drugform;
    int batch;
    Date productionDate;
    Boolean qualityControl;
    int amountPackages;

    public Drug(int id, String name, String drugform, int batch, Date productionDate, Boolean qualityControl, int amountPackages) {
        this.id = id;
        this.name = name;
        this.drugform = drugform;
        this.batch = batch;
        this.productionDate = productionDate;
        this.qualityControl = qualityControl;
        this.amountPackages = amountPackages;
    }


    @Override
    public String toString() {
        return "препарат{" +
                "номер=" + id +
                ", название='" + name + '\'' +
                ", лекформа='" + drugform + '\'' +
                ", серия=" + batch +
                ", дата производства=" + productionDate +
                ", контроль качества=" + qualityControl +
                ", количество упаковок=" + amountPackages +
                '}';
    }
}
