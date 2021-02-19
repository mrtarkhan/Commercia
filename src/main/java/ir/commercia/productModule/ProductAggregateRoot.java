package ir.commercia.productModule;

import ir.commercia.coreDomain.AggregateRoot;

import java.util.List;

public class ProductAggregateRoot extends AggregateRoot {

    private ProductTemplate productTemplate;

    private Integer remainedInStock;
    private Integer discount;

    private List<ProductSeller> sellers;

}
