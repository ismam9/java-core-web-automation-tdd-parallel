package pages.google;

import config.Log;
import config.WebActions;
import tests.Google_Search;
import webElements.ObjectsGoogle;

public class Google_SearchEngine extends WebActions {

    ObjectsGoogle objGoogle = new ObjectsGoogle();

    public void acceptCookie(){
        try{
            waitSecs(2);
            waitForVisibility(objGoogle.ES_MODAL_COOKIES);
            waitForVisibility(objGoogle.ES_MODAL_BTN_ACEPTARTODO);
            click(objGoogle.ES_MODAL_BTN_ACEPTARTODO);
            Log.register("[OK]: Accepted Cookies correctly");
        }catch (Exception e){
            Log.register("[ERROR]: Aceptando las Cookies " + Google_SearchEngine.class + e.getStackTrace());
        }
    }

    public void rejectCookies(){
        try{
            waitSecs(2);
            waitForVisibility(objGoogle.ES_MODAL_COOKIES);
            waitForVisibility(objGoogle.ES_MODAL_BTN_RECHAZARTODO);
            click(objGoogle.ES_MODAL_BTN_RECHAZARTODO);
            Log.register("[OK]: Rejected Cookies correctly");
        }catch (Exception e){
            Log.register("[ERROR]: Aceptando las Cookies " + Google_SearchEngine.class + e.getStackTrace());
        }
    }

    public void waitForGoogleInput(){
        try{
            waitForVisibility(objGoogle.ES_INPUT_GOOGLE);
            Log.register("[OK]: Google Input it's visible now");
        }catch (Exception e){
            Log.register("[ERROR]: Waiting the Search Input " + Google_SearchEngine.class + e.getStackTrace());
        }
    }

    public void searchGoogleInput(String txt){
        try{
            waitSecs(1);
            objGoogle.ES_INPUT_GOOGLE.sendKeys(txt);
            Log.register("[OK]: Searched on Google Input correctly");
        }catch (Exception e){
            Log.register("[ERROR]: Sending " + txt + ". " + Google_SearchEngine.class + e.getStackTrace());
        }
    }

}
