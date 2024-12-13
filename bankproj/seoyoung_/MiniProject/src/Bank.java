import java.util.Random;
import java.util.Scanner;

class Bank {
    private Customer[] customers = new Customer[100];
    //계좌번호, 잔액, ID
    private int count = 0; // 현재 등록된 고객 수

    public String makeAccount(String id){ //계좌생성
        Random random = new Random();
        String accountNum = "";
        //한 아이디당 계좌는 5개까지만 생성가능(throw)

        //13자리 무작위숫자 생성
        for(int i=0;i<13;i++){
            accountNum+=random.nextInt(10);
        }
        return accountNum;
    }
    public void saveCustomer() { // 고객 등록 메소드
        // 아이디 입력받아 고객 배열에저장 후 계좌번호 생성, 배열에 저장
        Scanner scanner=new Scanner(System.in);
        String id=scanner.nextLine();
        String accountNum = makeAccount(id);

        //아이디 입력받고 배열에 저장하는 작업
        customers[count] = new Customer(accountNum, money, id);
        count++;

        // 중복 비허용
        //아이디 100개까지만 생성가능(throw)

    }

    public void checkBalance(String accountNum) { //계좌번호로 잔액조회
        for (int i = 0; i < count; i++) {
            if (customers[i].getAccountNum().equals(accountNum)) {
                System.out.println(customers[i].getMoney());
            }
            else{
                throw new Exception.AccountNotFoundException("계좌를 찾을 수 없습니다 : " + accountNum);
            }
        }
    }
    
//    public void findUser(){ //검색으로 고객 찾기
//
//    }
}

