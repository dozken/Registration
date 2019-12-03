package io.mersys.documents;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentDetail {
    private String id;

    private LocalDateTime processDate;
    // and other fields of payment detail, like bank, card,

    private BigDecimal amount;

}
