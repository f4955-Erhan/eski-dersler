package Home_Work.Project03;

public class Urun {
    double kraker= 2.5;
    double cips =2.2;
    double cocaCoal =2.2;
    double fanta =2.0;
    double su =1.0;
    double cay =1.5;
    double filtreKahve=1.99;
    int productNum;
    double price;

    public Urun() {
    }

    public Urun(double kraker, double cips, double cocaCoal, double fanta, double su, double cay, double filtreKahve, int productNum, double price) {
        this.kraker = kraker;
        this.cips = cips;
        this.cocaCoal = cocaCoal;
        this.fanta = fanta;
        this.su = su;
        this.cay = cay;
        this.filtreKahve = filtreKahve;
        this.productNum = productNum;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Urun Listesi = {" +
                "\nkraker(1)=" + kraker +
                "\n cips(2)=" + cips +
                "\n cocaCoal(3)=" + cocaCoal +
                "\n fanta(4)=" + fanta +
                "\n su(5)=" + su +
                "\n cay(6)=" + cay +
                "\n filtreKahve(7)=" + filtreKahve +
                "\n productNum(8)=" + productNum +
                "\n price(9)=" + price +
                '}';
    }
}
