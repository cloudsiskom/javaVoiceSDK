/*
 * SiskomVoiceAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for Device1Exception type.
 */
public class Device1Exception extends ApiException {
    private static final long serialVersionUID = -5681859996884982622L;
    private boolean response;
    private int errorCode;
    private String reason;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public Device1Exception(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Response.
     * @return Returns the boolean
     */
    @JsonGetter("response")
    public boolean getResponse() {
        return this.response;
    }

    /**
     * Setter for Response.
     * @param response Value for boolean
     */
    @JsonSetter("response")
    private void setResponse(boolean response) {
        this.response = response;
    }

    /**
     * Getter for ErrorCode.
     * @return Returns the int
     */
    @JsonGetter("error_code")
    public int getErrorCode() {
        return this.errorCode;
    }

    /**
     * Setter for ErrorCode.
     * @param errorCode Value for int
     */
    @JsonSetter("error_code")
    private void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for Reason.
     * @return Returns the String
     */
    @JsonGetter("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for Reason.
     * @param reason Value for String
     */
    @JsonSetter("reason")
    private void setReason(String reason) {
        this.reason = reason;
    }
}
