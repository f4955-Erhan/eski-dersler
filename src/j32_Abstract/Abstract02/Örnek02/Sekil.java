package j32_Abstract.Abstract02.Örnek02;

public abstract class Sekil {

    private String name;

    public Sekil(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract double alanHesapla();

    public  abstract double cevreHesapla();

    public String ciz(){
        return this.name+" çizildi";
    }


    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "\n sekil alanı :" + this.alanHesapla() +
                "\n sekil cevre = "+ this.cevreHesapla();
    }
}
