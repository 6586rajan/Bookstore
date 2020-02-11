package edu.mobydickens.books.repository.impl;

/**
 * Created by 6586r on 11/18/2017.
 */
import com.google.common.collect.MoreCollectors;
import edu.mobydickens.books.jpa.ApplicationUserCrudRepository;
import edu.mobydickens.books.model.ApplicationUser;
import edu.mobydickens.books.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ApplicationUserRepositoryImpl implements ApplicationUserRepository{

//    private List<ApplicationUser> applicationUserList = new ArrayList<>();
//
//    @Override
//    public ApplicationUser findUserByUserName(String username) {
//        return applicationUserList.stream()
//                .filter(user -> user.getUsername().equalsIgnoreCase(username))
//                .collect(MoreCollectors.onlyElement());
//    }
//
//    @Override
//    public ApplicationUser addUser(Long id, String userName, String password, Boolean isAdmin) {
//        ApplicationUser user = new ApplicationUser(id, userName, password, isAdmin);
//        applicationUserList.add(user);
//        return user;
//    }


    @Autowired
    private ApplicationUserCrudRepository applicationUserCrudRepository;

    @Override
    public ApplicationUser findUserByUserName(String username) {

        // PS5
//        return applicationUserList.stream()
//                .filter(user -> user.getUsername().equalsIgnoreCase(username))
//                .collect(MoreCollectors.onlyElement());

        // PS6
        return applicationUserCrudRepository.findByUsername(username);
    }

    @Override
    public ApplicationUser addUser(String userName, String password, Boolean isAdmin) {
        ApplicationUser user = new ApplicationUser(userName, password, isAdmin);

        // PS5
//        applicationUserList.add(user);
//        return user;

        //  PS6
        return applicationUserCrudRepository.save(user);
    }
}
