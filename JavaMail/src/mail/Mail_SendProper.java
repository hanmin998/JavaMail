package mail;

import java.util.Properties;

public class Mail_SendProper {

	/**
	 * @param args
	 * 
	 * �����ʼ���Ҫʹ�õ���Ϣ
	 */
	private String Host;	//�����ʼ��ķ�����
	private String Post="25"; 	//�˿�
	private String SendAddress;	//�ʼ������ߵĵ�ַ
	private String ReceiveAddress; //�����ߵ�ַ
	
	private String userName;
	private String passWord;
	
	private boolean isvalidate=true;	//�Ƿ���Ҫ�����֤
	
	private String subject;	//�ʼ�����
	private String content;	//�ʼ�����
	
	private String[] attachFileNames;	//�ʼ�����������
	
	/**
	 * ��ȡ�ʼ��Ļػ�����
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
