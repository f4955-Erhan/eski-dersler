package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaskBakkal {

    static ArrayList<String> günler = new ArrayList<>(Arrays.asList("pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"));
    static ArrayList<Double> günlükKazanç = new ArrayList<>();
    static int toplamKazanç = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (günlükKazanç.size() < günler.size()) {
            System.out.println("lütfen " + günler.get(günlükKazanç.size()) + " günü kazancını giriniz :");
            double kazanc= scan.nextDouble();
            günlükKazanç.add(kazanc);
            toplamKazanç+=kazanc;
        }
        getOrtalamaKazanç();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();

        System.out.println("ortlamanın altında kalan günler ="+getOrtalamaninAltindaKazancGünleri());
        System.out.println("ortlamanın üstündeki günler ="+getOrtalamaninUstundeKazancGünleri());
    }
    public static List<String> getOrtalamaninAltindaKazancGünleri() {
        List<String>OrtlamaAlt=new ArrayList<>();
        for (int i = 0; i < günlükKazanç.size(); i++) {
            if (günlükKazanç.get(i) < getOrtalamaKazanç()) {
                OrtlamaAlt.add( günler.get(i));
            }
        }
        return OrtlamaAlt;
    }
    public static List<String> getOrtalamaninUstundeKazancGünleri() {
        List<String>OrtlamaÜst=new ArrayList<>();
        for (int i = 0; i < günlükKazanç.size(); i++) {
            if (günlükKazanç.get(i) > getOrtalamaKazanç()) {
               OrtlamaÜst.add(günler.get(i));
            }
        }
        return OrtlamaÜst;
    }
    public static int getOrtalamaKazanç() {

        int ortalamaKazanc = toplamKazanç / günlükKazanç.size();
        return ortalamaKazanc;
    }
}




