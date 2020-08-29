package exam.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "wage")
    private Integer wage;

    //many to one: EAGER
    //one to one: EAGER
    //many to many: Lazy
    //one to many: Lazy
}
