import java.util.Scanner;

public class bearsweight {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int a=Scan.nextInt(),b = Scan.nextInt(); // a = weight of Limak and b = weight of Bob.
      //  if(a>b){
       //     System.out.println("0");
       // }
        int count = 0;
        while(a<=b){
            a *=3;
            b = b*2;
            count = count + 1;
        }
        if(a>b){
            System.out.println(count);
        }
    }
}
