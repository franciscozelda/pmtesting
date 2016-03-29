package de.costefrias.logbuch.pages.logbuch;

import org.apache.wicket.markup.html.basic.Label;
import org.wicketstuff.annotation.mount.MountPath;

import de.costefrias.logbuch.base.BasePage;

@MountPath("logbuch")
public class LogbuchPage extends BasePage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LogbuchPage() {
		add(new Label("labelLogbuch", "Logbuch"));
	}
}