package com.gabba;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        AppLogic appLogic = new AppLogic();
        appLogic.startBrowser();
        //Page page = new Page(appLogic.getDriver());
        //PageIT pageIT = new PageIT(appLogic.getDriver());
        PageFR pageFR = new PageFR(appLogic.getDriver());
        pageFR.cleanWorkingDirectory();
        pageFR.userLogin("azhaleiko", "123456");
        pageFR.userGoToFRLang();
        pageFR.getPageCode();
        pageFR.getScreenShots();
        appLogic.closeBrowser();
    }
}
