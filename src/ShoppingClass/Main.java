package ShoppingClass;

public class Main {
    public static void main(String []args)
    {
        Customer cus1 = new Customer("Kheang", "Gold");
        Sale sale_cus1 = new Sale(cus1, "2024-02-11");
        sale_cus1.setServiceExpense(100);
        sale_cus1.displayInfo();
    }
}
