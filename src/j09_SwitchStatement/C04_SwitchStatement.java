package j09_SwitchStatement;


import java.util.Scanner;

public class C04_SwitchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*************** mevsimleri bulma ************");

        System.out.println("lütfen bir ay yazınız");
        String ay = scan.next().toUpperCase();

        switch (ay) {
            case "MART":
            case "NİSAN":
            case "MAYIS":
                System.out.println("ilkbahar");
                break;

            case "HAZİRAN":
            case "TEMMUZ":
            case "AĞUSTOS":
                System.out.println("yaz");
                break;

            case "EYLÜL":
            case "EKİM":
            case "KASIM":
                System.out.println("sonbahar");
                break;

            case "ARALIK":
            case "OCAK":
            case "ŞUBAT":
                System.out.println("kış");
                break;


            default:
                System.out.println();
                break;


        }


    }
}

