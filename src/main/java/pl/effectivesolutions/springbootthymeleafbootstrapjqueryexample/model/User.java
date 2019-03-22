package pl.effectivesolutions.springbootthymeleafbootstrapjqueryexample.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Tomasz Sokół on 2019-03-20.
 */
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;
}
