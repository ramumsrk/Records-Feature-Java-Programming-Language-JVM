package com.gitconnected.levelup.java_records.introduction_00;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
  // Instance or Member fields
  private final long customerId;
  private final String fullName;
  private final PhoneNumber phoneNumber;
  private final Address customerAddress;
  private final LocalDate customerCreatedAt;
  // Constructors
  public Customer(
    long customerId,
    String fullName,
    PhoneNumber phoneNumber,
    Address customerAddress,
    LocalDate customerCreatedAt
  ) {
      this.customerId = customerId;
      this.fullName = fullName;
      this.phoneNumber = phoneNumber;
      this.customerAddress = customerAddress;
      this.customerCreatedAt = customerCreatedAt;
    return;
  }
  @Override
  public int hashCode() {
    return Objects.hash(this.customerId, this.fullName, this.phoneNumber,
      this.customerAddress, this.customerCreatedAt);
  }
  @Override
  public String toString() {
    return String.format(
      "%s[customerId=%d, customerName=%s, customerPhoneNumber=%s, " +
        "customerAddress=%s, customerCreationDate=%s]",
      this.getClass().toString(),
      this.customerId,
      this.fullName,
      this.phoneNumber,
      this.customerAddress,
      this.customerCreatedAt
    );
  }
  @Override
  public boolean equals(Object object) {
      if(this == object) return true;
      if (
        this.getClass() != object.getClass()
        ||
        object == null
      ) return false;
      Customer customer = (Customer) object;
    return (
      this.customerId == customer.customerId
      &&
      this.fullName == customer.fullName
      &&
      this.phoneNumber == customer.phoneNumber
      &&
      this.customerAddress == customer.customerAddress
      &&
      this.customerCreatedAt == customer.customerCreatedAt
    );
  }
}
