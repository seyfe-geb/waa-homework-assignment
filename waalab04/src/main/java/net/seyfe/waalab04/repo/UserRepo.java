package net.seyfe.waalab04.repo;

import net.seyfe.waalab04.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    public List<User> findAll();

    @Query(value = "SELECT u FROM User u WHERE u.posts.size > 1")
    public List<User> getUsersHavingMoreThanOnePost();

    @Query(value = "SELECT u FROM  User u JOIN u.posts p where p.title = :title")
    public  List<User> getUsersByPostTitle(@Param("title") String title);
}
