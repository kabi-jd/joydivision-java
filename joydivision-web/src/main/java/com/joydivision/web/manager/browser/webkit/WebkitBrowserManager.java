package com.joydivision.web.manager.browser.webkit;

import com.joydivision.web.manager.browser.AbstractBrowserManager;
import com.microsoft.playwright.Playwright;

/**
 * @author Kabi on 03-07-2021
 **/
public class WebkitBrowserManager extends AbstractBrowserManager {
    @Override
    public void launchBrowser() {
        if (null == playwright)
            playwright = Playwright.create();
        browser = playwright.webkit().launch(launchOptions);
    }
}
