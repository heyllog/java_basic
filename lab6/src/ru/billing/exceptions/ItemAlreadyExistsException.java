package ru.billing.exceptions;

public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException(String e) {
        super(e);
    }
}
