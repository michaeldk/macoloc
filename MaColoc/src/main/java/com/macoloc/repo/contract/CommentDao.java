package com.macoloc.repo.contract;

import java.util.List;

import com.macoloc.domain.Comment;
import com.macoloc.domain.Message;
import com.macoloc.domain.Roommate;
import com.macoloc.repo.generic.GenericDao;

public interface CommentDao extends GenericDao<Comment> {
	List<Comment> findByMessage(Message message);
	List<Comment> findByAuthor(Roommate author);
}
