package ir.commercia.coreDomain;

import java.util.UUID;

public class EntityBase {

    public UUID id;

    protected EntityBase(UUID id) {
        this.id = id;
    }

    protected EntityBase() {
        this.id = UUID.randomUUID();
    }

}
