package com.example.tuna.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="menu_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of={"id"})
@ToString
public class Menu {
    @Id
    @SequenceGenerator(name="seq_user",allocationSize=1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
    private Long Menu_id;
    @Column(length = 100,name="menu_name")
    private String Menu_name;
    private Double price;

}

