package mail;

import java.util.Date;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 * �����ʼ�����
 * @author hanmin
 * @param args
 */
public class Send_Mail {

	/**
	 * ���ı���ʽ�����ʼ�
	 */
	public static boolean Mail_text(Mail_SendProper mailSender){
		
		MailAttorney attorney=null;
		//�ж��Ƿ���Ҫ������֤
		if(mailSender.isIsvalidate()){
			//�����Ҫ��֤ �ʹ���һ������У����
			attorney=new MailAttorney(mailSender.getUserName(),mailSender.getPassWord());
		}
		//�����ʼ��ػ����Ժ�����У��������һ�������ʼ���Session
		Session sendMailSession=Session.getInstance(mailSender.getProperties(), attorney);
		
		try{
			//����Session����һ���ʼ���Ϣ
			Message mailMessage=new MimeMessage(sendMailSession);
			//�����ʼ������ߵĵ�ַ
			Address from=new InternetAddress(mailSender.getSendAddress());
			mailMessage.setFrom(from);
			//�����������ʼ���ַ
			Address to=new InternetAddress(mailSender.getReceiveAddress());
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			//�����ʼ���Ϣ������
			mailMessage.setSubject(mailSender.getSubject());
			//�����ʼ�������
			mailMessage.setText(mailSender.getContent());
			//�����ʼ�����ʱ��
			mailMessage.setSentDate(new Date());
			//�����ʼ�
			Transport.send(mailMessage); 
			return true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mail_SendProper ms =new Mail_SendProper();
		ms.setHost("smtp.163.com");
		ms.setPost("25");
		ms.setIsvalidate(true);
		ms.setUserName("sdaubianyi@163.com");//163����
		ms.setPassWord("bianyi");//����
		ms.setSendAddress("sdaubianyi@163.com");//�ʼ������ߵ�ַ
		ms.setReceiveAddress("791895193@qq.com");//�����˵�ַ
		ms.setSubject("���");//�ʼ�����
		ms.setContent("���ǹ������յ���ͼ");//����
		boolean bl=Send_Mail.Mail_text(ms);
		if(bl){
			System.out.println("�ɹ�");
		}else{
			System.out.println("ʧ��");
		}
		
	}

}
