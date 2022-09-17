import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class YaTest extends BaseTest {

    private final static String BASE_URL = "https://market.yandex.ru/";
    private final static String MANUFACTURER = "lenovo";
    private final static String MIN_PRICE = "25000";
    private final static String MAX_PRICE = "30000";

    @Test
    public void cheakGoods() throws InterruptedException {

        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.clickOnMenu();
        mainPage.sort();
        mainPage.searchMinMax(MIN_PRICE, MAX_PRICE);



        ElementsCollection hrefs = $$x("/html/body/div[4]/div[2]/div/div[1]/div/div[5]/div/div/div/div/div/div[1]/div/div[6]//a[@href]");
        List<String> links = new ArrayList<>();

        for(int i = 0; i <hrefs.size(); i++){
            links.add(hrefs.get(i).getAttribute("href"));
        }

            for (int i = 0; i < links.size(); i++) {
                Assert.assertTrue(links.get(i).contains(MANUFACTURER));
            }

        }

    }


