package com.medium.iamcharlesmary70.record_features_in_java.introduction_00;

import java.util.logging.Logger;

public class ProductRecordDemo {
  private static final Logger LOGGER =
    Logger.getLogger(ProductRecordDemo.class.getName());
  static public void main(String[] args) {
      ProductRecord firstProductRecord = new ProductRecord(
        001,
        "iPhone 15",
        50_000
      );
      LOGGER.info(
        String.format(
          "Product details: '%s'\n",
          firstProductRecord
        )
      );
      LOGGER.info(
        String.format(
          "'firstProductInstance' hash-code is: '%d'\n",
          firstProductRecord.hashCode()
        )
      );
      LOGGER.info(
        String.format(
          "Product '%s' status is '%s'\n",
          firstProductRecord,
          firstProductRecord.getProductStatus()
        )
      );
    return;
  }
}