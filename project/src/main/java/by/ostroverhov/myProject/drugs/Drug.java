package by.ostroverhov.myProject.drugs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Drug<T> {
    private int id;
    private String name;
    private String drugform;
    private String batch;
    private Date productionDate;
    private Boolean qualityControl;
    private int amountPackages;

    SimpleDateFormat sdf = new SimpleDateFormat("MM.yyyy");

    public Drug(int id, String name, String drugform, String batch, Date productionDate, Boolean qualityControl, int amountPackages) {
        this.id = id;
        this.name = name;
        this.drugform = drugform;
        this.batch = batch;
        this.productionDate = productionDate;
        this.qualityControl = qualityControl;
        this.amountPackages = amountPackages;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public int getAmountPackages() {
        return amountPackages;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public String getDrugform() {
        return drugform;
    }

    public Boolean getQualityControl() {
        return qualityControl;
    }

    @Override
    public String toString() {
        return "препарат{" +
                "#=" + id +
                ", название='" + name + '\'' +
                ", лекформа='" + drugform + '\'' +
                ", серия=" + batch +
                ", дата производства=" + sdf.format(productionDate) +
                ", контроль качества=" + qualityControl +
                ", количество упаковок=" + amountPackages +
                '}';
    }
}
