package ir.commercia.catalog;

import ir.commercia.coreDomain.ValueObject;

import java.util.List;

public class SpecificationAttribute extends ValueObject {

    private String title;
    private String description;
    private Boolean isFeature;
    private SpecificationAttributeTypes type;
    private List<String> values;

    public SpecificationAttribute(String title,
                                  String description,
                                  SpecificationAttributeTypes type,
                                  List<String> values, Boolean isFeature) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.values = values;
        this.isFeature = isFeature;
    }

    public Boolean getFeature() {
        return isFeature;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public SpecificationAttributeTypes getType() {
        return type;
    }

    public List<String> getValues() {
        return values;
    }

}