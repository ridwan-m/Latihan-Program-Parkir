import java.util.Scanner;

public class Latihan {
    public static void main(String []args) {
        int lamaparkir;
        int biayaparkir=0;
        int biayaparkirnext=0;
        int total;

        Scanner Obj=new Scanner(System.in);
        System.out.print("Plat Nomor  : ");
        String plat = Obj.nextLine();
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Jenis       : ");
        int jenis = Obj.nextInt();
        System.out.print("Jam Masuk   : ");
        int jmasuk = Obj.nextInt();
        System.out.print("Jam Keluar  : ");
        int jkeluar = Obj.nextInt();

        if(jmasuk>jkeluar){
            jkeluar=jkeluar+24;
        }
    
        System.out.println();
        System.out.println("Plat: " +plat);
        
        if(jenis==1){
            System.out.println("Kendaraan: Mobil");
            biayaparkir = 5000;
            biayaparkirnext = 3000;
        }else if(jenis==2){
            System.out.println("Kendaraan: Motor");
            biayaparkir = 3000;
            biayaparkirnext = 1500;
        }

        lamaparkir=jkeluar-jmasuk;
        System.out.println("Lama Parkir: "+lamaparkir+" Jam");
        if(lamaparkir==1){
            total = biayaparkir;
            System.out.println("Biaya Parkir: "+total);
        }
        else if(lamaparkir>1){
            total = biayaparkir+((lamaparkir-1)*biayaparkirnext);
            System.out.println("Biaya Parkir: "+total);
        }
    }
}