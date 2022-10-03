package j04_AritmeticOPerators.tasks;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//4-5
        x += x;//10
        --x;//9
        x = 7 + x;//16
        x *= x;//16*16
        x -= 3;//(16*16)-3

        System.out.println(" x = " + x );// 253
        
        int a = 3;//
        double d = 4.5;//

        d+=a;//7.5  =d
        a+=d;//10.5 ancak int a= 10
        d-=a;// -2.5  =d
        a-=d;//12.5 ancak int e göre ondalık yazılmaz    a=12

        System.out.println(" d = " + ++d );// -1.5
        System.out.println(" a = " + a-- );//
            System.out.println("işlem sonucu a=-1.5 olur"+"b=12 yazılır ancak değeri 11 dir");
        
        

	}

}
