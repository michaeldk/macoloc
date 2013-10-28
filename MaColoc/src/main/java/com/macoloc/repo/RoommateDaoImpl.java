package com.macoloc.repo;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.macoloc.domain.Roommate;
import com.macoloc.repo.contract.RoommateDao;
import com.macoloc.repo.generic.GenericDaoImpl;

@Repository
public class RoommateDaoImpl extends GenericDaoImpl<Roommate> implements RoommateDao {

    public RoommateDaoImpl() {
        super(Roommate.class);
    }

	@Override
	public Roommate findByEmail(String email) {
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<Roommate> criteria = builder.createQuery(Roommate.class);
        final Root<Roommate> roommmateRoot = criteria.from(Roommate.class);
        criteria.select(roommmateRoot);
        criteria.where(builder.equal(roommmateRoot.get("email"), email));

        return this.entityManager.createQuery(criteria).getSingleResult();
	}

}
