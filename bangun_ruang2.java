import java.util.*;
public class bangun_ruang2{
    float sisi;
    float tinggi;
    float hasil;
    public static void main(String[] args){
        bangun_ruang2 a = new bangun_ruang2();
        a.sisi = 10;
        a.tinggi = 20;
        a.hasil = 30;
        boolean status = true;
        do{
            System.out.println("Silahkan pilih bangun ruang yang ingin anda hitung: ");
            System.out.println("1 - Area Kubus");
            System.out.println("2 - Volume Kubus");
            System.out.println("3 - Area Tabung");
            System.out.println("4 - Volume Tabung");
            System.out.println("5 - Area Bola");
            System.out.println("6 - Volume Bola");
            System.out.println("7 - Keluar");

            Scanner choice_menu = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter \"1\", \"2\", \"3\", \"4\", \"5\", \"6\", or \"7\"");
            int choice = choice_menu.nextInt();

            if (choice == 1){
                a.area_kubus();
                System.out.println(" ");
            }
            
            else if (choice == 2){
                a.volume_kubus();
                System.out.println(" ");
            }
            else if(choice == 3){
                a.area_tabung();
                System.out.println(" ");
            }

            else if(choice == 4){
                a.volume_tabung();
                System.out.println(" ");
            }
            else if(choice == 5){
                a.area_bola();
                System.out.println(" ");
            }
            else if(choice == 6){
                a.volume_bola();
                System.out.println(" ");
            }
            else if(choice == 7){
                System.out.println("Program akan ditutup.");
                status = false;
                System.out.println(" ");
                System.exit(0);
            }
            else{
                System.out.println("Tolong hanya masukkan 1 - 7.");
            }

            System.out.println("Apakah anda masih ingin melakukan perhitungan lainnya? (Y/N)");
            Scanner continue_menu = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter \"Y\", \"y\", \"N\", \"n\"");
            System.out.println(" ");

            String repeat = continue_menu.nextLine();
            char r = repeat.charAt(0);

            if (r == 'Y' || r == 'y'){
                System.out.println(" ");
                System.out.println(" ");
            }
            else if (r == 'N' || r == 'n'){
                status = false;
                System.out.println("Program akan ditutup.");
                System.out.println(" ");
            }
            else{
                System.out.println("Tolong hanya memasukkan Y/y atau N/n saja.");
                System.out.println(" ");
            }
        }while (status == true);
    }
    
    public void area_kubus(){
        float area = sisi * sisi;
        System.out.println("Area kubus adalah : " + area + "m^2.");
    }

    public void volume_kubus(){
        float volume = sisi * sisi * sisi;
        System.out.println("Volume kubus adalah : " + volume + "m^3.");
    }

    public void area_tabung(){
        float volume = 2 * (22 / 7) * sisi * sisi;
        System.out.println("Area tabung adalah : " + area + "m^2.");
    }

    public void volume_tabung(){
        float volume = (22 / 7) * sisi * sisi * tinggi;
        System.out.println("Volume tabung adalah : " + volume + "m^3.");
    }

    public void area_bola(){
        float volume = 4 * (22 / 7) * sisi * sisi;
        System.out.println("Area bola adalah : " + area + "m^2.");
    }

    public void 
        volume_bola(){
        float volume = (4/3) * (22 / 7) * sisi * sisi * sisi;
        System.out.println("Volume bola adalah : " + volume + "m^3.");
    }
}
