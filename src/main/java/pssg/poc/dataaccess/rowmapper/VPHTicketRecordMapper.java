package pssg.poc.dataaccess.rowmapper;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import pssg.poc.model.VPHTicket;

/**
 * The Class VPHTicketRecordMapper.
 * @author HLiang
 */
public class VPHTicketRecordMapper implements RowMapper<VPHTicket> {

	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public VPHTicket mapRow(ResultSet rs, int rowNum) throws SQLException {
		VPHTicket ticket = new VPHTicket();
		ticket.setTicketNO(rs.getString("TICKET_NO"));
		ticket.setTicketID(new BigInteger(rs.getString("TICKET_ID")));
		ticket.setFileName(rs.getString("FILE_NM"));
		ticket.setEnteredDTM(rs.getTimestamp("ENT_DTM") == null ? null : rs.getTimestamp("ENT_DTM").toLocalDateTime());
		
		return ticket;
	}

}
