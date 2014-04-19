package mail;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
public class MailAttorney extends Authenticator{

	/**
	 * @param args
	 */
	//登陆服务器的用户名和密码
	private String userName; 
	private String passWord;
	
	public MailAttorney(String userName,String passWord){
		this.userName=userName;
		this.passWord=passWord;
	}
	
	//覆盖父类的该方法，获得密码的认证器
	protected PasswordAuthentication getPasswordAuthentication(){
		PasswordAuthentication pa=new PasswordAuthentication(userName,passWord);
		return pa;
		
	}
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


}
