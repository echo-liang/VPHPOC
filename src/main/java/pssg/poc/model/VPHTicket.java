package pssg.poc.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * The Class VPHTicket.
 * @author HLiang
 */
public class VPHTicket {
	
	/** The ticket ID. */
	private BigInteger ticketID;
	
	/** The ticket NO. */
	private String ticketNO;
	
	/** The entered DTM. */
	private LocalDateTime enteredDTM;
	
	/** The file name. */
	private String fileName;
	
	/**
	 * Gets the ticket ID.
	 *
	 * @return the ticket ID
	 */
	public BigInteger getTicketID() {
		return ticketID;
	}
	
	/**
	 * Sets the ticket ID.
	 *
	 * @param ticketID the new ticket ID
	 */
	public void setTicketID(BigInteger ticketID) {
		this.ticketID = ticketID;
	}
	
	/**
	 * Gets the ticket NO.
	 *
	 * @return the ticket NO
	 */
	public String getTicketNO() {
		return ticketNO;
	}
	
	/**
	 * Sets the ticket NO.
	 *
	 * @param ticketNO the new ticket NO
	 */
	public void setTicketNO(String ticketNO) {
		this.ticketNO = ticketNO;
	}
	
	/**
	 * Gets the entered DTM.
	 *
	 * @return the entered DTM
	 */
	public LocalDateTime getEnteredDTM() {
		return enteredDTM;
	}
	
	/**
	 * Sets the entered DTM.
	 *
	 * @param enteredDTM the new entered DTM
	 */
	public void setEnteredDTM(LocalDateTime enteredDTM) {
		this.enteredDTM = enteredDTM;
	}
	
	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}
	
	/**
	 * Sets the file name.
	 *
	 * @param fileName the new file name
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
