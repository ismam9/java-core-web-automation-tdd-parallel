package pages.google;

import config.Log;
import config.WebActions;
import org.openqa.selenium.WebElement;
import webElements.ObjectsGoogle;

public class Google_ResulstsTodo extends WebActions {

    ObjectsGoogle objGoogle = new ObjectsGoogle();

    public void assertSearchResult(){
        try{
            waitSecs(2);
            waitForVisibility(objGoogle.NAV_RESULTS);
            for (WebElement cites: objGoogle.ALL_CITE_SITES){
                scrollTo(cites);
                waitForVisibility(cites);
            }
            Log.register("[OK]: We have reached the results Google Search page :)");
        }catch (Exception e){
            Log.register("[ERROR]: Aceptando las Cookies " + Google_SearchEngine.class + e.getStackTrace());
        }
    }

    public void printResultsUrlsOnPage(){
        waitSecs(1);
        scrollTop();
        try{
            waitForVisibility(objGoogle.NAV_RESULTS);
            for (WebElement cites: objGoogle.ALL_CITE_SITES){
                scrollTo(cites);
                Log.register("[OK]: URL's founded: " + cites.getText());
                waitForVisibility(cites);
            }
        }catch (Exception e){
            Log.register("[ERROR]: Aceptando las Cookies " + Google_SearchEngine.class + e.getStackTrace());
        }
    }

    public void printResultsTitlesOnPage(){

    }

}
