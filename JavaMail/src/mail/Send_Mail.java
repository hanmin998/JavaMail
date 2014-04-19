package mail;

import java.util.Date;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 * 用于邮件发送
 * @author hanmin
 * @param args
 */
public class Send_Mail {

	/**
	 * 以文本方式发送邮件
	 */
	public static boolean Mail_text(Mail_SendProper mailSender){
		
		MailAttorney attorney=null;
		//判断是否需要生成验证
		if(mailSender.isIsvalidate()){
			//如果需要验证 就创建一个密码校验器
			attorney=new MailAttorney(mailSender.getUserName(),mailSender.getPassWord());
		}
		//根据邮件回话属性和密码校验器构造一个发送邮件的Session
		Session sendMailSession=Session.getInstance(mailSender.getProperties(), attorney);
		
		try{
			//根据Session创建一个邮件消息
			Message mailMessage=new MimeMessage(sendMailSession);
			//创建邮件发送者的地址
			Address from=new InternetAddress(mailSender.getSendAddress());
			mailMessage.setFrom(from);
			//创建接收者邮件地址
			Address to=new InternetAddress(mailSender.getReceiveAddress());
			mailMessage.setRecipient(Message.RecipientType.TO, to);
			//设置邮件消息的主题
			mailMessage.setSubject(mailSender.getSubject());
			//设置邮件的内容
			mailMessage.setText(mailSender.getContent());
			//设置邮件发送时间
			mailMessage.setSentDate(new Date());
			//发送邮件
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
		ms.setUserName("sdaubianyi@163.com");//163邮箱
		ms.setPassWord("bianyi");//密码
		ms.setSendAddress("sdaubianyi@163.com");//邮件发送者地址
		ms.setReceiveAddress("791895193@qq.com");//接收人地址
		ms.setSubject("你好");//邮件标题
		ms.setContent("我是果果，收到截图");//内容
		boolean bl=Send_Mail.Mail_text(ms);
		if(bl){
			System.out.println("成功");
		}else{
			System.out.println("失败");
		}
		
	}

}
