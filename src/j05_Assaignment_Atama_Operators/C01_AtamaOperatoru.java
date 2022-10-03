package j05_Assaignment_Atama_Operators;

public class C01_AtamaOperatoru {
    public static void main(String[] args) {


        //    =	        x = 8	    x = 8
        //    +=	    x += 3	    x = x + 3
        //    -=	    x -= 3	    x = x - 3
        //    *=	    x *= 3	    x = x * 3
        //    /=	    x /= 3	    x = x / 3
        //    %=	    x %= 3	    x = x % 3

        int yas=33;

        System.out.println("yas = " + yas);

        System.out.println(yas + 5); //atama yapmaz yas a

        System.out.println(yas +=11  ); // atana yapar "yas" ın yeni değeri olur

        System.out.println(yas +=1 + yas);

        System.out.println("yas = " + yas);

    }
}
