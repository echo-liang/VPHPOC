package pssg.poc.web.controller.rest;

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

	@RequestMapping(value = "/rest/PSSGVPHAPI/eVTTransmission/state", method = RequestMethod.GET)
    public String vphAdminTools(final Model model, final HttpServletRequest request) {
    	logger.info("hello vph hub");
    	return ("{\n" +
                "\t\"interfaceInfo\": [{\n" +
                "\t\t\"interfaceState\": \"RUNNING\",\n" +
                "\t\t\"interfaceName\": \"ICBC_CC\",\n" +
                "\t\t\"lastUpdatedDateTime\": \"2018-08-08 17:10:14.0\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"interfaceState\": \"RUNNING\",\n" +
                "\t\t\"interfaceName\": \"ICBC_QT\",\n" +
                "\t\t\"lastUpdatedDateTime\": \"2018-07-26 15:21:47.0\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"interfaceState\": \"RUNNING\",\n" +
                "\t\t\"interfaceName\": \"ICBC_CR\",\n" +
                "\t\t\"lastUpdatedDateTime\": \"2018-07-25 16:07:56.0\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\t\"interfaceState\": \"FAILED\",\n" +
                "\t\t\"interfaceName\": \"VPH_FD\",\n" +
                "\t\t\"lastUpdatedDateTime\": \"2018-08-10 09:12:54.0\"\n" +
                "\t}]\n" +
                "}");
    }
}
