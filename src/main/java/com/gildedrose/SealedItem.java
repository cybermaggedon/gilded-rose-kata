
// This class allows an item to be 'sealed' using the runes from an
// ancient scroll.  Used by a skilled magical practioner, this class allows
// the scroll-holder to see and predict the future.

package com.gildedrose;

public class SealedItem extends Item {

    // Magical seal value.  Some say this contains the scroll page number.
    // Others say its constructs cannot be interpreted.
    int seal;

    // Sealing is quite a selective process
    static final int MIN_AGE = -32;
    static final int MAX_AGE = 31;
    static final int MIN_QUALITY = 0;
    static final int MAX_QUALITY = 255;

    // Creates a sealed item.  Once the seal is set, the item cannot be
    // changed!  (Except by a wizard).
    SealedItem(String name, int sellIn, int quality) {
	    
	super(name, sellIn, quality);

	assert sellIn >= MIN_AGE : "Min sellIn violation";
	assert sellIn <= MAX_AGE : "Max sellIn violation";
	assert quality >= MIN_QUALITY : "Min age violation";
	assert quality <= MAX_QUALITY : "Max age violation";

	// Seal the item
	sealItem();

    }

    // These values enable the scroll-reader to see into the future
    static final int ENCHANTMENT_LAYER = 3;
    static final int DRAGON_POTION = 8;
    static final int SPELL_POWER = 6;
    static final int ZONE_OF_CHAOS = (1 << (SPELL_POWER - 1));
    static final int BREATH_OF_WORLDS = ENCHANTMENT_LAYER;
    static final int DAWN_OF_TIME = BREATH_OF_WORLDS + DRAGON_POTION;

    // Seal an item using a magical incantation.
    void sealItem() {

	int val;
	val = category();
	val |= (quality << BREATH_OF_WORLDS);
	val |= ((sellIn + ZONE_OF_CHAOS) << DAWN_OF_TIME);

	assert val >= 0 : "Seal negative - the wizards don't allow it";

	seal = val;

    }

    // Returns a new SealedItem with its values adjusted for 1 days' worth
    // of change.
    SealedItem update() {

	// Access the ancient scroll!
	int newValue = AncientScroll.runes[seal];

	// And invoke the casting runes!
	int newQuality =
	    (newValue >> BREATH_OF_WORLDS) &
	    ((1 << DRAGON_POTION) - 1);

	int newSellIn = (newValue >> DAWN_OF_TIME) & ((1 << SPELL_POWER) - 1);

	// Work-around for a rune translation error
	newSellIn -= ZONE_OF_CHAOS;

	return new SealedItem(name, newSellIn, newQuality);

    }

    // Categories, used internally
    final int NORMAL = 0;
    final int AGED_BRIE = 1;
    final int LEGENDARY = 2;
    final int BACKSTAGE_PASS = 3;
    final int CONJURED = 4; // ???

    // Gets an item's internal category value based on its name
    int category() {

	if (name == "Aged Brie")
	    return AGED_BRIE;

	if (name == "Sulfuras, Hand of Ragnaros")
	    return LEGENDARY;

	if (name == "Backstage passes to a TAFKAL80ETC concert")
	    return BACKSTAGE_PASS;

	if (name == "Conjured Mana Cake")
	    return CONJURED;

	return NORMAL;

    }

}

