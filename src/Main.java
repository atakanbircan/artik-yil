import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner input=new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        yil=input.nextInt();
        if (dordeBolunme(yil)){
            if (!yuzeBolunme(yil)){
                System.out.println(yil+" artık bir yıldır !");
            }
            else if(yuzeBolunme(yil)&&dortyuzeBolunme(yil)){
                System.out.println(yil+" artık bir yıldır !");
            }
            else if (yuzeBolunme(yil)&&!dortyuzeBolunme(yil)){
                System.out.println(yil+" artık bir yıl değildir !");
            }
        }
        else {
            System.out.println(yil+" artık bir yıl değildir !");
        }


    }
    public static boolean dordeBolunme(int a){
        if (a%4==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean yuzeBolunme(int b){
        if ((b&100)==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean dortyuzeBolunme(int c){
        if (c%400==0){
            return true;
        }
        else {
            return false;
        }
    }
}