package Item32;

import java.util.EnumSet;
import java.util.Set;

/*
 * Item 32: Use EnumSet instead of bit fields
 */
public class Text {
	// EnumSet - a modern replacement for bit fields
	public enum Style {
		BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
	}

	// Any Set could be passed in, but EnumSet is clearly best
	public void applyStyles(Set<Style> styles) {
		System.out.println(styles);
	}
	
	public static void main(String[] args) {
		Text text = new Text();
		text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
	}
}
