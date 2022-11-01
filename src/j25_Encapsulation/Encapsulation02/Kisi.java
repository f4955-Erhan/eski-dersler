package j25_Encapsulation.Encapsulation02;

public class Kisi {
/*
kişi pojo class için fields -> ad, soyad password(String) , yas tum fieldları kullanıcı
 */

    String name;
    String surname;
   private int yas;
    private String password;

    public Kisi(String name, String surname, int yas, String password) {
        this.name = name;
        this.surname = surname;
        this.yas = yas;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas); // mutlak değere alarak yaşı pozitif atadık
    }

    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yas=" + yas +
                ", password='" + password + '\'' +
                '}';
    }
}
