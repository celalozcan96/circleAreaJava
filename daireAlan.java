package JavaOdev5;

//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

//Alan Formülü : π * r * r;

//Çevre Formülü : 2 * π * r;

//Ödev
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

//𝜋 sayısını = 3.14 alınız.

//Formül : (𝜋 * (r*r) * 𝛼) / 360

import java.util.Scanner;

public class daireAlan {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);        
        
        int r;
        int 𝛼;
        double pi = 3.14;

        System.out.print("Dairenin Yarı Çapını Giriniz:");
        r = radius.nextInt();
        System.out.print("Merkez Açısının Ölçüsü:");
        𝛼 = radius.nextInt();

        double area = pi*r*r;
        double circle = 2*pi*r;
        double areaOfCircleSegment = (pi*(r*r)*𝛼)/360;

        System.out.println("Dairenin Cevresi:" + circle);
        System.out.println("Dairenin Alani:" + area);        
        System.out.println("Daire Diliminin Alanı:" + areaOfCircleSegment);


    }
    
}
