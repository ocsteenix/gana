package exceptionEx;
//은행 계좌 클래스 (국민은행) -> 멤버변수 접근제한자로 보호, getter, setter 설정
public class Account {
	//멤버 변수
	String accountNo; //계좌번호
	String ownerName; //예금주 이름
	int balance; //잔액
	
	//생성자
	public Account() {
		
	}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//'예금한다'는 메소드
	void deposit(int amount) {
		balance+=amount;
	}
	
	//'인출한다'는 메소드
	int withdraw(int amount) throws InsufficientException {
		if(balance < amount) {
			throw new InsufficientException("잔고 부족("+(amount-balance)+ "원 모자람)");
		}
		balance-=amount;
		return amount;
	}
	
}
