package de.costefrias.logbuch.menu;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;

import de.agilecoders.wicket.core.markup.html.bootstrap.image.GlyphIconType;

import de.costefrias.logbuch.menu.link.MenuItem;

public class Menu extends Panel {
	private final List<MenuItem> menuItemList = new ArrayList<>();

	public Menu(String id) {
		super(id);

		/*menuItemList.add(new MenuItem()
                .setT("Dashbord")
                .setIcon(GlyphIconType.warningsign)
                .setLinkClass(HomePage.class));*/
		
		add(new ListView("menuItemList", menuItemList) {
			protected void populateItem(ListItem item) {
				MenuItem menuItem = (MenuItem) item.getModelObject();
				item.add(menuItem);
			}
		});
	}
	
	public void addMenuItem(MenuItem item) {
		menuItemList.add(item);
	}
}
