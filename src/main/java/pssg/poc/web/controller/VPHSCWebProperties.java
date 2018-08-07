package pssg.poc.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The Class VPHSCWebProperties.
 * @author HLiang
 */
@Component
public class VPHSCWebProperties {

    /** The greeting. */
    public static String GREETING;
    
    /** The version. */
    public static String VERSION;
    
    /** The error code wiki page url. */
    public static String ERROR_CODE_WIKI_PAGE_URL;
    
    /**
     * Sets the clp logoff url.
     *
     * @param greeting the new greeting
     */
    @Value("${greeting}")
    private void setGreeting(final String greeting) {
        VPHSCWebProperties.GREETING = greeting;
    }
    
    /**
     * Sets the error codes WIKI page URL.
     *
     * @param errorCodesWIKIPageURL the new error codes WIKI page URL
     */
    @Value("${errorCodesWIKIPageURL}")
    private void setErrorCodesWIKIPageURL(final String errorCodesWIKIPageURL) {
        VPHSCWebProperties.ERROR_CODE_WIKI_PAGE_URL = errorCodesWIKIPageURL;
    }
    
    /**
     * Sets the version.
     *
     * @param version the new version
     */
    @Value("${version}")
    private void setVersion(final String version) {
        VPHSCWebProperties.VERSION = version;
    }
}
