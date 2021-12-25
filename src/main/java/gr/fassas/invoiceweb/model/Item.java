package gr.fassas.invoiceweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Item {

    private int id;
    private int description;
    private BigDecimal value;

}
