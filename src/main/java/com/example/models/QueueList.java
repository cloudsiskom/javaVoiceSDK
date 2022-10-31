/*
 * SiskomVoiceAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for QueueList type.
 */
public class QueueList {
    private boolean response;
    private List<Data6> data;

    /**
     * Default constructor.
     */
    public QueueList() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  data  List of Data6 value for data.
     */
    public QueueList(
            boolean response,
            List<Data6> data) {
        this.response = response;
        this.data = data;
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
     * Getter for Data.
     * @return Returns the List of Data6
     */
    @JsonGetter("data")
    public List<Data6> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of Data6
     */
    @JsonSetter("data")
    public void setData(List<Data6> data) {
        this.data = data;
    }

    /**
     * Converts this QueueList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "QueueList [" + "response=" + response + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link QueueList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link QueueList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, data);
        return builder;
    }

    /**
     * Class to build instances of {@link QueueList}.
     */
    public static class Builder {
        private boolean response;
        private List<Data6> data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  data  List of Data6 value for data.
         */
        public Builder(boolean response, List<Data6> data) {
            this.response = response;
            this.data = data;
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
         * Setter for data.
         * @param  data  List of Data6 value for data.
         * @return Builder
         */
        public Builder data(List<Data6> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link QueueList} object using the set fields.
         * @return {@link QueueList}
         */
        public QueueList build() {
            return new QueueList(response, data);
        }
    }
}