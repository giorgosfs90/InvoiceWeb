package gr.fassas.invoiceweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

    private String route;
    private int number;
    private String city;
    private int postal;
    private String country;
    @OneToMany(mappedBy = "address")
    private List<BusinessCustomer> businessCustomer;

}
