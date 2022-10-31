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
 * This is a model class for DeviceEditRequest type.
 */
public class DeviceEditRequest {
    private String extension;
    private String deviceOwner;
    private String secret;

    /**
     * Default constructor.
     */
    public DeviceEditRequest() {
    }

    /**
     * Initialization constructor.
     * @param  extension  String value for extension.
     * @param  deviceOwner  String value for deviceOwner.
     * @param  secret  String value for secret.
     */
    public DeviceEditRequest(
            String extension,
            String deviceOwner,
            String secret) {
        this.extension = extension;
        this.deviceOwner = deviceOwner;
        this.secret = secret;
    }

    /**
     * Getter for Extension.
     * @return Returns the String
     */
    @JsonGetter("extension")
    public String getExtension() {
        return extension;
    }

    /**
     * Setter for Extension.
     * @param extension Value for String
     */
    @JsonSetter("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * Getter for DeviceOwner.
     * @return Returns the String
     */
    @JsonGetter("device_owner")
    public String getDeviceOwner() {
        return deviceOwner;
    }

    /**
     * Setter for DeviceOwner.
     * @param deviceOwner Value for String
     */
    @JsonSetter("device_owner")
    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    /**
     * Getter for Secret.
     * @return Returns the String
     */
    @JsonGetter("secret")
    public String getSecret() {
        return secret;
    }

    /**
     * Setter for Secret.
     * @param secret Value for String
     */
    @JsonSetter("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * Converts this DeviceEditRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceEditRequest [" + "extension=" + extension + ", deviceOwner=" + deviceOwner
                + ", secret=" + secret + "]";
    }

    /**
     * Builds a new {@link DeviceEditRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceEditRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(extension, deviceOwner, secret);
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceEditRequest}.
     */
    public static class Builder {
        private String extension;
        private String deviceOwner;
        private String secret;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  extension  String value for extension.
         * @param  deviceOwner  String value for deviceOwner.
         * @param  secret  String value for secret.
         */
        public Builder(String extension, String deviceOwner, String secret) {
            this.extension = extension;
            this.deviceOwner = deviceOwner;
            this.secret = secret;
        }

        /**
         * Setter for extension.
         * @param  extension  String value for extension.
         * @return Builder
         */
        public Builder extension(String extension) {
            this.extension = extension;
            return this;
        }

        /**
         * Setter for deviceOwner.
         * @param  deviceOwner  String value for deviceOwner.
         * @return Builder
         */
        public Builder deviceOwner(String deviceOwner) {
            this.deviceOwner = deviceOwner;
            return this;
        }

        /**
         * Setter for secret.
         * @param  secret  String value for secret.
         * @return Builder
         */
        public Builder secret(String secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Builds a new {@link DeviceEditRequest} object using the set fields.
         * @return {@link DeviceEditRequest}
         */
        public DeviceEditRequest build() {
            return new DeviceEditRequest(extension, deviceOwner, secret);
        }
    }
}
