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
 * This is a model class for RouteOutgoing type.
 */
public class RouteOutgoing {
    private boolean response;
    private String device;
    private String routeTo;
    private String routeDetail;

    /**
     * Default constructor.
     */
    public RouteOutgoing() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  device  String value for device.
     * @param  routeTo  String value for routeTo.
     * @param  routeDetail  String value for routeDetail.
     */
    public RouteOutgoing(
            boolean response,
            String device,
            String routeTo,
            String routeDetail) {
        this.response = response;
        this.device = device;
        this.routeTo = routeTo;
        this.routeDetail = routeDetail;
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
     * Getter for Device.
     * @return Returns the String
     */
    @JsonGetter("device")
    public String getDevice() {
        return device;
    }

    /**
     * Setter for Device.
     * @param device Value for String
     */
    @JsonSetter("device")
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * Getter for RouteTo.
     * @return Returns the String
     */
    @JsonGetter("route_to")
    public String getRouteTo() {
        return routeTo;
    }

    /**
     * Setter for RouteTo.
     * @param routeTo Value for String
     */
    @JsonSetter("route_to")
    public void setRouteTo(String routeTo) {
        this.routeTo = routeTo;
    }

    /**
     * Getter for RouteDetail.
     * @return Returns the String
     */
    @JsonGetter("route_detail")
    public String getRouteDetail() {
        return routeDetail;
    }

    /**
     * Setter for RouteDetail.
     * @param routeDetail Value for String
     */
    @JsonSetter("route_detail")
    public void setRouteDetail(String routeDetail) {
        this.routeDetail = routeDetail;
    }

    /**
     * Converts this RouteOutgoing into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RouteOutgoing [" + "response=" + response + ", device=" + device + ", routeTo="
                + routeTo + ", routeDetail=" + routeDetail + "]";
    }

    /**
     * Builds a new {@link RouteOutgoing.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RouteOutgoing.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, device, routeTo, routeDetail);
        return builder;
    }

    /**
     * Class to build instances of {@link RouteOutgoing}.
     */
    public static class Builder {
        private boolean response;
        private String device;
        private String routeTo;
        private String routeDetail;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  device  String value for device.
         * @param  routeTo  String value for routeTo.
         * @param  routeDetail  String value for routeDetail.
         */
        public Builder(boolean response, String device, String routeTo, String routeDetail) {
            this.response = response;
            this.device = device;
            this.routeTo = routeTo;
            this.routeDetail = routeDetail;
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
         * Setter for device.
         * @param  device  String value for device.
         * @return Builder
         */
        public Builder device(String device) {
            this.device = device;
            return this;
        }

        /**
         * Setter for routeTo.
         * @param  routeTo  String value for routeTo.
         * @return Builder
         */
        public Builder routeTo(String routeTo) {
            this.routeTo = routeTo;
            return this;
        }

        /**
         * Setter for routeDetail.
         * @param  routeDetail  String value for routeDetail.
         * @return Builder
         */
        public Builder routeDetail(String routeDetail) {
            this.routeDetail = routeDetail;
            return this;
        }

        /**
         * Builds a new {@link RouteOutgoing} object using the set fields.
         * @return {@link RouteOutgoing}
         */
        public RouteOutgoing build() {
            return new RouteOutgoing(response, device, routeTo, routeDetail);
        }
    }
}