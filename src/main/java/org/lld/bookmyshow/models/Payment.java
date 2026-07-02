package org.lld.bookmyshow.models;

import org.lld.bookmyshow.models.enums.PaymentMode;
import org.lld.bookmyshow.models.enums.PaymentStatus;

public class Payment extends  BaseEntity{

int amount;
PaymentMode mode;
int referenceNumber;
PaymentStatus paymentStatus;
}
