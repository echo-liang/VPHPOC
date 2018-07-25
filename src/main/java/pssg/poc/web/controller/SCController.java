package pssg.poc.web.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The Class SCController.
 * @author HLiang
 */
@Controller
public class SCController {

    /** The logger. */
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
		
    /**
     * Vph admin tools.
     *
     * @param model the model
     * @param request the request
     * @return the string
     * @throws VPHDataAccessException the VPH data access exception
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String vphAdminTools(final Model model, final HttpServletRequest request) {
    	SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
        Date now = new Date();
        String strDate = sdfDate.format(now);
        
    	model.addAttribute("curDateTime", strDate);
    	logger.info("View home");
    	return "home";
    }
    
    
    
}
