package com.example.tuna.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="address_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of={"id"})
@ToString
public class Address {
    @Id
    @SequenceGenerator(name="seq_user",allocationSize=1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)

    //private UUID add_id = UUID.randomUUID();;
    private Long add_id;
    @Column(length = 100,name="city_name")
    private String city;
    private String district;
    private String hood;
}
