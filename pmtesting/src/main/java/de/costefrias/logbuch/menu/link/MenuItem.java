package de.costefrias.logbuch.menu.link;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

public class MenuItem extends Panel {
	public MenuItem(String title, Class pageClass) {
		super("menuItem");

		BookmarkablePageLink pageLink = new BookmarkablePageLink("link", pageClass);
		pageLink.add(new Label("title", title));
		add(pageLink);
	}
}
