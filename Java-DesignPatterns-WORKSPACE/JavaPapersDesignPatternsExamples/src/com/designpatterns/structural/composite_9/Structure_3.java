package com.designpatterns.structural.composite_9;

import java.util.ArrayList;
import java.util.List;

public class Structure_3 implements Group_1 {
	// Collection of child groups.
	private List<Group_1> groups = new ArrayList<Group_1>();

	public void assemble() {
		for (Group_1 group : groups) {
			group.assemble();
		}
	}

	// Adds the group to the structure.
	public void add(Group_1 group) {
		groups.add(group);
	}

	// Removes the group from the structure.
	public void remove(Group_1 group) {
		groups.remove(group);
	}
}
