package com.joydivision.web.manager.browser;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;


public abstract class AbstractBrowserManager
        implements BrowserManager {

    protected Browser browser;
    protected Playwright playwright;
    protected BrowserType.LaunchOptions launchOptions;

    @Override
    public void closeBrowser() {
        if (null != browser && browser.isConnected()) {
            browser.close();
            browser = null;
        }
    }

    @Override
    public Browser getBrowser() {
        if (null == browser)
            launchBrowser();
        return browser;
    }

    @Override
    public BrowserManager setLaunchOptions
            (BrowserType.LaunchOptions launchOptions) {
        this.launchOptions = launchOptions;
        return this;
    }
}
