package oops;

public class BankApplication {
private double acc_number;
private String User_name;
private String email;
private String ph_number;
private double balence;

	public static void main(String[] args) {
		BankApplication b = new BankApplication();
		b.setAcc_number(54908967);
		b.setUser_name("vinay");
		b.setBalence(10000);
		b.setEmail("vinaysairi2@gmail.com");
		b.setPh_number("6304626261");
        System.out.println("Account Number : "+b.getAcc_number());
        System.out.println("User name : "+b.getUser_name());
        System.out.println("Balence : "+b.getBalence());
        System.out.println("Phone Number : "+b.getPh_number());
        System.out.println("Email_id: "+b.getEmail());
        
	}

	public double getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(double acc_number) {
		this.acc_number = acc_number;
	}

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPh_number() {
		return ph_number;
	}

	public void setPh_number(String ph_number) {
		this.ph_number = ph_number;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}
	public void deposit() {
		
	}

}
