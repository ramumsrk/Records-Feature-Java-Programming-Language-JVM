package com.gitconnected.levelup.java_records.introduction_00;

import java.time.LocalDate;

public record CustomerRecord(long customerId, String customerFullName,
                             PhoneNumber customerPhoneNumber,
                             Address customerAddress,
                             LocalDate customerCreationDate           ) {
}
