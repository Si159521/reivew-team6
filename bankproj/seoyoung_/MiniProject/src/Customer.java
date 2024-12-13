public class Customer {
    private String accountNum;
    private int money;
    private String id;

    public Customer(String accountNum, int money, String id) {
        this.accountNum = accountNum;
        this.money = 0;
        this.id = id;
    }
    public Customer(){}

    public String getAccountNum() {
        return accountNum;
    }
    public int getMoney() {
        return money;
    }
    public String getId() {
        return id;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
