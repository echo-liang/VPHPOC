package pssg.poc.service.propertyconfigurer;

/**
 * The Class VPHSCEnvironment.
 * @author HLiang
 */
public class VPHSCEnvironment {
	
	/** The system property name environment target. */
	private static String	SYSTEM_PROPERTY_NAME_ENVIRONMENT_TARGET	= "targetEnvironment";

	/**
	 * Gets the target environment.
	 *
	 * @return the target environment
	 */
	public static String getTargetEnvironment() {
		return System.getProperty(SYSTEM_PROPERTY_NAME_ENVIRONMENT_TARGET);
	}
	
}
