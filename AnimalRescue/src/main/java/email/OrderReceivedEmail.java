/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author vicken
 */
public class OrderReceivedEmail {
    
    // email that this program is sending from
    static String fromEmail = "vicken.test@gmail.com";
    // email that this program is sending to
    static String toEmail = "vicken.test@gmail.com";
    static String realEmail = "vickenmatiossian@gmail.com";
    // 16 digit generated 3rd party password for gmail that can be used only for this
    // my real password will not work
    final static String generatedPassword = "iwsoffinafnzguum";
      
    // main method to send the email to the recipient
    // recipient here does not work
    // the recipient in prepareMessage is the one that it actually sends to
    public static void main(String[] args) throws Exception {
        OrderReceivedEmail.orderReceived(toEmail);
    }
    
    
    public static void orderReceived(String recipient) throws Exception{
        System.out.println("Sending email...");
        Properties properties = new Properties();
        
        // specifies authentication in order to establish connection
        properties.put("mail.smtp.auth", "true");
        // setting this to true enables TLS for data transportation, which is more secure than SSL
        properties.put("mail.smtp.starttls.enable", "true");
        // mail host
        properties.put("mail.smtp.host", "smtp.gmail.com");
        // port number is 587
        properties.put("mail.smtp.port", "587");
        
        // create a mail session object
        // when declaring the session object, I also specified the username and password to gmail servers
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromEmail, generatedPassword);
            }
        });
        
        Message message = receivedMessage(session, fromEmail, recipient);
        
        // the following code sends the message
        Transport.send(message);
        System.out.println("Email sent successfully!");
    }

    private static Message receivedMessage(Session session, String email, String recipient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("Animal Rescue Shipping Update - RECEIVED");
            message.setText("Hello valued user, thank you for your purchase from the Animal Rescure website!\n\n"+
                    "This email is to inform you that the vendor has successfully received your order and is working on getting it out to you as soon as possible!\n\n"+
                    "_______________________________________\n\n"+
                    "If you have any questions, please reach out to the creators of this page, Vicken, Nikhil, and Farheen at vicken.test@gmail.com");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(SOSEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
