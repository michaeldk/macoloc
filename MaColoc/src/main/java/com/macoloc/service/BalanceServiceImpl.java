package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Balance;
import com.macoloc.form.CreateBalanceForm;
import com.macoloc.repo.contract.BalanceDao;
import com.macoloc.service.contract.BalanceService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class BalanceServiceImpl extends GenericServiceImpl<Balance, CreateBalanceForm> implements BalanceService {

    @Autowired
    public BalanceServiceImpl(final BalanceDao dao) {
        super(dao);
    }

    @Override
    public CreateBalanceForm createForm() {
        return new CreateBalanceForm();
    }

    @Override
    protected Balance populateEntity(Balance element, CreateBalanceForm form) {
    	if (element == null) {
    		element = new Balance();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateBalanceForm form, final Balance element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(Balance Balance) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateBalanceForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
