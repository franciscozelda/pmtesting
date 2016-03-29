package de.costefrias.logbuch.pages.logbuch;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.wicketstuff.annotation.mount.MountPath;

import de.costefrias.logbuch.base.BasePage;
import de.costefrias.logbuch.pages.logbuch.form.submit.FormSubmitPage;

@MountPath("logbuch")
public class LogbuchPage extends BasePage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LogbuchPage() {
		add(new Label("labelLogbuch", "Logbuch"));
		
		add(new Link("addLogbuchForm") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void onClick() {
				PageParameters pageParameters = new PageParameters();
				pageParameters.add("id", 4);

				setResponsePage(FormSubmitPage.class, pageParameters);				
			}
			
		});
	}
}