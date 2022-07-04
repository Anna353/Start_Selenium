import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Start1 {
    WebDriver wd;

    @Test
    public void start(){

        wd = new ChromeDriver();

        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        //открывает просто сам сайт
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        //открывает сайт и запоминает разные переходы
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        //wd.close(); //one tab
        wd.quit();  //all tabs


    }
}
