package models;

import play.db.jpa.JPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 *
 */
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    public Long id;

    public String name;

    public static List<User> findAll() {
        return JPA.em().createQuery("select user from User user").getResultList();
    }


}
