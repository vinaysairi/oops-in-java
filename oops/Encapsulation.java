package oops;
class Bank{
	private int acc_no;
	private String user_name;
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.setAcc_no(549089);
		b.setUser_name("vinay");
		System.out.println("Account number : "+b.getAcc_no()+ " Holder Name : "+b.getUser_name());
	}

}
