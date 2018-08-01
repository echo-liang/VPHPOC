package pssg.poc.web.rest.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SCRestController {
	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String vphAdminTools(final Model model, final HttpServletRequest request) {
    	logger.info("hello world");
    	return "{'hello': 'world'}";
    }
}
