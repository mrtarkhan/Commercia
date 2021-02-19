package ir.commercia.catalog;

import ir.commercia.coreDomain.EntityBase;

import java.util.List;
import java.util.UUID;

public class Category extends EntityBase {


    //region fields
    private CategoryAggregateRoot parent;
    private String code;
    private String title;
    private String description;
    private List<Category> children;
    private List<Brand> brands;
    private List<SpecificationAttribute> specificationAttributes;
    //endregion


    //region constructors
    public Category(UUID parentId, UUID id, String code, String title, String description) {
        super(id);
        this.code = code;
        this.title = title;
        this.description = description;
    }

    public Category(CategoryAggregateRoot parent) {
        this.parent = parent;
    }
    //endregion


    //region getter setters
    public CategoryAggregateRoot getParent() {
        return parent;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    public List<SpecificationAttribute> getSpecificationAttributes() {
        return specificationAttributes;
    }

    public void setSpecificationAttributes(List<SpecificationAttribute> specificationAttributes) {
        this.specificationAttributes = specificationAttributes;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    //endregion


    public void addBrand(Brand item) {
        brands.add(item);
    }

}
