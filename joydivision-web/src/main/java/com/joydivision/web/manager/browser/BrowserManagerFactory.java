package com.joydivision.web.manager.browser;

import com.joydivision.web.manager.browser.chromium.ChromiumBrowserManager;
import com.joydivision.web.manager.browser.firefox.FirefoxBrowserManager;
import com.joydivision.web.manager.browser.webkit.WebkitBrowserManager;

/**
 * @author Kabi on 03-07-2021
 **/
public class BrowserManagerFactory {

    public static BrowserManager getBrowserManager
            (String browserType) {
        switch (browserType.toLowerCase()){
            case "firefox":
                return new FirefoxBrowserManager();
            case "webkit":
                return new WebkitBrowserManager();
            default:
                return new ChromiumBrowserManager();
        }
    }

}
