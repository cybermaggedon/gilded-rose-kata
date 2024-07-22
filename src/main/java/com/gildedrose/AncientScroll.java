// This class manages an ancient scroll.  Don't try to understand it.
// IT CANNOT BE UNDERSTOOD!  (because it uses a regexp).

// This class contains no instantiable data, everything is static, because
// the scroll was created before Java had classes.

package com.gildedrose;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class AncientScroll {

    // The runes from the scroll.  Why are runes integers?  If you have
    // to ask, you won't understand the answer.
    public static int[] runes;

    // Static, because ancient scroll invocation must not be done explicitly.
    // This has been forbidden since the dawn of the age of magic.

    static {

	// Reads the runes from the ancient scroll in the current directory.

	try {

	    // Open an ancient scroll and allocate a buffer
	    File file = new File("ancient-runes.txt");
	    byte[] bytes = new byte[(int) file.length()];

	    // Read the scroll's content as bytes.
	    FileInputStream fis = new FileInputStream(file);
	    fis.read(bytes);
	    fis.close();

	    // Turn into runes, using an ancient casting spell
	    String[] valueStr = new String(bytes).trim().split("\\s+");

	    // Allocate a rune array
	    runes  = new int[valueStr.length];

	    // Convert tokens into magical rune values
	    for (int i = 0; i < valueStr.length; i++) 
		runes[i] = Integer.parseInt(valueStr[i]);

	} catch (java.io.FileNotFoundException e) {

	    // Java doesn't support the right exceptions for scroll
	    // reading, so we have to improvise
	    System.out.println("The ancient scroll has disappeared!");

	} catch (java.io.IOException e) {

	    // Exception improvisation part 2
	    System.out.println("You try to read the scroll...");
	    System.out.println("You only see meaningless symbols.");

	}
	    
    }

}

