import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, month,day = 0;
        String ket=null;
        System.out.print("Masukan Tahun : ");
        year=input.nextInt();
        System.out.print("Masukan Bulan : ");
        month=input.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day=31;
                ket = "ganjil";
            break;
            case 4:
            case 6:
            case 9 :
            case 11:
                day=30;
                ket = "genap";
            break;
            case 2 :
                day = (year%4==0 && year%100!=0 || year%400==0)? 29 : 28;
                ket = (year%4==0 && year%100!=0 || year%400==0)? "ganjil" : "genap";
            break;
            default:
                System.out.println("Masukan Tidak Valid");
        }
        System.out.println("Pada Bulan "+month+" Tahnun "+year);
        System.out.println("Memiliki jumlah hari : "+day+" ("+ket+") ");
        
        input.close();
    }
}
