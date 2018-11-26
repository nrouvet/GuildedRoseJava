package edu.insightr.gildedrose;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {

    protected Inventory inv ;
    Item[] ancienneListeDesItems;

    @Before
    public void setUp() {
        inv = new Inventory();
        ancienneListeDesItems = inv.getItem();
    }

    @After
    public void teadDown(){
    }

    @Test
    public void testupdateEqualityWhenSellInFinished() throws  Exception {
        inv.updateQuality();
        Item[] items = inv.getItem();
        for(int i=0; i<items.length;i++){
            if(ancienneListeDesItems[i].getSellIn()==0 && items[i].getName() != "Sulfuras, Hand of Ragnaros"){
                assertEquals(ancienneListeDesItems[i].getQuality()-2, items[i].getQuality());
            }
        }
    }


}
