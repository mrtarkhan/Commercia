package ir.commercia.catalog.categoryEvents;

import ir.commercia.catalog.Brand;
import ir.commercia.coreDomain.DomainEvent;

import java.util.UUID;

public class BrandAddedEvent extends DomainEvent {

    private UUID categoryId;
    private UUID id;
    private String code;
    private String title;
    private String description;
    private String logo;

    public BrandAddedEvent(UUID categoryId, Brand item) {
        super();
        this.categoryId = categoryId;
        this.id = item.id;
        this.code = item.getCode();
        this.title = item.getTitle();
        this.description = item.getDescription();
        this.logo = item.getLogo();
    }
}
