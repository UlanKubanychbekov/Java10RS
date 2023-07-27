package peaksoft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;

/**
 * author: Ulansky
 */
@Entity
@Table(name = "laptops")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Laptop extends ParentSuperClass{

    private String model;
    @ManyToMany(mappedBy = "laptops")
    private List<Student> students;

}
