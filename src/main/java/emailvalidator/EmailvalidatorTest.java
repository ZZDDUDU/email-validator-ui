package emailvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailvalidatorTest {

  
  private final static String[] acceptedEmails = 
  {"zhangzhidu@gmail.com","zhang.zhidu.zhang@gmail.com",};
  
  private final static String[] notacceptedEmails = 
  {"zhangzhidu123","zhangzhidu.com","zhangzhidu@gmailcom","zhang@zhidu123@.gmail.com","@zhangzhidu@gmail.com","zh",};
  @Test
  public void testAcceptedEmails() {
   Emailvalidator emailValidator = Emailvalidator.getInstance();
   assertNotNull(emailValidator);
   for (String email : acceptedEmails){
     boolean result = emailValidator.isValid(email);
     assertTrue(result);
   }
  }
 @Test
  public void TestRejectedEmails() {
    Emailvalidator emailValidator = Emailvalidator.getInstance();
    assertNotNull(emailValidator);
    for (String email : notacceptedEmails){
      boolean result = emailValidator.isValid(email);
      if (result == true){
        System.out.println("notacceptedEmails" +email);
      }
      assertFalse(result);   
    } 
  }
}
