import java.util.Scanner;
public class tekSayiToplayan {
    public static void main(String[] args) {

        int a;
        int total=0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz:");
            a = input.nextInt();
            if(a%4 == 0){
                total = total + a;
            }
        }while (a%2 == 0);

        System.out.print("Toplam: "+total);
    }
}