package ir.commercia.productModule;

import ir.commercia.coreDomain.EntityBase;

import java.util.List;
import java.util.UUID;

public class ProductSeller extends EntityBase {


    //region fields
    private Seller seller;

    private List<ProductDetail> productDetails;
    //endregion


    //region constructors
    public ProductSeller(UUID id) {
        super(id);
    }

    public ProductSeller(UUID id, Seller seller) {
        super(id);
        this.seller = seller;
    }

    public ProductSeller(Seller seller) {
        this.seller = seller;
    }
    //endregion

}