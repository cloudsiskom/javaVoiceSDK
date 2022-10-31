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
 * This is a model class for Data4 type.
 */
public class Data4 {
    private int id;
    private String customerCode;
    private int agentCode;
    private String agentName;
    private int requirePassword;
    private int agentPassword;
    private int lastlogin;
    private int isActive;
    private int isLogin;
    private String loginChannel;
    private String loginExtension;
    private String loginUniqueid;

    /**
     * Default constructor.
     */
    public Data4() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  customerCode  String value for customerCode.
     * @param  agentCode  int value for agentCode.
     * @param  agentName  String value for agentName.
     * @param  requirePassword  int value for requirePassword.
     * @param  agentPassword  int value for agentPassword.
     * @param  lastlogin  int value for lastlogin.
     * @param  isActive  int value for isActive.
     * @param  isLogin  int value for isLogin.
     * @param  loginChannel  String value for loginChannel.
     * @param  loginExtension  String value for loginExtension.
     * @param  loginUniqueid  String value for loginUniqueid.
     */
    public Data4(
            int id,
            String customerCode,
            int agentCode,
            String agentName,
            int requirePassword,
            int agentPassword,
            int lastlogin,
            int isActive,
            int isLogin,
            String loginChannel,
            String loginExtension,
            String loginUniqueid) {
        this.id = id;
        this.customerCode = customerCode;
        this.agentCode = agentCode;
        this.agentName = agentName;
        this.requirePassword = requirePassword;
        this.agentPassword = agentPassword;
        this.lastlogin = lastlogin;
        this.isActive = isActive;
        this.isLogin = isLogin;
        this.loginChannel = loginChannel;
        this.loginExtension = loginExtension;
        this.loginUniqueid = loginUniqueid;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for CustomerCode.
     * @return Returns the String
     */
    @JsonGetter("customer_code")
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Setter for CustomerCode.
     * @param customerCode Value for String
     */
    @JsonSetter("customer_code")
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * Getter for AgentCode.
     * @return Returns the int
     */
    @JsonGetter("agent_code")
    public int getAgentCode() {
        return agentCode;
    }

    /**
     * Setter for AgentCode.
     * @param agentCode Value for int
     */
    @JsonSetter("agent_code")
    public void setAgentCode(int agentCode) {
        this.agentCode = agentCode;
    }

    /**
     * Getter for AgentName.
     * @return Returns the String
     */
    @JsonGetter("agent_name")
    public String getAgentName() {
        return agentName;
    }

    /**
     * Setter for AgentName.
     * @param agentName Value for String
     */
    @JsonSetter("agent_name")
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * Getter for RequirePassword.
     * @return Returns the int
     */
    @JsonGetter("require_password")
    public int getRequirePassword() {
        return requirePassword;
    }

    /**
     * Setter for RequirePassword.
     * @param requirePassword Value for int
     */
    @JsonSetter("require_password")
    public void setRequirePassword(int requirePassword) {
        this.requirePassword = requirePassword;
    }

    /**
     * Getter for AgentPassword.
     * @return Returns the int
     */
    @JsonGetter("agent_password")
    public int getAgentPassword() {
        return agentPassword;
    }

    /**
     * Setter for AgentPassword.
     * @param agentPassword Value for int
     */
    @JsonSetter("agent_password")
    public void setAgentPassword(int agentPassword) {
        this.agentPassword = agentPassword;
    }

    /**
     * Getter for Lastlogin.
     * @return Returns the int
     */
    @JsonGetter("lastlogin")
    public int getLastlogin() {
        return lastlogin;
    }

    /**
     * Setter for Lastlogin.
     * @param lastlogin Value for int
     */
    @JsonSetter("lastlogin")
    public void setLastlogin(int lastlogin) {
        this.lastlogin = lastlogin;
    }

    /**
     * Getter for IsActive.
     * @return Returns the int
     */
    @JsonGetter("isActive")
    public int getIsActive() {
        return isActive;
    }

    /**
     * Setter for IsActive.
     * @param isActive Value for int
     */
    @JsonSetter("isActive")
    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    /**
     * Getter for IsLogin.
     * @return Returns the int
     */
    @JsonGetter("isLogin")
    public int getIsLogin() {
        return isLogin;
    }

    /**
     * Setter for IsLogin.
     * @param isLogin Value for int
     */
    @JsonSetter("isLogin")
    public void setIsLogin(int isLogin) {
        this.isLogin = isLogin;
    }

    /**
     * Getter for LoginChannel.
     * @return Returns the String
     */
    @JsonGetter("login_channel")
    public String getLoginChannel() {
        return loginChannel;
    }

    /**
     * Setter for LoginChannel.
     * @param loginChannel Value for String
     */
    @JsonSetter("login_channel")
    public void setLoginChannel(String loginChannel) {
        this.loginChannel = loginChannel;
    }

    /**
     * Getter for LoginExtension.
     * @return Returns the String
     */
    @JsonGetter("login_extension")
    public String getLoginExtension() {
        return loginExtension;
    }

    /**
     * Setter for LoginExtension.
     * @param loginExtension Value for String
     */
    @JsonSetter("login_extension")
    public void setLoginExtension(String loginExtension) {
        this.loginExtension = loginExtension;
    }

    /**
     * Getter for LoginUniqueid.
     * @return Returns the String
     */
    @JsonGetter("login_uniqueid")
    public String getLoginUniqueid() {
        return loginUniqueid;
    }

    /**
     * Setter for LoginUniqueid.
     * @param loginUniqueid Value for String
     */
    @JsonSetter("login_uniqueid")
    public void setLoginUniqueid(String loginUniqueid) {
        this.loginUniqueid = loginUniqueid;
    }

    /**
     * Converts this Data4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Data4 [" + "id=" + id + ", customerCode=" + customerCode + ", agentCode="
                + agentCode + ", agentName=" + agentName + ", requirePassword=" + requirePassword
                + ", agentPassword=" + agentPassword + ", lastlogin=" + lastlogin + ", isActive="
                + isActive + ", isLogin=" + isLogin + ", loginChannel=" + loginChannel
                + ", loginExtension=" + loginExtension + ", loginUniqueid=" + loginUniqueid + "]";
    }

    /**
     * Builds a new {@link Data4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Data4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, customerCode, agentCode, agentName, requirePassword,
                agentPassword, lastlogin, isActive, isLogin, loginChannel, loginExtension,
                loginUniqueid);
        return builder;
    }

    /**
     * Class to build instances of {@link Data4}.
     */
    public static class Builder {
        private int id;
        private String customerCode;
        private int agentCode;
        private String agentName;
        private int requirePassword;
        private int agentPassword;
        private int lastlogin;
        private int isActive;
        private int isLogin;
        private String loginChannel;
        private String loginExtension;
        private String loginUniqueid;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  customerCode  String value for customerCode.
         * @param  agentCode  int value for agentCode.
         * @param  agentName  String value for agentName.
         * @param  requirePassword  int value for requirePassword.
         * @param  agentPassword  int value for agentPassword.
         * @param  lastlogin  int value for lastlogin.
         * @param  isActive  int value for isActive.
         * @param  isLogin  int value for isLogin.
         * @param  loginChannel  String value for loginChannel.
         * @param  loginExtension  String value for loginExtension.
         * @param  loginUniqueid  String value for loginUniqueid.
         */
        public Builder(int id, String customerCode, int agentCode, String agentName,
                int requirePassword, int agentPassword, int lastlogin, int isActive, int isLogin,
                String loginChannel, String loginExtension, String loginUniqueid) {
            this.id = id;
            this.customerCode = customerCode;
            this.agentCode = agentCode;
            this.agentName = agentName;
            this.requirePassword = requirePassword;
            this.agentPassword = agentPassword;
            this.lastlogin = lastlogin;
            this.isActive = isActive;
            this.isLogin = isLogin;
            this.loginChannel = loginChannel;
            this.loginExtension = loginExtension;
            this.loginUniqueid = loginUniqueid;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for customerCode.
         * @param  customerCode  String value for customerCode.
         * @return Builder
         */
        public Builder customerCode(String customerCode) {
            this.customerCode = customerCode;
            return this;
        }

        /**
         * Setter for agentCode.
         * @param  agentCode  int value for agentCode.
         * @return Builder
         */
        public Builder agentCode(int agentCode) {
            this.agentCode = agentCode;
            return this;
        }

        /**
         * Setter for agentName.
         * @param  agentName  String value for agentName.
         * @return Builder
         */
        public Builder agentName(String agentName) {
            this.agentName = agentName;
            return this;
        }

        /**
         * Setter for requirePassword.
         * @param  requirePassword  int value for requirePassword.
         * @return Builder
         */
        public Builder requirePassword(int requirePassword) {
            this.requirePassword = requirePassword;
            return this;
        }

        /**
         * Setter for agentPassword.
         * @param  agentPassword  int value for agentPassword.
         * @return Builder
         */
        public Builder agentPassword(int agentPassword) {
            this.agentPassword = agentPassword;
            return this;
        }

        /**
         * Setter for lastlogin.
         * @param  lastlogin  int value for lastlogin.
         * @return Builder
         */
        public Builder lastlogin(int lastlogin) {
            this.lastlogin = lastlogin;
            return this;
        }

        /**
         * Setter for isActive.
         * @param  isActive  int value for isActive.
         * @return Builder
         */
        public Builder isActive(int isActive) {
            this.isActive = isActive;
            return this;
        }

        /**
         * Setter for isLogin.
         * @param  isLogin  int value for isLogin.
         * @return Builder
         */
        public Builder isLogin(int isLogin) {
            this.isLogin = isLogin;
            return this;
        }

        /**
         * Setter for loginChannel.
         * @param  loginChannel  String value for loginChannel.
         * @return Builder
         */
        public Builder loginChannel(String loginChannel) {
            this.loginChannel = loginChannel;
            return this;
        }

        /**
         * Setter for loginExtension.
         * @param  loginExtension  String value for loginExtension.
         * @return Builder
         */
        public Builder loginExtension(String loginExtension) {
            this.loginExtension = loginExtension;
            return this;
        }

        /**
         * Setter for loginUniqueid.
         * @param  loginUniqueid  String value for loginUniqueid.
         * @return Builder
         */
        public Builder loginUniqueid(String loginUniqueid) {
            this.loginUniqueid = loginUniqueid;
            return this;
        }

        /**
         * Builds a new {@link Data4} object using the set fields.
         * @return {@link Data4}
         */
        public Data4 build() {
            return new Data4(id, customerCode, agentCode, agentName, requirePassword, agentPassword,
                    lastlogin, isActive, isLogin, loginChannel, loginExtension, loginUniqueid);
        }
    }
}
