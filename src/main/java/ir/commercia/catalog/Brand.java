package ir.commercia.catalog;

import ir.commercia.coreDomain.EntityBase;

public class Brand extends EntityBase {

    private String code;
    private String title;
    private String description;
    private String logo;



    //region getter setters
    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLogo() {
        return logo;
    }
    //endregion


}
