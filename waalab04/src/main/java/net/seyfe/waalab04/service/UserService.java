package net.seyfe.waalab04.service;

import net.seyfe.waalab04.domain.Comment;
import net.seyfe.waalab04.domain.Post;
import net.seyfe.waalab04.domain.User;
import net.seyfe.waalab04.domain.dto.CommentDto;
import net.seyfe.waalab04.domain.dto.PostDto;
import net.seyfe.waalab04.domain.dto.UserDto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface UserService {
    List<UserDto> findAll();

    UserDto findById(Long userId);

    void save(User user);

    public void deleteById(Long userId);

    public void updateUser(Long postId, User user);

    public List<UserDto> getPostByUserName(String userName);

    List<PostDto> findPostsByUserId(Long userId);

    List<UserDto> getUsersHavingMoreThanOnePost();

    List<CommentDto> findCommentsById(Long userId, Long postId);

    List<PostDto> findPostsByPostId(Long userId, Long postId);

    void savePost(Long userId, Post post);

    void saveComment(Long userId, Long postId, Comment comment);

    void logException(LocalDate date, LocalTime time, String principle, String operation, String exceptionType);

    List<UserDto> getUsersByPostTitle(String title);
}
