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
public class PageFR {
    private WebDriver driver;
    private WebDriverWait wait;

    public PageFR(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    By loginField = By.id("P101_USERNAME");
    By passwordField = By.id("P101_PASSWORD");
    By loginButton = By.id("P101_LOGIN");

    By fr = By.linkText("FR");

    //====Кнопки===
    By erstellenButton = By.linkText("créer"); //Erstellen Создать
    By zurückButton = By.linkText("retour"); //Zurück Назад
    By bearbeitenButton = By.linkText("editer"); //Редактировать
    By abbrechenButton = By.linkText("annuler"); //Отменить
    By speichernButton = By.linkText("sauvegarder"); //Сохранить
    By hinzufügenButton = By.linkText("ajouter"); //Добавить

    //===Sport===
    By sportLink = By.linkText("Sport");
    By spieleLink = By.linkText("Matchs"); //Spiele Матчи
    By firstLink = By.cssSelector(".even>td>a>img"); //открыть матч
    By spielerLink = By.linkText("Joueurs"); //Spieler Игроки
    //===Игроки===
    By alleLink = By.linkText("Tous"); //Все
    By mitarbeiterLink = By.linkText("Employés"); //Сотрудники
    By firstPlayerLink = By.cssSelector(".even>td>a"); //первый игрок
    By wichtigsteAngabenLink = By.linkText("Renseignements essentiels"); //Основные элементы
    By weitereInformationenLink = By.linkText("Renseignements complémentaires"); //Дальнейшая информация
    By dokumenteDesSpielersLink = By.linkText("Documents du joueur"); //Документы игрока
    By kontakteLink = By.linkText("Contacts / Famille"); //Контакты/Родственники
    By mannschaftenPlayerLink = By.xpath("//div[@class='t20VerticalSidebarList']//a[6]"); //Команда
    By trainerPlayerLink = By.linkText("Entraîneurs"); //Тренеры
    By trainingsLink = By.linkText("Entraînements / Matchs"); //Тренировки/Игры
    By beruflicheEntwicklungLink = By.linkText("Évolution professionnelle"); //Профессиональное развитие
    By medizinLink = By.linkText("Médecine"); //Медицина

    By mannschaftenLink = By.linkText("Équipes"); //Mannschaften Команды
    //===Команды===
    By alleMannschaftenLink = By.linkText("Toutes les équipes"); //Все команды
    By aktiveLink = By.linkText("Actifs"); //Активные
    By nichtAktiveLink = By.linkText("non actifs"); //Не активные
    By altersgruppeändernLink = By.linkText("changer le groupe d'âge"); //изменить возраст
    By abbrechenButtonLink = By.linkText("annuler"); //отменить создание команды
    By wichtigsteAngabenTeamLink = By.linkText("Renseignements complémentaires"); //Основные элементы
    By trainerratLink = By.linkText("Personnel d'encadrement"); //Тренера
    By spielerTeamLink = By.linkText("Joueurs"); //Игроки
    By trainingsTeamLink = By.linkText("Entraînements / Matchs"); //тренировки игры
    By wettkämpfeTeamLink = By.linkText("Compétitions"); //соревнования

    //===Тренеры===
    By trainerLink = By.linkText("Entraîneurs"); //Trainer Тренеры
    By kontaktinformationenLink = By.linkText("Informations de contact"); //Контактная информация
    By mannschaftenTrainerLink = By.xpath("//td[@class='t20RegionBody']//a[4]"); //Команда

    //==Соревнования===
    By wettkämpfeLink = By.linkText("Compétitions"); //Wettkämpfe Соревнования
    By teilnehmer = By.linkText("Participants"); //Участники
    By spieleWettkampfeLink = By.xpath(".//td[@class='t20RegionBody']//a[4]"); //Матчи соревнования

    By medizinischesTagebuchLink = By.linkText("Registre médical"); //Medizinisches Tagebuch Травмы/Заболевания
    By berichteLink = By.linkText("Rapports"); //Berichte Отчеты

    By mainPageLink = By.linkText("initiale"); //Главная страница

    //==Селекция===
    By spielerauswahlLink = By.linkText("Sélection"); //Селекция
    By spielerübersicht = By.linkText("Joueurs à suivre"); //Просматриваемые игроки
    By datenVonFamilienmitgliedernLink = By.linkText("Informations sur les familles"); //Члены семьи
    By transferInDenKlub = By.linkText("Transfert au Club"); //перевод в клуб
    By mannschaftenScouts = By.xpath(".//td[@class='t20RegionBody']//a[5]"); //команда
    By physikalischeDatenLinks = By.linkText("Données physiques"); //Физические данные
    By scoutTrainerLink = By.xpath(".//td[@class='t20RegionBody']//a[8]"); //Тренер
    By andereLink = By.linkText("Autre"); //Прочее

    By scoutsLink = By.linkText("Sélectionneurs"); //Селекционеры
    By ausweispapiere = By.xpath(".//td[@class='t20RegionBody']//a[4]"); //Документы
    By reservistenLink = By.linkText("Remplaçants"); //Резервисты
    By wettkämpfeZurEinsichtScLink = By.xpath(".//td[@class='t20RegionBody']//a[6]"); //Просматриваемые соревнования


    By wettkämpfeZurEinsichtLink = By.linkText("Compétitions vues"); //Просматриваемые соревнования
    By einsichScoutsLink = By.xpath(".//td[@class='t20RegionBody']//a[3]"); //Селекционеры
    By dieScoutsSpielerLink = By.linkText("Joueurs désignés par les sélectionneurs"); //Игроки, выделенные селекционерами
    By scoutsTrainerLink = By.linkText("Entraîneurs"); //Тренеры

    //===Справочники===
    By handbücherLink = By.linkText("Répertoires"); //Справочники
    By attributeFürKalenderereignisse = By.linkText("Attributs des événements de calendrier"); //Аттрибуты событий календаря
    By stadien = By.linkText("Stades"); //Стадионы
    By städte = By.linkText("Villes"); //Города
    By länder = By.linkText("Pays"); //Страны
    By verwandte = By.linkText("Membres de la famille"); //Родственники
    By mannschaften = By.xpath(".//td[@class='t20RegionBody']//li[1]/a[text()='Mannschaften']"); //Команды
    By trainingsorte = By.linkText("Lieux des entraînements"); //Места проведения тренировок
    By trainingsgeräte = By.linkText("Équipements pour l'entraînement"); //Оборудование для тренировок
    By registerDerÜbungen = By.linkText("Répertoire d'exercices"); //Реестр упражнений
    By gruppeHinzufügen = By.linkText("ajouter un groupe"); //добавить группу упражнений
    By ubungHinzufügen = By.linkText("ajouter un exercice"); //добавить упражнение
    By spielfeldbelagtypen = By.linkText("Types de revêtements"); //Типы покрытия
    By spielerstatusImSpiel = By.linkText("Statuts des joueurs dans le match"); //Статусы игрока в матче
    By kategorienFürDieMedizinischeGeschichte = By.linkText("Catégories pour l'historique médical"); //Категории для медицинской истории
    By artenVonBeschwerden = By.linkText("Types de plaintes à caractère médical"); //Типы жалоб для медицины
    By erbguterkrankungen = By.linkText("Problèmes d'hérédité"); //Проблемы наследственности
    By grundposition = By.linkText("Positions de base"); //Основные позиции
    By unterpositionen = By.linkText("Sous-positions"); //Субпозиции
    By altersgruppen = By.linkText("Tranche d'âge"); //Возрастные группы
    By ubungen = By.linkText("Tâches physiques"); //Физические задачи
    By intensitätsstufen = By.linkText("Niveaux d'intensité"); //Уровни интенсивности

    //===Объявления===
    By ankündigungenLink = By.linkText("Annonces"); //Объявления

    //===Сообщения===
    By mitteilungenLink = By.linkText("Messages"); //Сообщения
    By neu = By.linkText("Nouveaux"); //Новые
    By eingegangene = By.linkText("Reçus"); //Полученные
    By gesendete = By.linkText("Envoyés"); //Отправленные

    //===Календарь===
    By kalenderLink = By.linkText("Agenda"); //Календарь
    By tag = By.xpath("//span[text()='jour']");
    By woche = By.xpath("//span[text()='semaine']");
    By trainingsKalenderLink = By.linkText("Entraînements"); //Тренировки
    By ereignisse = By.linkText("Événements"); //События
    By sonstiges = By.linkText("Autre");
    By ankommen = By.linkText("Rencontre");
    By mahlzeit = By.linkText("Prise de nourriture");
    By prozeduren = By.linkText("Procédures");
    By ausfahrt = By.linkText("Sortie");
    By unterricht = By.linkText("Occupation");
    By arztlicheUntersuchung = By.linkText("Visite médicale");
    By erinnerung = By.linkText("Rappel");

    //===Администрирование===
    By administrationLink = By.linkText("Gestion"); //Администрирование
    By nutzer = By.linkText("Utilisateurs"); //Пользователи
    By rollen = By.linkText("Rôles"); //Роли
    By design = By.linkText("Réglages de la conception"); //Настройка дизайна

    //===Личный кабинет===
    By persönlichesKabinett = By.linkText("Espace perso"); //Личный кабинет
    By support = By.linkText("Assistance"); //служба поддержки
    By aboGeschichte = By.linkText("Historique des abonnements"); //история подписок
    By zusatzmodule = By.linkText("Modules supplémentaires"); //дополнительные модули
    By videoführung = By.linkText("Videoführung"); //видеоруководство



    DateFormat dateFormat = new SimpleDateFormat("ddMMYYYY");
    DateFormat timeFormat = new SimpleDateFormat("HHmmss");





    private void type(By element, String text) {
        driver.findElement(element).click();
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }

    public PageFR userLogin(String login, String password) throws IOException, InterruptedException {
        type(loginField, login);
        type(passwordField, password);
        click(loginButton);
        return new PageFR(driver);
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
        FileUtils.copyFile(scrFile, new File("screenshotsFR/" + pageName +"_"+pageCode+"_"+dateFormat.format(currentDate)+ "_"+timeFormat.format(currentDate)+"_"+"DE"+".png"));
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
        File file = new File("screenshotsFR");
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


    public void userGoToFRLang() {
        click(fr);
    }
}


