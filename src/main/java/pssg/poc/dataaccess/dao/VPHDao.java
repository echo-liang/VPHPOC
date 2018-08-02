package pssg.poc.dataaccess.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pssg.poc.dataaccess.rowmapper.VPHTicketRecordMapper;
import pssg.poc.model.VPHTicket;


@Repository
public class VPHDao {

	private static final Logger log = LoggerFactory.getLogger(VPHDao.class);
	
	@Autowired
	public JdbcTemplate vphJdbcTemplate;
	
	public List<VPHTicket> getTickets() {
		log.info("Call to getTickets");
		String sql = "SELECT * FROM VPH_TICKETS";
		List<VPHTicket> tickets = null;
		try{
			tickets  = vphJdbcTemplate.query(sql, new VPHTicketRecordMapper());
		} catch (DataAccessException e) {
			log.error("Exception occurred during getTickets call: {}", e.getMessage());
		}
		
		return tickets;
	}
}
