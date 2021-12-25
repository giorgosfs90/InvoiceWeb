package gr.fassas.invoiceweb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tax {

    private int id;
    private String description;
    private double percentage;

}
