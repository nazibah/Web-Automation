package WalSearch;

import base.CommonAPI;

public class WalSearchPage extends CommonAPI {

    public void searchMenu(){
        typeOnElementEntry("#ntt-placeholder", "photo");
        navigateBack();
        typeOnElementEntry("#ntt-placeholder", "medicine");
        navigateBack();
        typeOnElementEntry("#ntt-placeholder", "candy");
        navigateBack();
        typeOnElementEntry("#ntt-placeholder", "makeup");
        navigateBack();
        typeOnElementEntry("#ntt-placeholder", "chips");
        navigateBack();
    }
}
