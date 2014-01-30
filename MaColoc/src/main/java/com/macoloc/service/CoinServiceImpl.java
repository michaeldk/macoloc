package com.macoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macoloc.domain.Coin;
import com.macoloc.form.CreateCoinForm;
import com.macoloc.repo.contract.CoinDao;
import com.macoloc.service.contract.CoinService;
import com.macoloc.service.generic.GenericServiceImpl;

@Service
public class CoinServiceImpl extends GenericServiceImpl<Coin, CreateCoinForm> implements CoinService {

    @Autowired
    public CoinServiceImpl(final CoinDao dao) {
        super(dao);
    }

    @Override
    public CreateCoinForm createForm() {
        return new CreateCoinForm();
    }

    @Override
    protected Coin populateEntity(Coin element, CreateCoinForm form) {
    	if (element == null) {
    		element = new Coin();
    	}
    	// TODO Auto-generated method stub
    	return element;
    }

    @Override
    protected void populateForm(final CreateCoinForm form, final Coin element) {
    	// TODO Auto-generated method stub
    }
	
	public void verifyBusinessRules(Coin Coin) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(CreateCoinForm form) throws Exception {
		// TODO Auto-generated method stub
	}

}
