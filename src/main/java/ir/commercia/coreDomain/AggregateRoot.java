package ir.commercia.coreDomain;

import ir.commercia.coreDomain.EntityBase;

import java.util.List;
import java.util.UUID;

public class AggregateRoot extends EntityBase {

    protected AggregateRoot()  {
        super();
    }

    protected AggregateRoot(UUID id) {
        super(id);
    }

    private List<DomainEvent> _domainEvents;

    public List<DomainEvent> get_domainEvents() {
        return _domainEvents;
    }

    protected int getHashCode() {
        return id.hashCode();
    }

    protected void addEvent(DomainEvent newEvent) {
        _domainEvents.add(newEvent);
    }

    protected void clearEvents() {
        _domainEvents.clear();
    }

}
