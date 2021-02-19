package ir.commercia.catalog;

import java.util.List;
import java.util.UUID;

import ir.commercia.catalog.categoryEvents.*;
import ir.commercia.coreDomain.AggregateRoot;
import ir.commercia.coreDomain.DomainException;

public class CategoryAggregateRoot extends AggregateRoot {


    //region fields
    private String code;
    private String title;
    private String description;
    private List<Category> children;
    //endregion


    //region constructors
    public CategoryAggregateRoot() {
        super();
    }

    public CategoryAggregateRoot(UUID id) {
        super(id);
    }
    //endregion


    //region getter setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }
    //endregion


    //region business

    public void addCategory(Category item) {
        children.add(item);
        addEvent(new CategoryAddedEvent(this.id, item));

        for (Brand brand : item.getBrands()) {
            addEvent(new BrandAddedEvent(item.id, brand));
        }

        for (SpecificationAttribute attr: item.getSpecificationAttributes()) {
            addEvent(new SpecificationAttributeAddedEvent(item.id, attr));
        }
    }

    public void deleteCategory(Category item) throws DomainException {

        if (children.stream().anyMatch(e -> e.id == item.id)) {
            children.remove(item);
            addEvent(new CategoryDeletedEvent(item.id));
        }

        throw new DomainException("category not found for delete");

    }

    public void updateCategory(Category item) {

    }
    //endregion


}
