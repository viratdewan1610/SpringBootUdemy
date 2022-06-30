package com.springboot.basics.Spring.boot.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
	@Inject
	SomeCDIDAO someCDIDAO;
	
	public SomeCDIDAO getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
}
