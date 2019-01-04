package CVSSearch;

import base.CommonAPI;


public class CVSSearchPage extends CommonAPI {

    public void searchMenu(){

        typeOnElementEntry(".gr__cvs_com","bag");
        //clearField(".gr__cvs_com");
        navigateBack();
        typeOnElementEntry(".gr__cvs_com", "medicine");
        //clearField(".gr__cvs_com");
        navigateBack();
        typeOnElementEntry(".gr__cvs_com", "candy");
        //clearField(".gr__cvs_com");
        navigateBack();

        typeOnElementEntry(".gr__cvs_com", "makeup");
        //clearField(".gr__cvs_com");

        navigateBack();

        typeOnElementEntry(".gr__cvs_com", "chips");
        //clearField(".gr__cvs_com");
        navigateBack();
    }
}
