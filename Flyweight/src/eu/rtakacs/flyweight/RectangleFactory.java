package eu.rtakacs.flyweight;

import java.awt.Color;
import java.util.HashMap;

public class RectangleFactory {

	// The HashMap uses the color as the key for every
	// rectangle it will make up to 8 total
	private static final HashMap<Color, Rectangle> rectsByColor = new HashMap<Color, Rectangle>();

	public static Rectangle getRect(Color color) {
		Rectangle rect = rectsByColor.get(color);

		// Checks if a rectangle with a specific color has been made.
		// If not it makes a new one, otherwise it returns one made already
		if (rect == null) {
			rect = new Rectangle(color);
			// Add new rectangle to HashMap
			rectsByColor.put(color, rect);
		}
		return rect;
	}
}
