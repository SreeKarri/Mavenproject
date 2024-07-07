package AutomationTesting.MavenAutomationProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTC1 {
@Test
public void AmazonRegistration() throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.com/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26pd_rd_w%3D0129n%26content-id%3Damzn1.sym.8b17d5d4-f780-4476-bbb4-5d216813632d%26pf_rd_p%3D8b17d5d4-f780-4476-bbb4-5d216813632d%26pf_rd_r%3D9H198EDEN0ESN5K1FN2P%26pd_rd_wg%3DqtTsy%26pd_rd_r%3D631aa50d-bb60-49b3-ae83-cba17c3bbe8f&openid.assoc_handle=anywhere_v2_us");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.manage().window().maximize();
	AmazonLogin a1=new AmazonLogin(d);
	a1.first_lastname();
	a1.ph();
	a1.Password();
	
	a1.contnue();
}
}
