package com.gitconnected.levelup.java_records.generic_record_04;

import java.util.logging.Logger;

public class BoxDemo {
  private static final Logger LOGGER =
    Logger.getLogger(BoxDemo.class.getName());
  public static void main(String... args) {
      BoxRecord<Number> boxRecord = new BoxRecord<>(10);
      LOGGER.info(
        String.format(
          "Value contained in box is: '%d'\n",
          boxRecord.value()
        )
      );
    return;
  }
}
