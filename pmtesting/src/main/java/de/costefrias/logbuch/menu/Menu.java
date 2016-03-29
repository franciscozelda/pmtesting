package de.costefrias.logbuch.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.wicket.ClassAttributeModifier;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;

import de.agilecoders.wicket.core.markup.html.bootstrap.image.GlyphIconType;

import de.costefrias.logbuch.menu.link.MenuItem;
import de.costefrias.logbuch.menu.link.PageLink;
import de.costefrias.logbuch.pages.home.HomePage;
import de.costefrias.logbuch.pages.logbuch.LogbuchPage;

public class Menu extends Panel {
	private final List<MenuItem> menuItemList = new ArrayList<>();

	public Menu(String id) {
		super(id);

//		add(new ListView("menuItemList", menuItemList) {
//			protected void populateItem(ListItem item) {
//				MenuItem menuItem = (MenuItem) item.getModelObject();
//				item.add(menuItem);
//			}
//		});
		menu();
	}

	private void menu() {
		List<PageLink> items = new ArrayList<>();
		items.add(new PageLink()
				.setText("Dashbord")
				.setIcon(GlyphIconType.dashboard)
				.setLinkClass(HomePage.class));
		items.add(new PageLink()
				.setText("LogBuch")
				.setIcon(GlyphIconType.listalt)
				.setLinkClass(LogbuchPage.class));

		ListView<PageLink> listView = new ListView<PageLink>("nav", items) {
			@Override
			protected void populateItem(ListItem<PageLink> item) {
				PageLink navBarItem = item.getModelObject();
				item.queue(new Label("text", navBarItem.getText()));
				item.queue(new BookmarkablePageLink<WebPage>("link", navBarItem.getLinkClass()));
				item.queue(new WebMarkupContainer("iconn") {
					@Override
					protected void onConfigure() {
						add(new ClassAttributeModifier() {
							@Override
							protected Set<String> update(Set<String> oldClasses) {
								oldClasses.clear();

								String name = navBarItem.getIcon().cssClassName();
								oldClasses.add(navBarItem.getIcon().cssClassName());
								return oldClasses;
							}

						});
						super.onConfigure();
					}

				});
			}
		};
		add(listView);
	}

	public void addMenuItem(MenuItem item) {
		menuItemList.add(item);
	}
}
