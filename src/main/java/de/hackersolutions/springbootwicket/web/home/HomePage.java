package de.hackersolutions.springbootwicket.web.home;

import de.hackersolutions.springbootwicket.web.BasePage;
import de.hackersolutions.springbootwicket.web.about.About;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;


public class HomePage extends BasePage {
    public HomePage(){
        add(new BookmarkablePageLink<String>("customersLink", About.class));
    }
}
