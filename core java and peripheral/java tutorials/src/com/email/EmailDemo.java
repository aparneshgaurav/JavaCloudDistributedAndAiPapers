package com.email;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
public class EmailDemo {
	public static void main(String args[])throws Exception{
		HtmlEmail htmlEmail=new HtmlEmail(); 
		DefaultAuthenticator authenticator=new DefaultAuthenticator("aparnesh.gaurav@mu-sigma.com","password$1234"); 
		htmlEmail.setDebug(true);
		htmlEmail.setHostName("smtp.collaborationhost.net"); 
		htmlEmail.setSmtpPort(587); 
		htmlEmail.setAuthenticator(authenticator); 
		htmlEmail.setFrom("aparnesh.gaurav@mu-sigma.com"); 
		htmlEmail.addTo("aparnesh.gaurav@mu-sigma.com"); 
		htmlEmail.addCc("Dinesh.Mahalingam@mu-sigma.com");
		htmlEmail.setSubject("HI");

		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("D:/testImage.jpg");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  htmlEmail.attach(attachment);
		
		
		htmlEmail.setMsg("hi"); 
		htmlEmail.send();
		System.out.println("**************DATA SENT SUCCESSFULLY**************");
	}
}