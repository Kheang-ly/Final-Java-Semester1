package InputList;

import java.util.Scanner;

public class Input {
    private static final int size=100;
    private static int []a=new int[size];
    private static int count=0;
    public static int menu()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\n===================Menu=======================");
        System.out.println("Option:");
        System.out.println("1. Input Int Numbers");
        System.out.println("2. View Input Numbers");
        System.out.println("3. Exit");
        System.out.print("Input choice: ");
        int n=0;
        do
        {
            System.out.print(" Please Select Your option: ");
            n= input.nextInt();
        }while(n>3 && n<=0);
        return n;
    }
    public static void inputNumber()
    {
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.println(" Input any number or negative number to exit application: ");
            n=input.nextInt();
            if(n>=0)
            {
                a[count]=n;
                count++;
            }
        }while(n>=0);

    }
    public static void display()
    {
        for (int i = 0; i < count; i++) {
            System.out.println("Array Input: ".concat(a[i]+""));
        }
    }
}
