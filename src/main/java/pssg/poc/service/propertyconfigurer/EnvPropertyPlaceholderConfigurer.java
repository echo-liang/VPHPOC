package pssg.poc.service.propertyconfigurer;

import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * The Class EnvPropertyPlaceholderConfigurer.
 * @author HLiang
 */
public class EnvPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.PropertyPlaceholderConfigurer#resolvePlaceholder(java.lang.String, java.util.Properties)
	 */
	protected String resolvePlaceholder(String placeholder, Properties props) {
		String 	returnValue	= null;
		String 	envSpecVal	= null;

		// get it from environment section
		envSpecVal = props.getProperty(VPHSCEnvironment.getTargetEnvironment() + "." + placeholder);

		//if environment section value exists, return it.
		if (envSpecVal != null && !envSpecVal.isEmpty()) {
			returnValue	=  envSpecVal;
		} else {
			//otherwise return common section value.
			returnValue	= props.getProperty(placeholder);  
		}

		return returnValue;
	}

}
