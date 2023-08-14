import java.util.Scanner;

class AtmInterface{
    String name;
    double balance = 10000;
    int pin;

    Scanner sc = new Scanner(System.in);
      
    public static void displayMenu(){
        System.out.println("Welcome to the ATM");
        System.out.println("1. deposit");
        System.out.println("4. check balance");
        System.out.println("2. WithDraw");
        System.out.println("3. Exit");
    }

    public void depositMoney(double amount ,int pin ){
        
        balance += amount;
        System.out.println("Money deposit successfully,");
        
        System.out.println("Your balance after deposit money is : " + balance);

    }

    public void withdraw_money(double amount , int pin){
        if(balance >= amount){
        balance -= amount;
        System.out.println("Available balance : " + balance);
        System.out.println("Please collect your money");  
        }else{
            System.out.println("Insufficient balance");
        }    
    }
}
    
class UserDetails extends AtmInterface{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        AtmInterface atm = new AtmInterface();     
        int pin;
        int choice;
        do{
            AtmInterface.displayMenu();
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the amount to be deposited :");
                    double amount = sc.nextDouble();
                    System.out.println("Enter he pin");
                    pin = sc.nextInt();
                    atm.depositMoney(amount,pin);
                    break;
                case 2:
                    System.out.println("Enter the amount to be WithDraw :");
                    amount = sc.nextDouble();
                    System.out.println("Enter the pin");
                    pin = sc.nextInt();
                    atm.withdraw_money(amount,pin);
                    break;
                case 3: 
                    System.out.println("Balance : "+atm.balance);  
                    System.out.println("");  
                    break;  
                case 4:
                    System.out.println("Exiting...");
                    break  ;
   
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        while (choice != 4);
        sc.close();
    }
}