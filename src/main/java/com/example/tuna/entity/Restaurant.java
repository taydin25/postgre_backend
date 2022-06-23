package com.example.tuna.entity;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="restaurant_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of={"id"})
@ToString
public class Restaurant implements Serializable{
    @Id
    @SequenceGenerator(name="seq_user",allocationSize=1)
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
   // private Long res_id;
    //@OneToMany
    //@JoinColumn(name = "res_id")
    private Long res_id;
    private String res_name;
    private String res_tanitim;
    private Long Adr_id;
    private Long Cate_id;
    private Long Menu_id;


}
