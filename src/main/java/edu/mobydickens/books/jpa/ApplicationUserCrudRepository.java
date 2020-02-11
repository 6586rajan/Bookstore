package edu.mobydickens.books.jpa;

import edu.mobydickens.books.model.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserCrudRepository extends CrudRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}