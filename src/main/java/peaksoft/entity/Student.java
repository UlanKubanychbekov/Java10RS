package peaksoft.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * author: Ulansky
 */
@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends ParentSuperClass {

    @Column(name = "full_name")
    private String fullName;
    @ManyToOne
    private Group group;
    @ManyToMany
    @JoinTable(name = "students_laptops",joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "laptop_id"))
    private List<Laptop> laptops;

}
