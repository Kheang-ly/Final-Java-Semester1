package InputList;

public class Main {
    public static void main(String []args)
    {
        int choice=0;
        do {
            choice=Input.menu();
            switch (choice)
            {
                case 1:
                    Input.inputNumber();
                    break;
                case 2:
                    Input.display();
                    break;
                case 3:
                    System.out.println("Thank you! ");
                    break;
                default:
                    System.out.println("Error 404 not found ");
                    break;
            }
        }while(choice<3);
    }
}
