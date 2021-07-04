package com.joydivision.web.manager.browser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;


public interface BrowserManager {

    void launchBrowser();

    Browser getBrowser();

    void closeBrowser();

    BrowserManager setLaunchOptions(
            BrowserType.LaunchOptions launchOptions);

}
