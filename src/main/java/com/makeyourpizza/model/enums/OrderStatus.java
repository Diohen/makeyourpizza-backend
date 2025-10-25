package com.makeyourpizza.model.enums;

public enum OrderStatus {
    NEW,        // Order created, awaiting payment
    PAID,       // Payment received
    COOKING,    // Order in preparation
    DONE,       // Order completed, awaiting customer
    FINISH      // Order delivered to customer
}
