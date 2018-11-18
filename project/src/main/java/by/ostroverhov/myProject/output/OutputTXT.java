package by.ostroverhov.myProject.output;

import by.ostroverhov.myProject.drugs.Drug;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.List;

public class OutputTXT {
    private List<Drug> ourDrugs;

    public OutputTXT(List<Drug> ourDrugs) {
        this.ourDrugs = ourDrugs;
    }

    public void execute() throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("file.txt"));

        for (Drug d:ourDrugs) {
            dos.writeChars(d.getName());
            dos.writeChars("\t");
            dos.writeChars(d.getBatch());
            dos.writeChars("\t");
            dos.writeChars(Integer.toString(d.getAmountPackages()));
            dos.writeChars("\t");
            dos.writeChars(String.valueOf(d.getQualityControl()));
            dos.writeChars("\n");
        }
    }
}
