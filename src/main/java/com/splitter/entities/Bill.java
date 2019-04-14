package com.splitter.entities;

import lombok.*;

import javax.persistence.*;

/**
 * Created by prateekgupta on 09/09/17.
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "bill")
@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount")
    private Double billAmount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gang_id")
    private Group gang;

    public Bill(String name, Double billAmount, Group gang) {
        this.name = name;
        this.billAmount = billAmount;
        this.gang = gang;
    }

    public Bill(String name, Double billAmount) {
        this.name = name;
        this.billAmount = billAmount;
    }
}
