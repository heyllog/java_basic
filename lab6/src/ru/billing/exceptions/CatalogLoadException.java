package ru.billing.exceptions;

public class CatalogLoadException extends Exception {
    public CatalogLoadException(String e) {
        super(e);
    }

    public CatalogLoadException(ItemAlreadyExistsException e) {
        super(e);
    }
}
