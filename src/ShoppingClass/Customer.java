package ShoppingClass;

public class Customer implements DiscountRate {
    private String customerName;
    private String CustomerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        CustomerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount(String type) {
        if(type.equals("Premium"))
            return 0.2;
        else if (type.equals("Gold")) {
            return 0.15;
        } else if (type.equals("Silver")) {
            return 0.1;
        }
        else
            return 0;
    }

    @Override
    public double getProductMemberDiscount(String type) {
        if(type.equals("Premium"))
            return 0.1;
        else if (type.equals("Gold")) {
            return 0.1;
        } else if (type.equals("Silver")) {
            return 0.1;
        }
        else
            return 0;
    }
}
