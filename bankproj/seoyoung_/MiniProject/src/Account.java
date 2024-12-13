import java.util.Scanner;

public class Account {
    //계좌 번호, 소유 고객 ID, 잔액을 속성으로 가지며, 입금과 출금을 처리하는 메서드를 구현
    //잘못된 금액 또는 잔액 부족 시 예외를 발생시킵니다.
    Scanner scanner=new Scanner(System.in);
    Bank bank = new Bank(); //고객 정보가 담긴 배열 호출
    //배열에서 고객을 계좌번호를 통해 찾은 다음, 해당 고객의 잔액정보를 set
    String annountNum="";

    public void deposit(String accountNum){ //입금
        int balance=0; //잔액
        int money=scanner.nextInt();  //입금액
        money+=balance;

        if (money <= 0) {
            throw new Exception.InvalidTransactionException("입금 금액은 0보다 커야 합니다.");
        }
        bank.setMoney();
        System.out.println(money+"원이 입금되었습니다.");
    }

    public void withdraw(String annountNum){ //출금
        //출금액수
        int money=scanner.nextInt();

        bank.setMoney();
        System.out.println(money+"원이 인출되었습니다.");
    }
}
