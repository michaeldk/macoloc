package com.macoloc.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Comment;
import com.macoloc.domain.Message;
import com.macoloc.domain.Roommate;
import com.macoloc.repo.contract.CommentDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class CommentDaoImpl extends GenericDaoImpl<Comment> implements CommentDao {

    public CommentDaoImpl() {
        super(Comment.class);
    }

	@Override
	public List<Comment> findByMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> findByAuthor(Roommate author) {
		// TODO Auto-generated method stub
		return null;
	}

}
