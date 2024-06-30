package com.medium.iamcharlesmary70.record_features_in_java.introduction_00;

import java.io.Serializable;

public record ProductRecord(int productId, String productName,
                            float productPrice) implements Serializable {
  // Static or Class field(s)
  private static final String productStatus = "Active";
  // Getter or Accessor
  public String getProductStatus() {
    return ProductRecord.productStatus;
  }
}
