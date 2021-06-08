import java.util.*;
public class ATM_machine {
    public static void main(String[] args){
        int[] user = {123, 456, 789};
        int[] pin = {123, 456, 789};
        float[] balance = {10000, 50000, 60000};
        int a = 0;
        int b = 0;
        boolean status = false;
        boolean choice_status = true;
        int count = 4;
        for (int i:user){
            b = b + 1;
        }

        Scanner user_input = new Scanner (System.in);
        System.out.println("Please enter your debit card.");
        int x = user_input.nextInt();
        for (int j:user){
            if(j == x){
                System.out.println("Debit card recognize.");
                break;
            }
            else{
                a = a + 1;
            }
        }

        if (a == b){
            System.out.println("Debit card not recognize.");
            System.exit(0);
        }
        else{
            while (status == false){
                Scanner pin_input = new Scanner (System.in);
                System.out.println("Please enter your pin.");
                int y = pin_input.nextInt();
                if (y == pin[a]){
                    System.out.println("Access Granted.");
                    status = true;
                }
                else{
                    if (count >= 2){
                        count = count - 1;
                        System.out.println("Access Denied, " + count + " left before we blocked your card.");
                    }
                    else{
                        System.out.println("Sorry, we've blocked your card.");
                        System.exit(0);
                    }
                }
            }
        }
        
        System.out.println("Please enter one of the following commands:");
        System.out.println("1 - Balance Information");
        System.out.println("2 - Cash Withdrawals");
        System.out.println("3 - exit");

        Scanner choice_menu1 = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter \"1\", \"2\" or \"3\"");
        int choice1 = choice_menu1.nextInt();

        if (choice1 == 1){
            System.out.print("Your account balance is Rp. " + balance[a] + ".");
        }
        else if (choice1 == 2){
            Scanner cash_withdraw1 = new Scanner (System.in);
            System.out.println("Please enter the amount of your withdrawal.");
            float withdraw1 = cash_withdraw1.nextFloat();
            if (withdraw1 < balance[a]){
                balance[a] = balance[a] - withdraw1;
                System.out.println("Transaction completed.");
            }
            else{
                System.out.println("Your balance is not enough.");
            }
        }
        else if(choice1 == 3){
            System.out.println("Thank you very much.");
            System.exit(0);
        }
        
        do{
            System.out.println("Do you want to do other transaction? (Y/N)");
            Scanner continue_menu = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter \"Y\", \"N\"");

            String repeat = continue_menu.nextLine();
            char r = repeat.charAt(0);

            if (r == 'Y' || r == 'y'){
            }
            else if (r == 'N' || r == 'n'){
                choice_status = false;
                System.out.println("Thank you very much.");
                System.exit(0);
            }
            else{
                System.out.println("Please enter only Y/y or N/n only.");
            }

            System.out.println("Please enter one of the following commands:");
            System.out.println("1 - Balance Information");
            System.out.println("2 - Cash Withdrawals");
            System.out.println("3 - exit");

            choice_menu1 = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter \"1\", \"2\" or \"3\"");
            choice1 = choice_menu1.nextInt();

            if (choice1 == 1){
                System.out.print("Your account balance is Rp. " + balance[a] + ".");
            }
            else if (choice1 == 2){
                Scanner cash_withdraw1 = new Scanner (System.in);
                System.out.println("Please enter the amount of your withdrawal.");
                float withdraw1 = cash_withdraw1.nextFloat();
                if (withdraw1 < balance[a]){
                    balance[a] = balance[a] - withdraw1;
                    System.out.println("Transaction completed.");
                }
                else{
                    System.out.println("Your balance is not enough.");
                }
            }
            else if(choice1 == 3){
                choice_status = false;
                System.out.println("Thank you very much.");
            }
        }while(choice_status == true);
    }
}

