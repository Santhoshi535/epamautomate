package com.qa.util;

import com.qa.base.TestBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindRatio extends TestBase {

	public void flow(List<WebElement> cState,List<WebElement> cConfirmed, List<WebElement> cTested) {
	
	HashMap<String, Float> hp= new HashMap<String, Float>();
	for (int i = 0; i < 35; i++) {
		Float confirmed= (float) Integer.parseInt(cConfirmed.get(i).getAttribute("title").replaceAll(",", ""));
		Float tested= (float) Integer.parseInt(cTested.get(i).getAttribute("title").replaceAll(",", ""));
		Float ratio= (float) (tested / confirmed);
		hp.put(cState.get(i).getText(),ratio);

	}
	
	int count=0;
	Map<String, Float> hmSorted = sortByValue(hp);
	List<String> topStatelist = new ArrayList<String>();
	List<String> topConfirmed = new ArrayList<String>();
	List<String> topActive = new ArrayList<String>();
	List<String> topRecovered = new ArrayList<String>();
	for (Entry<String, Float> m : hmSorted.entrySet()) {
		if (count<3) {
			System.out.println(m.getKey()+" and "+m.getValue());
			topStatelist.add(m.getKey());
			topConfirmed.add(driver.findElement(By.xpath("(//div[text()='"+m.getKey()+"']//parent::div/following-sibling::div/div[@class='total'])[1]")).getAttribute("title"));
			topActive.add(driver.findElement(By.xpath("(//div[text()='"+m.getKey()+"']//parent::div/following-sibling::div/div[@class='total'])[2]")).getAttribute("title"));
			topRecovered.add(driver.findElement(By.xpath("(//div[text()='"+m.getKey()+"']//parent::div/following-sibling::div/div[@class='total'])[3]")).getAttribute("title"));
		}
		count++;
	}
	
	}

	public HashMap<String, Float> sortByValue(HashMap<String, Float> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Float> > list = 
               new LinkedList<Map.Entry<String, Float> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Float> >() { 
            public int compare(Map.Entry<String, Float> o1,  
                               Map.Entry<String, Float> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
		// Collections.sort(list,Collections.reverseOrder());
        // put data from sorted list to hashmap  
        HashMap<String, Float> temp = new LinkedHashMap<String, Float>(); 
        for (Map.Entry<String, Float> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
}
