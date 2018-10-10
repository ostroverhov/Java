package by.ostroverhov.lesson9.locales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Locales {
    private List<Locale> locales = Arrays.asList(new Locale("ru"), new Locale("by"), new Locale("en"));

   public Locale get(int i){
        return locales.get(i);
   }

   public int size() {
       return locales.size();
   }
}
