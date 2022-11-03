package j25_Encapsulation.Task03;

public class BMI {
    /*
 Bmı classfields -> name, age, weight,height: encapsulated
getBMI() method -> bmi=weight/(height*height) returb type olmalı
 getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
 runner class obj ile dataları print eden code create ediniz
  */
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){

       double bmi=weight/(height*height);

        return bmi;
    }

    public void getStatus(){
        if (getBMI()<18.5){
            System.out.println("zayıfsınız");
        } else if (getBMI()<25) {
            System.out.println("normal");
        } else if (getBMI()<30) {
            System.out.println("kilolu");
        }else System.out.println("obez");


    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}