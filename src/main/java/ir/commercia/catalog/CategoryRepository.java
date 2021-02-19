package ir.commercia.catalog;

import java.util.UUID;

public interface CategoryRepository {

    void save(CategoryAggregateRoot categoryAggregateRoot);

    CategoryAggregateRoot getById(UUID id);

}
