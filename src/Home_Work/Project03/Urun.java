package Home_Work.Project03;

public class Urun {
    double kraker= 2.5;
    double cips =2.2;
    double cocaCola =2.2;
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
        this.cocaCola = cocaCoal;
        this.fanta = fanta;
        this.su = su;
        this.cay = cay;
        this.filtreKahve = filtreKahve;
        this.productNum = productNum;
        this.price = price;
    }


    @Override
    public String toString() {
        return "    Urun Listesi    " +
                "\n (1)kraker-------->" + kraker +" ₺" +
                "\n (2)cips---------->" + cips +" ₺"+
                "\n (3)cocaCoal------>" + cocaCola+" ₺" +
                "\n (4)fanta--------->" + fanta +" ₺"+
                "\n (5)su------------>" + su +" ₺"+
                "\n (6)cay----------->" + cay +" ₺"+
                "\n (7)filtreKahve--->" + filtreKahve +" ₺"+
                "\n (8)paraEkle" +
                "\n (0)exıt"
                ;
    }
}
