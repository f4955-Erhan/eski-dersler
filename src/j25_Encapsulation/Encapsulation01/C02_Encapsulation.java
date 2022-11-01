package j25_Encapsulation.Encapsulation01;

public class C02_Encapsulation {

    private String name="Erhan"; //kapsüllenmiş (korunmuş) name
    private int id=1001; //kapsüllenmiş (korunmuş) id

    public C02_Encapsulation(){

    }

    public C02_Encapsulation(String name, int id){

        this.name=name;
        this.id=id;
    }

   // public String isimVer(){//getter method
//
   //     return name;
   // }
//
   // public int idVer(){//getter method
//
   //     return id;
   // }
//
   // public void isimDeğis(String isim){//setter method
//
   //     this.name=isim;
//
   // }


    public String getName() {//generate den getirdik
        return name;
    }

    public int getId() {//generate den getirdik
        return id;
    }

    public void setName(String name) {//generate den getirdik
        this.name = name;
    }

    @Override
    public String toString() {
        return "C02_Encapsulation{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
