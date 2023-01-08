import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        sayi=input.nextInt();
        System.out.println("---------------------------------------------");
        System.out.println("4'ün Kuvvetleri");
        System.out.println("---------------------------------------------");
        for(int i=1; i<=sayi; i*=4)
        {
            System.out.println(i);
        }
        System.out.println("---------------------------------------------");
        System.out.println("5'in Kuvvetleri");
        System.out.println("---------------------------------------------");
        for(int i=1; i<=sayi; i*=5)
        {
            System.out.println(i);
        }
    }
}