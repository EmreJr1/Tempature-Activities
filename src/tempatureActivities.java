import java.util.Scanner;

public class tempatureActivities {

    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Derece Türünden Yazınız : ");
        heat=input.nextInt();

        if (heat<=5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat>5 && 15>heat) {
            System.out.println("Sinemaya gidebilirsiniz");
        }else if (heat>=15 && 25>heat){
            System.out.println("Pikniğe gidebilirsiniz");
        }else if (heat>=25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
