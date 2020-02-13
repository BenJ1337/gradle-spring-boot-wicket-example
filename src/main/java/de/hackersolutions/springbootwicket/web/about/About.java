package de.hackersolutions.springbootwicket.web.about;

import de.hackersolutions.springbootwicket.web.BasePage;
import de.hackersolutions.springbootwicket.web.home.HomePage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class About extends BasePage {

    public About(){
        add(new BookmarkablePageLink<String>("customersLink", HomePage.class));
    }
}
