import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.println("  === 라이온 은행 시스템 ===");
            System.out.println("1. 회원등록\n2. 계좌생성\n3. 입금\n4. 송금\n5. 잔액조회\n6. 종료");
            System.out.println("  ```");
            int menu=scanner.nextInt();

            Customer customer=new Customer();
            Account account = new Account();
            Bank bank = new Bank();
            String accountNum="";
            String userId="";
            int balance=0;

            switch(menu){
                case 1:
                    try{
                        bank.saveCustomer();
                        userId=customer.getId();
                        System.out.println("회원등록이 완료되었습니다. : "+userId);
                    } catch(Exception.BankOperationException e){
                        System.err.println(e.getMessage());
                    }
                case 2:
                    try{
                        accountNum=bank.makeAccount(userId);
                        System.out.println("계좌번호가 생성되었습니다 : "+accountNum);
                    } catch(Exception.BankOperationException e){
                        System.err.println(e.getMessage());
                    }
                case 3:
                    try {
                        account.deposit(accountNum);
                    } catch(Exception.InvalidTransactionException e){
                        System.err.println(e.getMessage());
                    }
                case 4:
                    try {
                        account.withdraw(accountNum);
                    }catch(Exception.InvalidTransactionException e){
                        System.err.println(e.getMessage());
                    }
                case 5:
                    try {
                        bank.checkBalance(accountNum);
                        System.out.println("잔액 : " + balance);
                    } catch(Exception.AccountNotFoundException e){
                        System.err.println(e.getMessage());
                    }
                case 6:
                    break;
            }
        }
    }
}

