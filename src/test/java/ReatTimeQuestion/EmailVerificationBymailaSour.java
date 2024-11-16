package ReatTimeQuestion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class EmailVerificationBymailaSour {
	

public class EmailVefication {
	
	  @Test 
	  public void testExample() throws IOException, MailosaurException {
	    // Available in the API tab of a server
	    String apiKey = "NANYqtSL5fZpEobr3WgbcEW73VZeAXCA";
	    String serverId = "l1v0bimh";
	    String serverDomain = "l1v0bimh.mailosaur.net";

	    MailosaurClient mailosaur = new MailosaurClient(apiKey);

	    MessageSearchParams params = new MessageSearchParams();
	    params.withServer(serverId);

	    SearchCriteria criteria = new SearchCriteria();
	    criteria.withSentTo("blanket-military@" + serverDomain);
        Message message = mailosaur.messages().get(params, criteria);
        
	    System.out.println(message.subject());
	    System.out.println(message.cc());
	    System.out.println(message.to().get(0).email());
	    System.out.println(message.from().get(0).email());
	    
	    //Body Information
	    System.out.println("----Body--");
	    System.out.println(message.text().body());
	    
	    //How many links are their
	    System.out.println(message.html().links().size());
	    

	    assertNotNull(message);
	    assertEquals("Email Verification", message.subject());
	  }
	}
	  

}
