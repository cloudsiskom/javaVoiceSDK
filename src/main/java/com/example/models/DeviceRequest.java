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
 * This is a model class for DeviceRequest type.
 */
public class DeviceRequest {
    private String deviceType;
    private String deviceOwner;
    private String extension;
    private String secret;
    private String ipAddress;

    /**
     * Default constructor.
     */
    public DeviceRequest() {
    }

    /**
     * Initialization constructor.
     * @param  deviceType  String value for deviceType.
     * @param  deviceOwner  String value for deviceOwner.
     * @param  extension  String value for extension.
     * @param  secret  String value for secret.
     * @param  ipAddress  String value for ipAddress.
     */
    public DeviceRequest(
            String deviceType,
            String deviceOwner,
            String extension,
            String secret,
            String ipAddress) {
        this.deviceType = deviceType;
        this.deviceOwner = deviceOwner;
        this.extension = extension;
        this.secret = secret;
        this.ipAddress = ipAddress;
    }

    /**
     * Getter for DeviceType.
     * @return Returns the String
     */
    @JsonGetter("device_type")
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Setter for DeviceType.
     * @param deviceType Value for String
     */
    @JsonSetter("device_type")
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
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
     * Getter for IpAddress.
     * @return Returns the String
     */
    @JsonGetter("ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Setter for IpAddress.
     * @param ipAddress Value for String
     */
    @JsonSetter("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Converts this DeviceRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceRequest [" + "deviceType=" + deviceType + ", deviceOwner=" + deviceOwner
                + ", extension=" + extension + ", secret=" + secret + ", ipAddress=" + ipAddress
                + "]";
    }

    /**
     * Builds a new {@link DeviceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceType, deviceOwner, extension, secret, ipAddress);
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceRequest}.
     */
    public static class Builder {
        private String deviceType;
        private String deviceOwner;
        private String extension;
        private String secret;
        private String ipAddress;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceType  String value for deviceType.
         * @param  deviceOwner  String value for deviceOwner.
         * @param  extension  String value for extension.
         * @param  secret  String value for secret.
         * @param  ipAddress  String value for ipAddress.
         */
        public Builder(String deviceType, String deviceOwner, String extension, String secret,
                String ipAddress) {
            this.deviceType = deviceType;
            this.deviceOwner = deviceOwner;
            this.extension = extension;
            this.secret = secret;
            this.ipAddress = ipAddress;
        }

        /**
         * Setter for deviceType.
         * @param  deviceType  String value for deviceType.
         * @return Builder
         */
        public Builder deviceType(String deviceType) {
            this.deviceType = deviceType;
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
         * Setter for extension.
         * @param  extension  String value for extension.
         * @return Builder
         */
        public Builder extension(String extension) {
            this.extension = extension;
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
         * Setter for ipAddress.
         * @param  ipAddress  String value for ipAddress.
         * @return Builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * Builds a new {@link DeviceRequest} object using the set fields.
         * @return {@link DeviceRequest}
         */
        public DeviceRequest build() {
            return new DeviceRequest(deviceType, deviceOwner, extension, secret, ipAddress);
        }
    }
}
