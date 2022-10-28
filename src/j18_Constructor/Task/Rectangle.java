package j18_Constructor.Task;

public class Rectangle {
    /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */

    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public void alanBul() {

        double alan=width*length;
        System.out.println("dikdörtgen alanı = "+alan);
    }

    public void çevreBul() {

        double çevre=(width*2)+(length*2);
        System.out.println("dikdörtgen çevresi = "+çevre);
    }

    //RUNNER
    public static void main(String[] args) {
        Rectangle işlem1 = new Rectangle(7,9);


        işlem1.alanBul();
        işlem1.çevreBul();






    }

}


