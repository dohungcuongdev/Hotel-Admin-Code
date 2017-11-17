package services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.TestDAO;
import services.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDAO testDAO;
	
	@Override
	public String getName() {
		return testDAO.getName();
	}

}
