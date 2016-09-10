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
public class PageIT {
    private WebDriver driver;
    private WebDriverWait wait;

    public PageIT(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    By loginField = By.id("P101_USERNAME");
    By passwordField = By.id("P101_PASSWORD");
    By loginButton = By.id("P101_LOGIN");

    By it = By.linkText("IT");

    //====Кнопки===
    By erstellenButton = By.linkText("crea"); //Erstellen Создать
    By zurückButton = By.linkText("indietro"); //Zurück Назад
    By bearbeitenButton = By.linkText("modifica"); //Редактировать
    By abbrechenButton = By.linkText("cancella"); //Отменить
    By speichernButton = By.linkText("sauvegarder"); //Сохранить
    By hinzufügenButton = By.linkText("aggiungere"); //Добавить

    //===Sport===
    By sportLink = By.linkText("Sport");
    By spieleLink = By.linkText("Partite"); //Spiele Матчи
    By firstLink = By.cssSelector(".even>td>a>img"); //открыть матч
    By spielerLink = By.linkText("Giocatori"); //Spieler Игроки
    //===Игроки===
    By alleLink = By.linkText("Tutto"); //Все
    By mitarbeiterLink = By.linkText("Collaboratori"); //Сотрудники
    By firstPlayerLink = By.cssSelector(".even>td>a"); //первый игрок
    By wichtigsteAngabenLink = By.linkText("Dati principali"); //Основные элементы
    By weitereInformationenLink = By.linkText("Dati supplementari"); //Дальнейшая информация
    By dokumenteDesSpielersLink = By.linkText("Documenti del giocatore"); //Документы игрока
    By kontakteLink = By.linkText("Contatti/Parenti"); //Контакты/Родственники
    By mannschaftenPlayerLink = By.xpath("//div[@class='t20VerticalSidebarList']//a[6]"); //Команда
    By trainerPlayerLink = By.linkText("Allenatori"); //Тренеры
    By trainingsLink = By.linkText("Allenamenti / Partite"); //Тренировки/Игры
    By beruflicheEntwicklungLink = By.linkText("Crescita professionale"); //Профессиональное развитие
    By medizinLink = By.linkText("Medicina"); //Медицина

    By mannschaftenLink = By.linkText("Squadre"); //Mannschaften Команды
    //===Команды===
    By alleMannschaftenLink = By.linkText("Tutte le squadre"); //Все команды
    By aktiveLink = By.linkText("Attivi"); //Активные
    By nichtAktiveLink = By.linkText("Inattivi"); //Не активные
    By altersgruppeändernLink = By.linkText("cambiare gruppo d'età"); //изменить возраст
    By abbrechenButtonLink = By.linkText("cancella"); //отменить создание команды
    By wichtigsteAngabenTeamLink = By.linkText("Dati principali"); //Основные элементы
    By trainerratLink = By.linkText("Corpo allenatori"); //Тренера
    By spielerTeamLink = By.linkText("Giocatori"); //Игроки
    By trainingsTeamLink = By.linkText("Allenamenti / Partite"); //тренировки игры
    By wettkämpfeTeamLink = By.linkText("Gare"); //соревнования

    //===Тренеры===
    By trainerLink = By.linkText("Allenatori"); //Trainer Тренеры
    By kontaktinformationenLink = By.linkText("Dati di contatto"); //Контактная информация
    By mannschaftenTrainerLink = By.xpath("//td[@class='t20RegionBody']//a[4]"); //Команда

    //==Соревнования===
    By wettkämpfeLink = By.linkText("Gare"); //Wettkämpfe Соревнования
    By teilnehmer = By.linkText("Partecipanti"); //Участники
    By spieleWettkampfeLink = By.xpath(".//td[@class='t20RegionBody']//a[4]"); //Матчи соревнования

    By medizinischesTagebuchLink = By.linkText("Rivista medica"); //Medizinisches Tagebuch Травмы/Заболевания
    By berichteLink = By.linkText("Relazioni"); //Berichte Отчеты

    By mainPageLink = By.linkText("Home page"); //Главная страница

    //==Селекция===
    By spielerauswahlLink = By.linkText("Selezione"); //Селекция
    By spielerübersicht = By.linkText("Giocatori in visione"); //Просматриваемые игроки
    By datenVonFamilienmitgliedernLink = By.linkText("Informazioni sui parenti"); //Члены семьи
    By transferInDenKlub = By.linkText("Trasferimento al Club"); //перевод в клуб
    By mannschaftenScouts = By.xpath(".//td[@class='t20RegionBody']//a[5]"); //команда
    By physikalischeDatenLinks = By.linkText("Dati fisici"); //Физические данные
    By scoutTrainerLink = By.xpath(".//td[@class='t20RegionBody']//a[8]"); //Тренер
    By andereLink = By.linkText("Altro"); //Прочее

    By scoutsLink = By.linkText("Sélectionneurs"); //Селекционеры
    By ausweispapiere = By.xpath(".//td[@class='t20RegionBody']//a[4]"); //Документы
    By reservistenLink = By.linkText("Giocatori di riserva"); //Резервисты
    By wettkämpfeZurEinsichtScLink = By.xpath(".//td[@class='t20RegionBody']//a[6]"); //Просматриваемые соревнования


    By wettkämpfeZurEinsichtLink = By.linkText("Gare in visione"); //Просматриваемые соревнования
    By einsichScoutsLink = By.xpath(".//td[@class='t20RegionBody']//a[3]"); //Селекционеры
    By dieScoutsSpielerLink = By.linkText("Giocatori segnalati dai selezionisti"); //Игроки, выделенные селекционерами
    By scoutsTrainerLink = By.linkText("Allenatori"); //Тренеры

    //===Справочники===
    By handbücherLink = By.linkText("Compendi"); //Справочники
    By attributeFürKalenderereignisse = By.linkText("Attributi degli eventi di calendario"); //Аттрибуты событий календаря
    By stadien = By.linkText("Stadi"); //Стадионы
    By städte = By.linkText("Città"); //Города
    By länder = By.linkText("Paesi"); //Страны
    By verwandte = By.linkText("Parenti"); //Родственники
    By mannschaften = By.xpath(".//td[@class='t20RegionBody']//li[1]/a[text()='Squadre']"); //Команды
    By trainingsorte = By.linkText("Luoghi degli allenamenti"); //Места проведения тренировок
    By trainingsgeräte = By.linkText("Attrezzi per allenamenti"); //Оборудование для тренировок
    By registerDerÜbungen = By.linkText("Registro esercizi"); //Реестр упражнений
    By gruppeHinzufügen = By.linkText("aggiungere un gruppo"); //добавить группу упражнений
    By ubungHinzufügen = By.linkText("aggiungere un esercizio"); //добавить упражнение
    By spielfeldbelagtypen = By.linkText("Tipologie copertura"); //Типы покрытия
    By spielerstatusImSpiel = By.linkText("Stati del giocatore nella partita"); //Статусы игрока в матче
    By kategorienFürDieMedizinischeGeschichte = By.linkText("Categorie della storia clinica"); //Категории для медицинской истории
    By artenVonBeschwerden = By.linkText("Tipo sintomi accusati per medicina"); //Типы жалоб для медицины
    By erbguterkrankungen = By.linkText("Problemi ereditari"); //Проблемы наследственности
    By grundposition = By.linkText("Posizioni principali"); //Основные позиции
    By unterpositionen = By.linkText("Sottoposizioni"); //Субпозиции
    By altersgruppen = By.linkText("Classi di età"); //Возрастные группы
    By ubungen = By.linkText("Obiettivi fisici"); //Физические задачи
    By intensitätsstufen = By.linkText("Livelli di intensità"); //Уровни интенсивности

    //===Объявления===
    By ankündigungenLink = By.linkText("Avvisi"); //Объявления

    //===Сообщения===
    By mitteilungenLink = By.linkText("Messaggi"); //Сообщения
    By neu = By.linkText("Nuovi"); //Новые
    By eingegangene = By.linkText("Ricevuti"); //Полученные
    By gesendete = By.linkText("Inviati"); //Отправленные

    //===Календарь===
    By kalenderLink = By.linkText("Calendario"); //Календарь
    By tag = By.xpath("//span[text()='giorno']");
    By woche = By.xpath("//span[text()='settimana']");
    By trainingsKalenderLink = By.linkText("Allenamenti"); //Тренировки
    By ereignisse = By.linkText("Eventi"); //События
    By sonstiges = By.linkText("Altro");
    By ankommen = By.linkText("Incontro");
    By mahlzeit = By.linkText("Pasto");
    By prozeduren = By.linkText("Procedure");
    By ausfahrt = By.linkText("Partenza");
    By unterricht = By.linkText("Esercizio");
    By arztlicheUntersuchung = By.linkText("Visita medica");
    By erinnerung = By.linkText("Rammemorazione");

    //===Администрирование===
    By administrationLink = By.linkText("Gestione"); //Администрирование
    By nutzer = By.linkText("Utenti"); //Пользователи
    By rollen = By.linkText("Ruoli"); //Роли
    By design = By.linkText("Impostazione design"); //Настройка дизайна

    //===Личный кабинет===
    By persönlichesKabinett = By.linkText("Area riservata"); //Личный кабинет
    By support = By.linkText("Servizio di assistenza tecnica"); //служба поддержки
    By aboGeschichte = By.linkText("Storia sottoscrizioni"); //история подписок
    By zusatzmodule = By.linkText("Moduli supplementari"); //дополнительные модули
    By videoführung = By.linkText("Videoführung"); //видеоруководство



    DateFormat dateFormat = new SimpleDateFormat("ddMMYYYY");
    DateFormat timeFormat = new SimpleDateFormat("HHmmss");





    private void type(By element, String text) {
        driver.findElement(element).click();
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }

    public PageIT userLogin(String login, String password) throws IOException, InterruptedException {
        type(loginField, login);
        type(passwordField, password);
        click(loginButton);
        return new PageIT(driver);
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
        //gotoPageAndGetScreenshoot(videoführung);


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
        FileUtils.copyFile(scrFile, new File("screenshotsIT/" + pageName +"_"+pageCode+"_"+dateFormat.format(currentDate)+ "_"+timeFormat.format(currentDate)+"_"+"DE"+".png"));
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
        File file = new File("screenshotsIT");
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


    public void userGoToITLang() {
        click(it);
    }
}


