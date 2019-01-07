import JCPSearch.JCPLogin;

public class JCPTestLogin extends JCPLogin {

    public void login() {
        getEelementsByxpath("//*[@id=\"toggleToolTip\"]/div");
        getEelementsByxpath("//*[@id=\"headerAccount\"]/button[1]");
        typeOnElement("//*[@id=\"content\"]/main/div[3]/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div/div[1]/span/div/input", "nazibah95@gmail.com");
        typeOnElementEntry("//*[@id=\"content\"]/main/div[3]/div/div[2]/div/div[1]/div/div[2]/form/div[2]/div/div[2]/input", "Sohaib21");
        //getEelementsByID("acc-info-state");
        //getEelementsByID("item-name");
        getEelementsByxpath("//*[@id=\"toggleToolTip\"]/div/div[2]/div[2]");
        getEelementsByxpath("//*[@id=\"headerAccount\"]/div/div/ul/li[5]/a");

    }

}
/Users/nazibahfariha/Downloads/TeamAutomation2018-master