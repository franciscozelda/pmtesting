package de.costefrias.logbuch.pages.home;

import org.apache.wicket.markup.html.basic.Label;
import org.wicketstuff.annotation.mount.MountPath;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;

import de.costefrias.logbuch.base.BasePage;

@WicketHomePage
@MountPath("home")
public class HomePage extends BasePage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HomePage() {
		add(new Label("labelDashbord", "Dashbord"));
	}
}
