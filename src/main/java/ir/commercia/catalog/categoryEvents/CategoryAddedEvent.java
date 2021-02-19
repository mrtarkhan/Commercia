package ir.commercia.catalog.categoryEvents;

import ir.commercia.catalog.Category;
import ir.commercia.coreDomain.DomainEvent;

import java.util.UUID;

public class CategoryAddedEvent extends DomainEvent {

    private UUID parentId;
    private UUID id;
    private String code;
    private String title;
    private String description;

    public CategoryAddedEvent(UUID parentId, Category item) {
        super();
        this.parentId = parentId;
        this.id = item.id;
        this.code = item.getCode();
        this.title = item.getTitle();
        this.description = item.getDescription();
    }

    public UUID getParentId() {
        return parentId;
    }

    public UUID getId() {
        return id;
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
}
