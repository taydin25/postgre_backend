package com.example.tuna.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="category_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of={"id"})
@ToString
public class Category {
    @Id
    @SequenceGenerator(name="seq_user",allocationSize=1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
    private Long Cat_id;
    @Column(length = 100,name="cat_name")

    private String Cat_name;
}
