package ir.commercia.catalog.categoryEvents;

import ir.commercia.coreDomain.DomainEvent;

import java.util.UUID;

public class CategoryDeletedEvent extends DomainEvent {

    private UUID id;

    public CategoryDeletedEvent(UUID id) {
        super();
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
