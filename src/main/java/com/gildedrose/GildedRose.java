package com.gildedrose;

class GildedRose {
    SealedItem[] items;

    public GildedRose(SealedItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
	    items[i] = items[i].update();
        }
    }
}
