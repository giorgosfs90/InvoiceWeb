package gr.fassas.invoiceweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Document {

    int id;
    DocumentType documentType;
    LocalDate issueDate;
    PaymentWay paymentWay;

    List<Item> items;

    private BigDecimal value;

    private List<Tax> taxes;

}
