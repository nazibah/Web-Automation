package CVSSearch;

import base.CommonAPI;


public class CVSSearchPage extends CommonAPI {

    public void searchMenu(){

        typeOnElementEntry("#query-search-box","bag");
        //clearField(".gr__cvs_com");
        navigateBack();
        typeOnElementEntry("#query-search-box", "medicine");
        //clearField(".gr__cvs_com");
        navigateBack();
        typeOnElementEntry("#query-search-box", "candy");
        //clearField(".gr__cvs_com");
        navigateBack();

        typeOnElementEntry("#query-search-box", "makeup");
        //clearField(".gr__cvs_com");

        navigateBack();

        typeOnElementEntry("#query-search-box", "chips");
        //clearField(".gr__cvs_com");
        navigateBack();
    }
}
