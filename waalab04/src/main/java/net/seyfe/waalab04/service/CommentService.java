package net.seyfe.waalab04.service;

import net.seyfe.waalab04.domain.Comment;
import net.seyfe.waalab04.domain.dto.CommentDto;

import java.util.List;

public interface CommentService {
    List<CommentDto> findAll();

    CommentDto findById(Long commentId);

    void save(Comment comment);

    public void deleteById(Long commentId);

    public void updateComment(Long commentId, Comment comment);

    List<CommentDto> findCommentsById(Long userId, Long postId);
}
