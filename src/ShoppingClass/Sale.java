package ShoppingClass;

public class Sale {
    private String date;
    private double serviceExpense;
    private double productExpense;
    Customer customer;
    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }
    public void displayInfo()
    {
        double serviceDiscount = customer.getServiceMemberDiscount(customer.getCustomerType());
        double productDiscount = customer.getProductMemberDiscount(customer.getCustomerType());
        double serviceDis = serviceExpense * serviceDiscount;
        double productDis = productExpense * productDiscount;
        double totalDiscount = serviceDis + productDis;
        double amount = getTotalExpense() - totalDiscount;
        System.out.println(" ----------------------Customer Information--------------------- ");
        System.out.println("ExerciseOne.Customer: ".concat(customer.getCustomerName()));
        System.out.println("Membership: " .concat(customer.getCustomerType()));
        System.out.println("Date(yyyy-mm-dd): ".concat (date));
        System.out.println(" ----------------------Transaction-----------------------------");
        System.out.println("Expense on Service: $".concat(serviceExpense+""));
        System.out.println("Discount: $".concat(serviceDiscount+""));
        System.out.println("Expense on Product : $".concat(productExpense+""));
        System.out.println("Discount: $" .concat(productDiscount+"") );
        System.out.println("Total Expense: $".concat (amount+""));
    }
}
