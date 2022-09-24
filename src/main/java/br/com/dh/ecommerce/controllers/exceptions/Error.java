package br.com.dh.ecommerce.controllers.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class Error implements Serializable {
    public static final long serialVersionUID = 1L;

    private Instant timestamp;
    private Integer Status;
    private String error;
    private String msg;

    private String link;

    public Error() {}

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

