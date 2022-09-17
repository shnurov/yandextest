import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница Яндекс Маркета
 */


public class MainPage {

    public MainPage(String url){
        Selenide.open(url);
    }
    private final SelenideElement menuButton = $x("//button[@id=\"catalogPopupButton\"]");
    private final SelenideElement pcButton = $x("//a[@href=\"/catalog--kompiuternaia-tekhnika/54425\"]");
    private final SelenideElement laptopButton = $x("//a[@href=\"/catalog--noutbuki-v-saratove/54544/list?hid=91013\"]");
    private final SelenideElement manufacturerLaptopCheak = $x("//label[@data-auto=\"filter-list-item-152981\"]");
    private final SelenideElement minPrice = $x("/html/body/div[4]/div[2]/div/div[1]/div/div[5]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[1]/div/fieldset/div/div/div/span[1]/div/div/input");
    private final SelenideElement maxPrice = $x("/html/body/div[4]/div[2]/div/div[1]/div/div[5]/div/div/div/div/div/div[2]/div/div[4]/div/div/div/div/div[1]/div/fieldset/div/div/div/span[2]/div/div/input");


    /**
     * выбор категории Ноутбуки
     */


    public void clickOnMenu() throws InterruptedException {
        Thread.sleep(10000);
        menuButton.click();
        Thread.sleep(2000);
        pcButton.click();
        Thread.sleep(10000);
        laptopButton.click();
        Thread.sleep(2000);

    }


    /**
     * выбор производителя
     *
     */

    public void sort() throws InterruptedException {
        manufacturerLaptopCheak.click();
        Thread.sleep(2000);


    }

    /**
     * сортировка по цене
     */

    public void searchMinMax(String searchString1, String searchString2)  {
        minPrice.click();
        minPrice.setValue(searchString1);
        maxPrice.click();
        maxPrice.setValue(searchString2);
    }

}
