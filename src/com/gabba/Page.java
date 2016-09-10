package com.gabba;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by gabba on 03.04.2016.
 */
public class Page {
    private WebDriver driver;
    private WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    By loginField = By.id("P101_USERNAME");
    By passwordField = By.id("P101_PASSWORD");
    By loginButton = By.id("P101_LOGIN");

    //====Кнопки===
    By erstellenButton = By.linkText("erstellen"); //Erstellen Создать
    By zurückButton = By.linkText("zurück"); //Zurück Назад
    By bearbeitenButton = By.linkText("bearbeiten"); //Редактировать
    By abbrechenButton = By.linkText("abbrechen"); //Отменить
    By speichernButton = By.linkText("speichern"); //Сохранить
    By hinzufügenButton = By.linkText("hinzufügen"); //Добавить

    //===Sport===
    By sportLink = By.linkText("Sport");
    By spieleLink = By.linkText("Spiele"); //Spiele Матчи
    By firstLink = By.cssSelector(".even>td>a>img"); //открыть матч
    By spielerLink = By.linkText("Spieler"); //Spieler Игроки
    //===Игроки===
    By alleLink = By.linkText("Alle"); //Все
    By mitarbeiterLink = By.linkText("Mitarbeiter"); //Сотрудники
    By firstPlayerLink = By.cssSelector(".even>td>a"); //первый игрок
    By wichtigsteAngabenLink = By.linkText("Wichtigste Angaben"); //Основные элементы
    By weitereInformationenLink = By.linkText("Weitere Informationen"); //Дальнейшая информация
    By dokumenteDesSpielersLink = By.linkText("Dokumente des Spielers"); //Документы игрока
    By kontakteLink = By.linkText("Kontakte/Verwandten"); //Контакты/Родственники
    By mannschaftenPlayerLink = By.xpath("//div[@class='t20VerticalSidebarList']//a[6]"); //Команда
    By trainerPlayerLink = By.linkText("Trainer"); //Тренеры
    By trainingsLink = By.linkText("Trainings / Spiele"); //Тренировки/Игры
    By beruflicheEntwicklungLink = By.linkText("Berufliche Entwicklung"); //Профессиональное развитие
    By medizinLink = By.linkText("Medizin"); //Медицина

    By mannschaftenLink = By.linkText("Mannschaften"); //Mannschaften Команды
    //===Команды===
    By alleMannschaftenLink = By.linkText("Alle Mannschaften"); //Все команды
    By aktiveLink = By.linkText("Aktive"); //Активные
    By nichtAktiveLink = By.linkText("Nicht aktive"); //Не активные
    By altersgruppeändernLink = By.linkText("altersgruppe ändern"); //изменить возраст
    By abbrechenButtonLink = By.linkText("abbrechen"); //отменить создание команды
    By wichtigsteAngabenTeamLink = By.linkText("Wichtigste Angaben"); //Основные элементы
    By trainerratLink = By.linkText("Trainerrat"); //Тренера
    By spielerTeamLink = By.linkText("Spieler"); //Игроки
    By trainingsTeamLink = By.linkText("Trainings / Spiele"); //тренировки игры
    By wettkämpfeTeamLink = By.linkText("Wettkämpfe"); //соревнования

    //===Тренеры===
    By trainerLink = By.linkText("Trainer"); //Trainer Тренеры
    By kontaktinformationenLink = By.linkText("Kontaktinformationen"); //Контактная информация
    By mannschaftenTrainerLink = By.xpath("//td[@class='t20RegionBody']//a[4]"); //Команда

    //==Соревнования===
    By wettkämpfeLink = By.linkText("Wettkämpfe"); //Wettkämpfe Соревнования
    By teilnehmer = By.linkText("Teilnehmer"); //Участники
    By spieleWettkampfeLink = By.xpath(".//td[@class='t20RegionBody']//a[4]"); //Матчи соревнования

    By medizinischesTagebuchLink = By.linkText("Medizinisches Tagebuch"); //Medizinisches Tagebuch Травмы/Заболевания
    By berichteLink = By.linkText("Berichte"); //Berichte Отчеты



    DateFormat dateFormat = new SimpleDateFormat("ddMMYYYY");
    DateFormat timeFormat = new SimpleDateFormat("HHmmss");

    //===Spiele===



    private void type(By element, String text) {
        driver.findElement(element).click();
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }

    public Page userLogin(String login, String password) throws IOException, InterruptedException {
        type(loginField, login);
        type(passwordField, password);
        click(loginButton);
        return new Page(driver);
    }

    public void gotoPageAndGetScreenshoot(By element) throws IOException, InterruptedException {
        click(element);
        Thread.sleep(2000);
        takeScreenShot();
    }

    public void getScreenShots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(sportLink);
        gotoPageAndGetScreenshoot(spieleLink);
        gotoPageAndGetScreenshoot(erstellenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(firstLink);
        click(zurückButton);
        click(sportLink);
        gotoPageAndGetScreenshoot(spielerLink);
        gotoPageAndGetScreenshoot(alleLink);
        gotoPageAndGetScreenshoot(mitarbeiterLink);
        click(spielerLink);
        getSpielerScreenShots();
        click(sportLink);
        gotoPageAndGetScreenshoot(mannschaftenLink);
        getMannschaftenScreenShoots();
        click(sportLink);
        getTrainerScreenShoots();
        click(sportLink);
        gotoPageAndGetScreenshoot(wettkämpfeLink);
        getWettkampfeScreenShoots();
        click(sportLink);
        gotoPageAndGetScreenshoot(medizinischesTagebuchLink);
        getMedizinischesScreenShoots();
        click(sportLink);
        gotoPageAndGetScreenshoot(berichteLink);
        click(sportLink);




    }

    private void getMedizinischesScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(erstellenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(firstPlayerLink);
        click(abbrechenButton);
    }

    private void getWettkampfeScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(erstellenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(firstLink);
        gotoPageAndGetScreenshoot(alleLink);
        gotoPageAndGetScreenshoot(teilnehmer);
        gotoPageAndGetScreenshoot(spieleWettkampfeLink);
        click(wichtigsteAngabenLink);
        click(zurückButton);

    }

    private void getTrainerScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(trainerLink);
        gotoPageAndGetScreenshoot(erstellenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(firstPlayerLink);
        gotoPageAndGetScreenshoot(wichtigsteAngabenLink);
        gotoPageAndGetScreenshoot(kontaktinformationenLink);
        gotoPageAndGetScreenshoot(bearbeitenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(mannschaftenTrainerLink);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        //gotoPageAndGetScreenshoot(erstellenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(trainingsTeamLink);

    }

    private void getMannschaftenScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(alleMannschaftenLink);
        gotoPageAndGetScreenshoot(nichtAktiveLink);
        click(aktiveLink);
        gotoPageAndGetScreenshoot(altersgruppeändernLink);
        gotoPageAndGetScreenshoot(erstellenButton);
        click(abbrechenButtonLink);
        gotoPageAndGetScreenshoot(firstLink);
        gotoPageAndGetScreenshoot(wichtigsteAngabenTeamLink);
        gotoPageAndGetScreenshoot(trainerratLink);
        gotoPageAndGetScreenshoot(spielerTeamLink);
        gotoPageAndGetScreenshoot(trainingsTeamLink);
        gotoPageAndGetScreenshoot(wettkämpfeTeamLink);
        click(alleLink);
        click(zurückButton);

    }

    private void getSpielerScreenShots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(firstPlayerLink);
        gotoPageAndGetScreenshoot(wichtigsteAngabenLink);
        gotoPageAndGetScreenshoot(weitereInformationenLink);
        gotoPageAndGetScreenshoot(dokumenteDesSpielersLink);
        gotoPageAndGetScreenshoot(kontakteLink);
        gotoPageAndGetScreenshoot(mannschaftenPlayerLink);
        gotoPageAndGetScreenshoot(trainerPlayerLink);
        gotoPageAndGetScreenshoot(trainingsLink);
        gotoPageAndGetScreenshoot(beruflicheEntwicklungLink);
        gotoPageAndGetScreenshoot(medizinLink);
        click(alleLink);
        click(zurückButton);

    }

    public String getUserId(){
        String url = driver.getCurrentUrl();
        String userId = url.substring(url.indexOf(":",47), url.indexOf(":", 50));
        System.out.println("UserId: " + userId);
        return userId;
    }

    public String getPageCode(){
        String url = driver.getCurrentUrl();
        String codePage = url.substring(url.indexOf(":", 41), url.indexOf(":", 43));
        codePage = codePage.replaceAll(":","");
        System.out.println("PageCode: " + codePage);
        return codePage;
    }

    private String getTitle(){
        return driver.getTitle();
    }

    private void click(By element) {
        int i = 0;
        while (i < 5) {
            try {
                driver.findElement(element).click();
                break;
            } catch (Exception e) {
                i = i + 1;
            }
        }
    }

    public void takeScreenShot() throws IOException {
        Date currentDate = new Date(System.currentTimeMillis());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String pageName = getTitle();
        String pageCode = getPageCode();
        pageName = pageName.replaceAll(" ", "");
        pageName = pageName.replaceAll("\"", "");
        FileUtils.copyFile(scrFile, new File("screenshots/" + pageName +"_"+pageCode+"_"+dateFormat.format(currentDate)+ "_"+timeFormat.format(currentDate)+"_"+"DE"+".png"));
    }

    public void takeScreenShotEng() throws IOException {
        Date currentDate = new Date(System.currentTimeMillis());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String pageName = getTitle();
        String pageCode = getPageCode();
        pageName = pageName.replaceAll(" ", "");
        pageName = pageName.replaceAll("\"", "");
        FileUtils.copyFile(scrFile, new File("screenshots/" + pageName +"_"+pageCode+"_"+dateFormat.format(currentDate)+ "_"+timeFormat.format(currentDate)+"_"+"ENG"+".png"));
    }


    private List<String> getListLinksFromFile(){
        BufferedReader reader = null;
        ArrayList<String> allLinks = new ArrayList<String>();
        String line;
        try {
        reader = new BufferedReader(new FileReader(new File("allLinks_unique.txt")));

        while ((line = reader.readLine())!=null) {
                allLinks.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return allLinks;
    }

    private void printList(List<String> list){
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void printLinks(){
        printList(getListLinksFromFile());
    }

    public void getScreenShoots(List<String> list) throws IOException, InterruptedException {
        for (int i=0; i<list.size();i++){
            driver.navigate().to(list.get(i));
            Thread.sleep(1000);
            takeScreenShot();
        }
    }

    public ArrayList<String> replaceUserId(List<String> list, String s1, String s2){
        ArrayList<String> replacedList = new ArrayList<String>();
        for (int i=0; i<list.size(); i++){
            replacedList.add(list.get(i).replace(s1, s2));
        }
        return replacedList;
    }
    public void getScreenShootsFromLinksFile() throws IOException, InterruptedException {
        String id = getUserId();
        getScreenShoots(replaceUserId(getListLinksFromFile(), ":userId", id));
    }

    public void getScreenShootsFromLinksFileEn() throws IOException, InterruptedException {
        click(By.linkText("ENG"));
        String id = getUserId();
        getScreenShoots(replaceUserId(getListLinksFromFile(), ":userId", id));
    }

    public void cleanWorkingDirectory() {
        File file = new File("screenshots");
        if (file.isDirectory()){
            System.out.println("Directory exist");
        }else{
            file.mkdirs();
            System.out.println("Directory created");
        }
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            File f1 = files[i];
            //System.out.println("Delete file: "+ f1.getName());
            f1.delete();
        }
    }

    public void getScreenShootsCSLinks() throws InterruptedException, IOException {
        click(By.linkText("Verzeichnise"));
        click(By.linkText("Stadien"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("erstellen"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Verzeichnise"));
        click(By.linkText("Städte"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("erstellen"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Verzeichnise"));
        click(By.linkText("Ländern"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("erstellen"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Verzeichnise"));
        click(By.linkText("Bodenarten"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("erstellen"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Verzeichnise"));
        click(By.linkText("Spielerstatus"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("erstellen"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Verzeichnise"));
        click(By.linkText("Grundposition"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("erstellen"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Verzeichnise"));
        click(By.linkText("Unterpositionen"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("erstellen"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Verzeichnise"));
        click(By.linkText("Team"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Alle Teams"));
        Thread.sleep(1000);
        takeScreenShot();
        click(By.linkText("Inaktive"));
        Thread.sleep(1000);
        takeScreenShot();

    }

    public void getScreenShootsCSLinksENG() throws InterruptedException, IOException {
        click(By.linkText("ENG"));
        click(By.linkText("Handbooks"));
        click(By.linkText("Stadiums/Venues"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("create"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("Handbooks"));
        click(By.linkText("Cities"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("create"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("Handbooks"));
        click(By.linkText("Countries"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("create"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("Handbooks"));
        click(By.linkText("Turf type"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("create"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("Handbooks"));
        click(By.linkText("Player’s status in the match"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("create"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("Handbooks"));
        click(By.linkText("Main positions"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("create"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("Handbooks"));
        click(By.linkText("Subpositions"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("create"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("Handbooks"));
        click(By.linkText("Teams"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("All teams"));
        Thread.sleep(1000);
        takeScreenShotEng();
        click(By.linkText("Inactive"));
        Thread.sleep(1000);
        takeScreenShotEng();

    }


}


