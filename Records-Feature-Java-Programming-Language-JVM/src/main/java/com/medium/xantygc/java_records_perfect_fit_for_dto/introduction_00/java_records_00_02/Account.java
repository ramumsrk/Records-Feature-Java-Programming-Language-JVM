package com.medium.xantygc.java_records_perfect_fit_for_dto.introduction_00.java_records_00_02;

import java.util.Objects;

public final class Account {
  // Fields
  private String accountName;
  private int accountId;
  private AccountType accountType;
  // Constructors
  public Account(
    String accountName,
    int accountId,
    AccountType accountType
  ) {
      this.accountName = accountName;
      this.accountId = accountId;
      this.accountType = accountType;
    return;
  }
  // Setters or Mutators
  public void setAccountName(String accountName) {
      this.accountName = accountName;
    return;
  }
  public void setAccountId(int accountId) {
      this.accountId = accountId;
    return;
  }
  public void setAccountType(AccountType accountType) {
      this.accountType = accountType;
    return;
  }
  // Getters or Accessors
  public String getAccountName() {
    return this.accountName;
  }
  public AccountType getAccountType() {
    return this.accountType;
  }
  public int getAccountId() {
    return this.accountId;
  }
  @Override
  public boolean equals(Object object) {
      if (this == object) return true;
      if (
        (this.getClass() != object.getClass())
        ||
        (object == null)
      ) return false;
      Account account = (Account) object;
    return (
      this.getAccountId() == account.getAccountId()
      &&
      Objects.equals(this.getAccountName() == account.getAccountName())
      &&
      Objects.equals(this.getAccountType() == account.getAccountType())
    );
  }
  @Override
  public String toString() {
    return String.format(
      "%s[accountName=%s, accountId=%d, and accountType=%s]",
      this.getClass().toString(),
      this.getAccountName(),
      this.getAccountId(),
      this.getAccountType()
    );
  }
}