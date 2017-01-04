package General;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.read.biff.BiffException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.bb.login.Login;
import com.bb.newuser.Newuser;
import com.bb.test.logout.Logout;

public class GeneralClass {
	public static void main(String[] args) throws InterruptedException, BiffException, IOException {			
		
			WebDriver Wd = new FirefoxDriver();
			Wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);     // Implicit wait 60 Sec 		
			
			Login lg = new Login(Wd, 0, 0);
			Thread.sleep(100);
			Newuser ru = new Newuser();
			Logout lo = new Logout(Wd);					

			lg.Login(Wd,1,1);                // TO Login 
			System.out.println("Login to BB Succussful !..");		
									
			/*ru.Newuser(Wd, 0, 0);
			System.out.println("User registeed Succussfully !..");			*/
						
			lo.Logout(Wd);				// TO Logout 
			System.out.println("Logout from BB Succussful !..");
			
			Wd.close();    				//close Firefox            
			System.exit(0);	          // exit the program explicitly		
						
				
	
	}
	
}  
