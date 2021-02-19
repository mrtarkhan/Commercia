package ir.commercia.coreDomain;

import java.sql.Timestamp;
import java.util.UUID;

public class DomainEvent {


    public DomainEvent () {
        eventId = UUID.randomUUID();
        timeStamp = new Timestamp(System.currentTimeMillis());
    }

    private final UUID eventId;
    private final Timestamp timeStamp;

    public UUID getEventId() {
        return eventId;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

}
