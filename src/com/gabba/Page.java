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

    By mainPageLink = By.linkText("Startseite"); //Главная страница

    //==Селекция===
    By spielerauswahlLink = By.linkText("Spielerauswahl"); //Селекция
    By spielerübersicht = By.linkText("Spielerübersicht"); //Просматриваемые игроки
    By datenVonFamilienmitgliedernLink = By.linkText("Daten von Familienmitgliedern"); //Члены семьи
    By transferInDenKlub = By.linkText("Transfer in den Klub"); //перевод в клуб
    By mannschaftenScouts = By.xpath(".//td[@class='t20RegionBody']//a[5]"); //команда
    By physikalischeDatenLinks = By.linkText("Physikalische Daten"); //Физические данные
    By scoutTrainerLink = By.xpath(".//td[@class='t20RegionBody']//a[7]"); //Тренер
    By andereLink = By.linkText("Andere"); //Прочее

    By scoutsLink = By.linkText("Scouts"); //Селекционеры
    By ausweispapiere = By.linkText("Ausweispapiere"); //Документы
    By reservistenLink = By.linkText("Reservisten"); //Резервисты
    By wettkämpfeZurEinsichtScLink = By.xpath(".//td[@class='t20RegionBody']//a[6]"); //Просматриваемые соревнования


    By wettkämpfeZurEinsichtLink = By.linkText("Wettkämpfe zur Einsicht"); //Просматриваемые соревнования
    By einsichScoutsLink = By.xpath(".//td[@class='t20RegionBody']//a[3]"); //Селекционеры
    By dieScoutsSpielerLink = By.linkText("Die scouts Spieler"); //Игроки, выделенные селекционерами
    By scoutsTrainerLink = By.linkText("Trainer"); //Тренеры

    //===Справочники===
    By handbücherLink = By.linkText("Handbücher"); //Справочники
    By attributeFürKalenderereignisse = By.linkText("Attribute für Kalenderereignisse"); //Аттрибуты событий календаря
    By stadien = By.linkText("Stadien"); //Стадионы
    By städte = By.linkText("Städte"); //Города
    By länder = By.linkText("Länder"); //Страны
    By verwandte = By.linkText("Verwandte"); //Родственники
    By mannschaften = By.linkText("Mannschaften"); //Команды
    By trainingsorte = By.linkText("Trainingsorte"); //Места проведения тренировок
    By trainingsgeräte = By.linkText("Trainingsgeräte"); //Оборудование для тренировок
    By registerDerÜbungen = By.linkText("Register der Übungen"); //Реестр упражнений
    By gruppeHinzufügen = By.linkText("gruppe hinzufügen"); //добавить группу упражнений
    By ubungHinzufügen = By.linkText("übung hinzufügen"); //добавить упражнение
    By spielfeldbelagtypen = By.linkText("Spielfeldbelagtypen"); //Типы покрытия
    By spielerstatusImSpiel = By.linkText("Spielerstatus im Spiel"); //Статусы игрока в матче
    By kategorienFürDieMedizinischeGeschichte = By.linkText("Kategorien für die medizinische Geschichte"); //Категории для медицинской истории
    By artenVonBeschwerden = By.linkText("Arten von Beschwerden (für den medizinischen Bereich)"); //Типы жалоб для медицины
    By erbguterkrankungen = By.linkText("Erbguterkrankungen"); //Проблемы наследственности
    By grundposition = By.linkText("Grundposition"); //Основные позиции
    By unterpositionen = By.linkText("Unterpositionen"); //Субпозиции
    By altersgruppen = By.linkText("Altersgruppen"); //Возрастные группы
    By ubungen = By.linkText("Übungen"); //Физические задачи
    By intensitätsstufen = By.linkText("Intensitätsstufen"); //Уровни интенсивности

    //===Объявления===
    By ankündigungenLink = By.linkText("Ankündigungen"); //Объявления

    //===Сообщения===
    By mitteilungenLink = By.linkText("Mitteilungen"); //Сообщения
    By neu = By.linkText("Neu "); //Новые
    By eingegangene = By.linkText("Eingegangene"); //Полученные
    By gesendete = By.linkText("Gesendete"); //Отправленные

    //===Календарь===
    By kalenderLink = By.linkText("Kalender"); //Календарь
    By tag = By.xpath("//span[text()='tag']");
    By woche = By.xpath("//span[text()='woche']");
    By trainingsKalenderLink = By.linkText("Trainings"); //Тренировки
    By ereignisse = By.linkText("Ereignisse"); //События
    By sonstiges = By.linkText("Sonstiges");
    By ankommen = By.linkText("Ankommen");
    By mahlzeit = By.linkText("Mahlzeit");
    By prozeduren = By.linkText("Prozeduren");
    By ausfahrt = By.linkText("Ausfahrt");
    By unterricht = By.linkText("Unterricht");
    By arztlicheUntersuchung = By.linkText("Ärztliche Untersuchung");
    By erinnerung = By.linkText("Erinnerung");

    //===Администрирование===
    By administrationLink = By.linkText("Administration"); //Администрирование
    By nutzer = By.linkText("Nutzer"); //Пользователи
    By rollen = By.linkText("Rollen"); //Роли
    By design = By.linkText("Design"); //Настройка дизайна

    //===Личный кабинет===
    By persönlichesKabinett = By.linkText("Persönliches Kabinett"); //Личный кабинет
    By support = By.linkText("Support"); //служба поддержки
    By aboGeschichte = By.linkText("Abo-Geschichte"); //история подписок
    By zusatzmodule = By.linkText("Zusatzmodule"); //дополнительные модули
    By videoführung = By.linkText("Videoführung"); //видеоруководство



    DateFormat dateFormat = new SimpleDateFormat("ddMMYYYY");
    DateFormat timeFormat = new SimpleDateFormat("HHmmss");





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
        gotoPageAndGetScreenshoot(mainPageLink);
        gotoPageAndGetScreenshoot(spielerauswahlLink);
        gotoPageAndGetScreenshoot(spielerübersicht);
        getSpielerubersichtScreenShoots();
        click(spielerauswahlLink);
        gotoPageAndGetScreenshoot(scoutsLink);
        getScoutsScreenShoots();
        click(spielerauswahlLink);
        gotoPageAndGetScreenshoot(wettkämpfeZurEinsichtLink);
        getWettkampfeZurEinsichtScreenShoots();
        click(spielerauswahlLink);
        gotoPageAndGetScreenshoot(scoutsTrainerLink);
        getScoutsTrainerScreenShoots();
        click(spielerauswahlLink);
        click(mainPageLink);
        gotoPageAndGetScreenshoot(handbücherLink);
        getHandbucherScreenShoots();
        click(mainPageLink);
        gotoPageAndGetScreenshoot(ankündigungenLink);
        getAnkundigungenScreenShoots();
        click(mainPageLink);
        gotoPageAndGetScreenshoot(mitteilungenLink);
        getMitteilungenScreenShoots();
        click(mainPageLink);
        gotoPageAndGetScreenshoot(kalenderLink);
        getKalenderScreensShoots();
        click(mainPageLink);
        gotoPageAndGetScreenshoot(administrationLink);
        getAdministratorsScreenShoots();
        click(mainPageLink);
        gotoPageAndGetScreenshoot(persönlichesKabinett);
        gotoPageAndGetScreenshoot(support);
        gotoPageAndGetScreenshoot(aboGeschichte);
        gotoPageAndGetScreenshoot(zusatzmodule);
        gotoPageAndGetScreenshoot(videoführung);


    }

    private void getAdministratorsScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(nutzer);
        gotoPageAndGetScreenshoot(firstLink);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(erstellenButton);
        click(abbrechenButton);
        click(administrationLink);
        gotoPageAndGetScreenshoot(rollen);
        gotoPageAndGetScreenshoot(firstLink);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(design);
    }

    private void getKalenderScreensShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(tag);
        gotoPageAndGetScreenshoot(woche);
        gotoPageAndGetScreenshoot(trainingsKalenderLink);
        gotoPageAndGetScreenshoot(firstLink);
        click(trainingsKalenderLink);
        gotoPageAndGetScreenshoot(erstellenButton);
        click(trainingsKalenderLink);
        gotoPageAndGetScreenshoot(spieleLink);
        gotoPageAndGetScreenshoot(erstellenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(firstLink);
        click(zurückButton);
        gotoPageAndGetScreenshoot(ereignisse);
        gotoPageAndGetScreenshoot(erstellenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(firstLink);
        click(zurückButton);
        gotoPageAndGetScreenshoot(sonstiges);
        gotoPageAndGetScreenshoot(ankommen);
        gotoPageAndGetScreenshoot(mahlzeit);
        gotoPageAndGetScreenshoot(prozeduren);
        gotoPageAndGetScreenshoot(ausfahrt);
        gotoPageAndGetScreenshoot(unterricht);
        gotoPageAndGetScreenshoot(arztlicheUntersuchung);
        gotoPageAndGetScreenshoot(erinnerung);
            }

    private void getMitteilungenScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(neu);
        gotoPageAndGetScreenshoot(eingegangene);
        gotoPageAndGetScreenshoot(gesendete);
    }

    private void getAnkundigungenScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(firstLink);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(erstellenButton);
        click(abbrechenButton);

    }

    private void getHandbucherScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(attributeFürKalenderereignisse);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(stadien);
        erstellenAbbrechenZuruck();
        goIntoHandbucher(städte);
        goIntoHandbucher(länder);
        goIntoHandbucher(verwandte);
        goIntoHandbucher(mannschaften);
        goIntoHandbucher(trainingsorte);
        goIntoHandbucher(trainingsgeräte);
        goIntoHandbucher(spielfeldbelagtypen);
        goIntoHandbucher(spielerstatusImSpiel);
        goIntoHandbucher(kategorienFürDieMedizinischeGeschichte);
        goIntoHandbucher(artenVonBeschwerden);
        goIntoHandbucher(erbguterkrankungen);
        goIntoHandbucher(grundposition);
        goIntoHandbucher(unterpositionen);
        goIntoHandbucher(altersgruppen);
        goIntoHandbucher(ubungen);
        gotoPageAndGetScreenshoot(intensitätsstufen);
        gotoPageAndGetScreenshoot(firstLink);
        click(abbrechenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(registerDerÜbungen);
        gotoPageAndGetScreenshoot(gruppeHinzufügen);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(ubungHinzufügen);
        click(abbrechenButton);
        click(zurückButton);


    }

    private void goIntoHandbucher(By element) throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(element);
        gotoPageAndGetScreenshoot(firstLink);
        click(abbrechenButton);
        erstellenAbbrechenZuruck();
    }

    private void erstellenAbbrechenZuruck() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(erstellenButton);
        click(abbrechenButton);
        click(zurückButton);
    }

    private void getScoutsTrainerScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(erstellenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(firstLink);
        gotoPageAndGetScreenshoot(wichtigsteAngabenLink);
        gotoPageAndGetScreenshoot(kontaktinformationenLink);
        gotoPageAndGetScreenshoot(bearbeitenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(spielerLink);
        click(alleLink);
        click(zurückButton);
    }

    private void getWettkampfeZurEinsichtScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(erstellenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(firstLink);
        gotoPageAndGetScreenshoot(alleLink);
        gotoPageAndGetScreenshoot(einsichScoutsLink);
        gotoPageAndGetScreenshoot(teilnehmer);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(dieScoutsSpielerLink);
        click(wichtigsteAngabenLink);
        click(zurückButton);



    }

    private void getScoutsScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(erstellenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(firstLink);
        gotoPageAndGetScreenshoot(wichtigsteAngabenLink);
        gotoPageAndGetScreenshoot(kontaktinformationenLink);
        gotoPageAndGetScreenshoot(bearbeitenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(ausweispapiere);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(reservistenLink);
        gotoPageAndGetScreenshoot(wettkämpfeZurEinsichtScLink);
        click(alleLink);
        click(zurückButton);


    }

    private void getSpielerubersichtScreenShoots() throws IOException, InterruptedException {
        gotoPageAndGetScreenshoot(erstellenButton);
        click(zurückButton);
        gotoPageAndGetScreenshoot(firstLink);
        gotoPageAndGetScreenshoot(wichtigsteAngabenLink);
        gotoPageAndGetScreenshoot(datenVonFamilienmitgliedernLink);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(transferInDenKlub);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(mannschaftenScouts);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(physikalischeDatenLinks);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(berichteLink);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(scoutTrainerLink);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(abbrechenButton);
        gotoPageAndGetScreenshoot(andereLink);
        gotoPageAndGetScreenshoot(hinzufügenButton);
        click(abbrechenButton);
        click(alleLink);
        click(zurückButton);
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


