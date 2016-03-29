package de.costefrias.logbuch.pages.logbuch.form.submit;

import java.util.Arrays;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.wicketstuff.annotation.mount.MountPath;

import de.costefrias.logbuch.base.BasePage;
import de.costefrias.logbuch.pages.logbuch.LogbuchPage;
import de.costefrias.logbuch.pages.logbuch.entity.LogbuchRepository;
import de.costefrias.logbuch.validator.NoEmptyValidator;

@MountPath("addlogbuch")
public class FormSubmitPage extends BasePage
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//make Google selected by default
	private String selected = "Google";

	public FormSubmitPage(final PageParameters parameters) {
		add(new Label("linkAddLogbuch", "Logbuch erfassen"));

		add(new FeedbackPanel("feedback"));

		// Repo
//		final LogbuchRepository repository
		
		final TextField<String> logbuchName = new TextField<String>("title", Model.of(""));
		logbuchName.setRequired(true);
		//		name.add(new UsernameValidator());

		Form<?> form = new Form<Void>("form") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit() {
				info("Selected search engine : " + selected);

				final String usernameValue = logbuchName.getModelObject();

				PageParameters pageParameters = new PageParameters();
				pageParameters.add("title", usernameValue);
				setResponsePage(LogbuchPage.class, pageParameters);
			}
		};

		form.add(new Label("paneltitle", "Neue Logbuch"));

		// Form project title
		final TextField<String> projectname = new TextField<String>("projectname", Model.of(""));
		projectname.setRequired(true);
		projectname.add(new NoEmptyValidator());
		form.add(new Label("projectname", "Projektname"));

		// Form project PT
		final TextField<String> projectpt = new TextField<String>("inputpt", Model.of(""));
		projectpt.setRequired(true);
		projectpt.add(new NoEmptyValidator());
		form.add(new Label("titlept", "Budget in PT"));

		// form Project start and End
		final TextField<String> dateStart = new TextField<String>("inputStart", Model.of(""));
		projectpt.setRequired(true);
		//		projectpt.add(new NoEmptyValidator());
		form.add(new Label("labelStart", "Start"));

		final TextField<String> dateEnd = new TextField<String>("inputEnd", Model.of(""));
		projectpt.setRequired(true);
		//		projectpt.add(new NoEmptyValidator());
		form.add(new Label("labelEnd", "Ende"));

		// Kosten
		final TextField<String> budget = new TextField<String>("inputBudget", Model.of(""));
		budget.setRequired(true);
		//		projectpt.add(new NoEmptyValidator());
		form.add(new Label("labelBudget", "Kosten"));

		// List of User
		DropDownChoice<String> manager = new DropDownChoice<String>(
				"managers", new PropertyModel<String>(this, ""), Arrays.asList(new String[] {"Francisco", "Nils", "Pedro" }));
		form.add(new Label("labelManager", "Manager"));

		// Back to logbuch
		form.add(new Link("backToLogbuch") {
			@Override
			public void onClick() {
				setResponsePage(LogbuchPage.class);				
			}

		});

		add(form);
		form.add(logbuchName, projectpt, dateStart, dateEnd, manager, budget);
		//		form.add(projectname);
	}

}
