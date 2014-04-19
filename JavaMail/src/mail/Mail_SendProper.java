package mail;

import java.util.Properties;

public class Mail_SendProper {

	/**
	 * @param args
	 * 
	 * 发送邮件需要使用的信息
	 */
	private String Host;	//发送邮件的服务器
	private String Post="25"; 	//端口
	private String SendAddress;	//邮件发送者的地址
	private String ReceiveAddress; //接收者地址
	
	private String userName;
	private String passWord;
	
	private boolean isvalidate=true;	//是否需要身份验证
	
	private String subject;	//邮件主题
	private String content;	//邮件内容
	
	private String[] attachFileNames;	//邮件附件的名称
	
	/**
	 * 获取邮件的回话属性
	 * @return
	 */
	public Properties getProperties(){
		Properties p=new Properties();
		p.put("mail.smtp.host", this.Host);
		p.put("mail.smtp.port", this.Post);
		p.put("mail.smtp.auth", isvalidate?"true":"false");
		
		return p;
	}
	
	public String getHost() {
		return Host;
	}



	public void setHost(String host) {
		Host = host;
	}



	public String getPost() {
		return Post;
	}



	public void setPost(String post) {
		Post = post;
	}



	public String getSendAddress() {
		return SendAddress;
	}



	public void setSendAddress(String sendAddress) {
		SendAddress = sendAddress;
	}



	public String getReceiveAddress() {
		return ReceiveAddress;
	}



	public void setReceiveAddress(String receiveAddress) {
		ReceiveAddress = receiveAddress;
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



	public boolean isIsvalidate() {
		return isvalidate;
	}



	public void setIsvalidate(boolean isvalidate) {
		this.isvalidate = isvalidate;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String[] getAttachFileNames() {
		return attachFileNames;
	}



	public void setAttachFileNames(String[] attachFileNames) {
		this.attachFileNames = attachFileNames;
	}


}
