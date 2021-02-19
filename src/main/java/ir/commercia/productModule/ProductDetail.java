package ir.commercia.productModule;

import ir.commercia.coreDomain.ValueObject;

public class ProductDetail extends ValueObject {

    //region fields
    private ProductWarranty warranty;
    private ProductColor color;
    private ProductShipping shipping;
    private ProductSize size;
    private Integer price;
    private Integer discount;
    //endregion


    public ProductDetail(ProductWarranty warranty,
                         ProductColor color,
                         ProductShipping shipping,
                         ProductSize size,
                         Integer price,
                         Integer discount) {
        this.warranty = warranty;
        this.color = color;
        this.shipping = shipping;
        this.size = size;
        this.price = price;
        this.discount = discount;
    }

}
