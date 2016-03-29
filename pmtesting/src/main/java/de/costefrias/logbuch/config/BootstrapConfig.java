package de.costefrias.logbuch.config;

import org.apache.wicket.protocol.http.WebApplication;

import com.giffing.wicket.spring.boot.context.extensions.ApplicationInitExtension;
import com.giffing.wicket.spring.boot.context.extensions.WicketApplicationInitConfiguration;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.settings.BootstrapSettings;
import de.agilecoders.wicket.core.settings.ThemeProvider;
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchTheme;
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchThemeProvider;

@ApplicationInitExtension
public class BootstrapConfig implements WicketApplicationInitConfiguration {

    @Override
    public void  init(WebApplication webApplication) {
        BootstrapSettings  settings = new BootstrapSettings();
        final ThemeProvider themeProvider = new BootswatchThemeProvider(BootswatchTheme.Spacelab);
        settings.setThemeProvider(themeProvider);

        Bootstrap.install(webApplication, settings);
    }
}
