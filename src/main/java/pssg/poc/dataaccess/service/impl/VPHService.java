package pssg.poc.dataaccess.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pssg.poc.dataaccess.dao.VPHDao;
import pssg.poc.dataaccess.service.IVPHService;
import pssg.poc.model.VPHTicket;

public class VPHService implements IVPHService {

	@Autowired
	VPHDao vphDao;
	
	@Override
	public List<VPHTicket> getTickets() {
		return vphDao.getTickets();
	}

}
