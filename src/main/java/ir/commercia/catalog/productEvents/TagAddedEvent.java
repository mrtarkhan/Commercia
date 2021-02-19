package ir.commercia.catalog.productEvents;

import ir.commercia.coreDomain.DomainEvent;

import java.util.UUID;

public class TagAddedEvent extends DomainEvent {

    private UUID productId;
    private String tag;

    public TagAddedEvent(UUID productId, String tag) {
        this.productId = productId;
        this.tag = tag;
    }

}
