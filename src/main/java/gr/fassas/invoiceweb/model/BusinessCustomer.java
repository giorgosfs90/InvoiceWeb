package gr.fassas.invoiceweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class BusinessCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private int vatId;
    @Column(nullable = false)
    private String taxOffice;
    @Column(nullable = false)
    private String job;
    @ManyToOne
    private Address address;

}
