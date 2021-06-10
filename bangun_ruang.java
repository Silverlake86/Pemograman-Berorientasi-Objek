import java.util.*;
public class bangun_ruang {
    public static void main(String[] args){
        boolean status = true;
        float data;
        float tinggi;
        float hasil;
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
                Scanner input = new Scanner(System.in);
                System.out.println("Silahkan masukkan sisi kubus anda: ");
                data = input.nextFloat();
                hasil = area_kubus(data);
                System.out.println("Area kubus anda adalah: " + hasil + "m^2.");
                System.out.println(" ");
            }
            
            else if (choice == 2){
                Scanner input = new Scanner(System.in);
                System.out.println("Silahkan masukkan sisi kubus anda: ");
                data = input.nextFloat();
                hasil = volume_kubus(data);
                System.out.println("Volume kubus anda adalah: " + hasil + "m^3.");
                System.out.println(" ");
            }
            else if(choice == 3){
                Scanner input = new Scanner(System.in);
                System.out.println("Silahkan masukkan radius tabung anda: ");
                data = input.nextFloat();
                hasil = area_tabung(data);
                System.out.println("Area tabung anda adalah: " + hasil + "m^2.");
                System.out.println(" ");
            }

            else if(choice == 4){
                Scanner input = new Scanner(System.in);
                System.out.println("Silahkan masukkan radius tabung anda: ");
                data = input.nextFloat();
                Scanner inputs = new Scanner(System.in);
                System.out.println("Silahkan masukkan tinggi tabung anda: ");
                tinggi = input.nextFloat();
                hasil = volume_tabung(data, tinggi);
                System.out.println("Volume tabung anda adalah: " + hasil + "m^3.");
                System.out.println(" ");
            }
            else if(choice == 5){
                Scanner input = new Scanner(System.in);
                System.out.println("Silahkan masukkan radius bola anda: ");
                data = input.nextFloat();
                hasil = area_tabung(data);
                System.out.println("Area bola anda adalah: " + hasil + "m^2.");
                System.out.println(" ");
            }
            else if(choice == 6){
                Scanner input = new Scanner(System.in);
                System.out.println("Silahkan masukkan radius bola anda: ");
                data = input.nextFloat();
                hasil = area_tabung(data);
                System.out.println("Volume bola anda adalah: " + hasil + "m^3.");
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
    
    public static float area_kubus(float a){
        float area = a * a;
        return area;
    }

    public static float volume_kubus(float a){
        float volume = a * a * a;
        return volume;
    }

    public static float area_tabung(float a){
        float volume = 2 * (22 / 7) * a * a;
        return volume;
    }

    public static float volume_tabung(float a, float b){
        float volume = (22 / 7) * a * a * b;
        return volume;
    }

    public static float area_bola(float a){
        float volume = 4 * (22 / 7) * a * a;
        return volume;
    }

    public static float volume_bola(float a){
        float volume = (4/3) * (22 / 7) * a * a * a;
        return volume;
    }
}
