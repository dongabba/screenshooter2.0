package com.gabba;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        AppLogic appLogic = new AppLogic();
        appLogic.startBrowser();
        //Page page = new Page(appLogic.getDriver());
        //PageIT pageIT = new PageIT(appLogic.getDriver());
        PageENG pageENG = new PageENG(appLogic.getDriver());
        //PageFR pageFR = new PageFR(appLogic.getDriver());
        pageENG.cleanWorkingDirectory();
        pageENG.userLogin("azhaleiko", "123456");
        pageENG.userGoToITLang();
        pageENG.getPageCode();
        pageENG.getScreenShots();
        appLogic.closeBrowser();
    }
}
