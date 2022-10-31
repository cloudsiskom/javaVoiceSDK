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
 * This is a model class for IntentEdit type.
 */
public class IntentEdit {
    private boolean response;
    private String message;

    /**
     * Default constructor.
     */
    public IntentEdit() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  message  String value for message.
     */
    public IntentEdit(
            boolean response,
            String message) {
        this.response = response;
        this.message = message;
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
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this IntentEdit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IntentEdit [" + "response=" + response + ", message=" + message + "]";
    }

    /**
     * Builds a new {@link IntentEdit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IntentEdit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, message);
        return builder;
    }

    /**
     * Class to build instances of {@link IntentEdit}.
     */
    public static class Builder {
        private boolean response;
        private String message;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  message  String value for message.
         */
        public Builder(boolean response, String message) {
            this.response = response;
            this.message = message;
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
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link IntentEdit} object using the set fields.
         * @return {@link IntentEdit}
         */
        public IntentEdit build() {
            return new IntentEdit(response, message);
        }
    }
}
