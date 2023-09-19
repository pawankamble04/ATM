import java.util.*;
public class ATMInterface
{
    public static void main(String[] args) {

        int balance = 20000, withdraw, deposite,num;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to ATM Machine");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposite");
            System.out.println("3.Check Balance");
            System.out.println("4.EXIT");
             num = sc.nextInt();
            switch(num)

            {

                case 1:

                    System.out.println("Enter Amount to be withdraw");
                    withdraw = sc.nextInt();
                    if(balance>=withdraw)
                    {
                        balance = balance-withdraw;
                        System.out.println("balance Amount is: " +balance);
                        System.out.println("Please collect money");
                    }
                    else
                    {
            System.out.println("You dont have enough money for  withdraw "); 
                    }
                        System.out.println(" ");
                         break;
                case 2:
                    System.out.println("Enter Amount to be deposite");
                     deposite = sc.nextInt();
                    balance = balance+deposite;
                    System.out.println("Balance Amount is :" +balance);
                    System.out.println("Money has been deposited successfully");
                    System.out.println(" ");
                    break;
                case 3:

                    System.out.println("Balance of your Account is: "+balance);
                    System.out.println(" ");
                    break;


                case 4:

                    System.exit(0);
                    System.out.println(" ");

            }
        }
    }
}