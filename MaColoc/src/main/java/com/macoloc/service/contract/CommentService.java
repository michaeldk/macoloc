package com.macoloc.service.contract;

import com.macoloc.domain.Comment;
import com.macoloc.form.CreateCommentForm;
import com.macoloc.service.generic.GenericService;

public interface CommentService extends
		GenericService<Comment, CreateCommentForm> {
}