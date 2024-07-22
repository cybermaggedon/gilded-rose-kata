package com.gildedrose;
import static org.junit.Assert.*;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void test_warm_jumper_neg30_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_0() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_1() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_2() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_3() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_5() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_8() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_9() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_10() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_11() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_12() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_13() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_15() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_16() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_20() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_24() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(37, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_39() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(38, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_52() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(51, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(78, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(78, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(78, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(78, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(78, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(78, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(78, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(78, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_80() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(79, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(108, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(108, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(108, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(108, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(108, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(108, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(108, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(108, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_110() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(109, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg30_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -30, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(148, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg25_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -25, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(148, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg20_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -20, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(148, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg10_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -10, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(148, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg3_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -3, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(148, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg2_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -2, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(148, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_neg1_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", -1, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(148, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_0_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 0, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(148, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_1_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 1, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_2_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 2, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_3_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 3, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_5_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 5, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_9_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 9, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_10_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 10, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_11_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 11, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_20_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 20, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_30_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 30, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_warm_jumper_31_150() {
        Item[] items = 
        new Item[] {
            new Item("Warm jumper", 31, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Warm jumper", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(149, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_0() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_1() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_2() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_3() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_5() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_8() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_9() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_10() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_11() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_12() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_13() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_15() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_16() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_20() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_24() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_39() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_52() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_80() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_110() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg30_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -30, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg25_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -25, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg20_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -20, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg10_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -10, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg3_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -3, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg2_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -2, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_neg1_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", -1, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_0_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 0, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_1_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 1, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_2_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 2, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_3_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 3, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_5_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 5, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_9_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 9, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_10_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 10, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_11_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 11, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_20_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 20, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_30_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 30, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_aged_brie_31_150() {
        Item[] items = 
        new Item[] {
            new Item("Aged Brie", 31, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_0() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_1() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_2() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_3() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_5() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_8() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_9() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_10() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_11() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_12() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_13() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_15() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_16() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_20() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_24() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(24, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_39() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(39, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_52() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_80() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_110() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg30_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -30, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-30, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg25_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -25, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-25, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg20_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -20, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-20, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg10_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -10, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-10, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg3_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -3, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg2_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -2, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_neg1_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_0_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_1_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 1, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_2_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_3_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 3, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_5_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 5, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_9_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 9, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_10_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 10, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_11_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 11, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(11, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_20_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 20, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(20, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_30_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 30, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_sulfuras__hand_of_ragnaros_31_150() {
        Item[] items = 
        new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 31, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(31, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_0() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_1() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 1)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_2() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 2)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(3, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_3() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 3)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(4, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_5() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 5)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_8() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 8)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_9() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 9)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(10, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_10() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 10)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(11, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_11() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 11)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_12() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 12)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(15, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_13() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 13)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(14, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_15() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 15)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(16, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_16() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 16)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(17, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(23, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(22, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_20() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 20)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(27, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(27, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(27, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(27, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(26, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_24() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 24)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(25, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(42, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(42, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(42, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(42, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(41, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_39() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 39)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(40, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_52() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 52)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(52, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_80() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_110() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 110)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(110, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg30_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -30, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-31, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg25_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -25, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-26, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg20_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -20, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-21, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg10_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -10, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-11, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg3_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -3, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-4, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg2_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_neg1_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", -1, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_0_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_1_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_2_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 2, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_3_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 3, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_5_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_9_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 9, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(8, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_10_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_11_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 11, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_20_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(19, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_30_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 30, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(29, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

    @Test
    public void test_backstage_passes_to_a_tafkal80etc_concert_31_150() {
        Item[] items = 
        new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 31, 150)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(30, app.items[0].sellIn);
        assertEquals(150, app.items[0].quality);
     }

}
