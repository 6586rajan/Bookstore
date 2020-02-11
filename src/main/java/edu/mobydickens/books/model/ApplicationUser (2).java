package edu.mobydickens.books.model;

/**
 * Created by 6586r on 11/18/2017.
 */

import lombok.Data;
import javax.persistence.*;



@Data
@Entity
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "application_user_id_seq")
    @SequenceGenerator(name = "application_user_id_seq", sequenceName = "application_user_id_seq", allocationSize = 100)
    protected Long id;


    protected String username;
    protected String password;
    protected Boolean isAdmin;

    public ApplicationUser() {

    }

    public ApplicationUser(String username, String password, Boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "ApplicationUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
