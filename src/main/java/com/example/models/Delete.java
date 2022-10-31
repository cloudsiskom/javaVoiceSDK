/*
 * SiskomVoiceAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for Delete type.
 */
public class Delete {
    private boolean response;
    private String callerId;
    private String action;

    /**
     * Default constructor.
     */
    public Delete() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  callerId  String value for callerId.
     * @param  action  String value for action.
     */
    public Delete(
            boolean response,
            String callerId,
            String action) {
        this.response = response;
        this.callerId = callerId;
        this.action = action;
    }

    /**
     * Getter for Response.
     * @return Returns the boolean
     */
    @JsonGetter("response")
    public boolean getResponse() {
        return response;
    }

    /**
     * Setter for Response.
     * @param response Value for boolean
     */
    @JsonSetter("response")
    public void setResponse(boolean response) {
        this.response = response;
    }

    /**
     * Getter for CallerId.
     * @return Returns the String
     */
    @JsonGetter("caller_id")
    public String getCallerId() {
        return callerId;
    }

    /**
     * Setter for CallerId.
     * @param callerId Value for String
     */
    @JsonSetter("caller_id")
    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    /**
     * Getter for Action.
     * @return Returns the String
     */
    @JsonGetter("action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * @param action Value for String
     */
    @JsonSetter("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Converts this Delete into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Delete [" + "response=" + response + ", callerId=" + callerId + ", action=" + action
                + "]";
    }

    /**
     * Builds a new {@link Delete.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Delete.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, callerId, action);
        return builder;
    }

    /**
     * Class to build instances of {@link Delete}.
     */
    public static class Builder {
        private boolean response;
        private String callerId;
        private String action;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  callerId  String value for callerId.
         * @param  action  String value for action.
         */
        public Builder(boolean response, String callerId, String action) {
            this.response = response;
            this.callerId = callerId;
            this.action = action;
        }

        /**
         * Setter for response.
         * @param  response  boolean value for response.
         * @return Builder
         */
        public Builder response(boolean response) {
            this.response = response;
            return this;
        }

        /**
         * Setter for callerId.
         * @param  callerId  String value for callerId.
         * @return Builder
         */
        public Builder callerId(String callerId) {
            this.callerId = callerId;
            return this;
        }

        /**
         * Setter for action.
         * @param  action  String value for action.
         * @return Builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Builds a new {@link Delete} object using the set fields.
         * @return {@link Delete}
         */
        public Delete build() {
            return new Delete(response, callerId, action);
        }
    }
}
