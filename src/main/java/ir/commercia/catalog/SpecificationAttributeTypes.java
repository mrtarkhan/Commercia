package ir.commercia.catalog;

public enum SpecificationAttributeTypes  {
    CONST_VALUE (0),
    SELECTABLE_VALUE (1);

    private final int value;
    private SpecificationAttributeTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
