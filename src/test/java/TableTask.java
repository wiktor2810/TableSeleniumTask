import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TableTask extends Base{

    @Test
    public void TableTask(){
        driver.get("http://toolsqa.com/automation-practice-table/");
        ArrayList<Skyscraper> listOfScyscrapers = new ArrayList<Skyscraper>();
        List<WebElement> list = driver.findElements(By.tagName("tr"));

        for(int i = 2; i < 6;i++) {
            List<WebElement> cells = list.get(i).findElements(By.tagName("td"));
            String structure = list.get(i).findElement(By.cssSelector("th")).getText();
            String country = cells.get(0).getText();
            String city = cells.get(1).getText();
            int height = Integer.valueOf(cells.get(2).getText().substring(0,3));
            int build = Integer.valueOf(cells.get(3).getText());
            int rank = Integer.valueOf(cells.get(4).getText());
            String details = cells.get(5).getText();
            Skyscraper skyscraper = new Skyscraper(structure, country, city, height, build, rank, details);
            listOfScyscrapers.add(skyscraper);
        }


        for(int i = 0; i < listOfScyscrapers.size(); i++) {
            String structure = listOfScyscrapers.get(i).getStructure();
            String[] expectedList = {"Burj Khalifa", "Clock Tower Hotel", "Taipei 101", "Financial Center"};
            Assert.assertEquals(structure, expectedList[i]);
        }


        int n = 400 + (int)(Math.random() * ((800 - 400) + 1));
        System.out.println(n);


        for(int i = 0; i < listOfScyscrapers.size(); i++){
            int height = listOfScyscrapers.get(i).getHeight();
            if(height > n){
                System.out.println(listOfScyscrapers.get(i).getStructure());
            }
        }
    }
}
