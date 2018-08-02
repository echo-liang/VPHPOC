package pssg.poc.dataaccess.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pssg.poc.dataaccess.dao.VPHDao;
import pssg.poc.dataaccess.service.IVPHService;
import pssg.poc.model.VPHTicket;

@Service
public class VPHService implements IVPHService {

	@Autowired
	VPHDao vphDao;
	
	@Override
	public List<VPHTicket> getTickets() {
		return vphDao.getTickets();
	}

}
