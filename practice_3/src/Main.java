import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ucgenin bir kenarini giriniz: ");
        int knr_1 = scan.nextInt();

        System.out.println("ucgenin ikinci kenarini giriniz: ");
        int knr_2 = scan.nextInt();

        double hipotenüs = (Math.pow(knr_1,2) + Math.pow(knr_2,2));
        hipotenüs = Math.sqrt(hipotenüs);
        System.out.println("hipotenus kenari : " + hipotenüs);

    }

}