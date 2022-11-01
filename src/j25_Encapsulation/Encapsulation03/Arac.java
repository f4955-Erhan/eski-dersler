package j25_Encapsulation.Encapsulation03;

public class Arac {

    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Arac(String model, String renk, int motor, int yil) {
        //kapsule ettik this motor this... da cons direk ulaşabildiğinde doğacak hatayı setMotor gibi
        // diğer set metodlarla handle ederek sonucu return ettik .


       // this.model = model;
        setModel(model);
       // this.renk = renk;
        setRenk(renk);
        //this.motor = motor;
        setMotor(motor);
       //this.yil = yil;
        setYil(yil);

    }

    public Arac() {
    }

    //    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
//    olan Araba  isimli bir class cretae ediniz.
//            2- bütün fieldları parametre alan bir constructor tanımlayınız.
//3- ArabaMain isminde main için bir class oluşturunuz.
//            4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
//5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.


    public void setModel(String model) {
        this.model = model;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setMotor(int motor) {

        if (motor>1000){
            this.motor = motor;

        }else {System.out.println("hatalı giriş yaptınız");
        this.motor =1001;
        }

    }

    public void setYil(int yil) {
        if (yil<0){
            yil*=-1;
            System.out.println("yıl negatif girildi hata düzeltilerek set edildi.");
            this.yil = yil;
        }else this.yil = yil;

    }

    public String getModel() {
        return model;
    }

    public String getRenk() {
        return renk;
    }

    public int getMotor() {

        return motor;
    }

    public int getYil() {
        return yil;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
