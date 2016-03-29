package de.costefrias.logbuch.menu.link;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.util.io.IClusterable;

import de.agilecoders.wicket.core.markup.html.bootstrap.image.IconType;

public class PageLink implements IClusterable {

    private String text;
    
    private IconType icon;
    
    private List<PageLink> items = new ArrayList<>();
    
    private Class<? extends WebPage> linkClass;
    
    public String getText() {
        return text;
    }

    public PageLink setText(String text) {
        this.text = text;
        return this;
    }

    public IconType getIcon() {
        return icon;
    }

    public PageLink setIcon(IconType icon) {
        this.icon = icon;
        return this;
    }

    public List<PageLink> getItems() {
        return items;
    }

    public PageLink setItems(List<PageLink> items) {
        this.items = items;
        return this;
    }
    
    public PageLink addItem(PageLink item) {
        this.items.add(item);
        return this;
    }

    public Class<? extends WebPage> getLinkClass() {
        return linkClass;
    }

    public PageLink setLinkClass(Class<? extends WebPage> linkClass) {
        this.linkClass = linkClass;
        return this;
    }

}
