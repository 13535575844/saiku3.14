package com.yibo.saiku.service.util.exception;

public class SaikuDataSourceException extends SaikuServiceException {

    /**
     * @see Exception#Exception()
     */
    SaikuDataSourceException() {
        super();
    }

    /**
     * @see Exception#Exception(String))
     */

    public SaikuDataSourceException(String message) {
        super(message);
    }

    /**
     * @see Exception#Exception(Throwable)
     */
    SaikuDataSourceException(Throwable cause) {
        super(cause);
    }

    /**
     * @see Exception#Exception(String, Throwable)
     */
    SaikuDataSourceException(String message, Throwable cause) {
        super(message, cause);
    }

}
