package ir.commercia.catalog.categoryEvents;

import com.sun.org.apache.xpath.internal.operations.Bool;
import ir.commercia.catalog.SpecificationAttribute;
import ir.commercia.coreDomain.DomainEvent;

import java.util.UUID;

public class SpecificationAttributeAddedEvent extends DomainEvent {


    private String title;
    private String description;
    private int type;
    private String values;
    private Boolean isFeature;

    public SpecificationAttributeAddedEvent(UUID categoryId, SpecificationAttribute item) {
        super();
        this.title = item.getTitle();
        this.description = item.getDescription();
        this.type = item.getType().getValue();
        this.values = String.join(",", item.getValues());
        this.isFeature = item.getFeature();
    }

}
