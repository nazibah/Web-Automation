package MacysSearch;

import base.CommonAPI;


public class MacysSearchPage extends CommonAPI {

    public void searchMenu(){
        typeOnElementEntry("#globalSearchInputField", "Dress");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Handbags");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Pants");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "makeup");
        navigateBack();
        typeOnElementEntry("#globalSearchInputField", "Shirt");
        navigateBack();
    }
}