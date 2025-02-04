package br.com.wallisson.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date timestmap;
    private String message;
    private String details;

    public ExceptionResponse(Date timestmap, String message, String details) {
        this.timestmap = timestmap;
        this.message = message;
        this.details = details;
    }

    public Date getTimestmap() {
        return timestmap;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
