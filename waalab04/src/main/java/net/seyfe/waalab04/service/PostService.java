package net.seyfe.waalab04.service;

import net.seyfe.waalab04.domain.Post;
import net.seyfe.waalab04.domain.dto.PostDto;
import net.seyfe.waalab04.domain.dto.UserDto;

import java.util.List;

public interface PostService {

    List<PostDto> findAll();

    PostDto findById(Long productID);

    void save(Post product);

    public void deleteById(Long postId);

    public void updatePost(Long postId, Post post);

    public List<PostDto> getPostByAuthor(String author);

    List<PostDto> getPostsByTitle(String title);
}
