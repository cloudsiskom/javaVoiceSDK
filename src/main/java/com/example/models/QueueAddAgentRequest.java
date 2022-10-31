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
 * This is a model class for QueueAddAgentRequest type.
 */
public class QueueAddAgentRequest {
    private String queueName;
    private String agents;
    private String agentType;

    /**
     * Default constructor.
     */
    public QueueAddAgentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  queueName  String value for queueName.
     * @param  agents  String value for agents.
     * @param  agentType  String value for agentType.
     */
    public QueueAddAgentRequest(
            String queueName,
            String agents,
            String agentType) {
        this.queueName = queueName;
        this.agents = agents;
        this.agentType = agentType;
    }

    /**
     * Getter for QueueName.
     * @return Returns the String
     */
    @JsonGetter("queue_name")
    public String getQueueName() {
        return queueName;
    }

    /**
     * Setter for QueueName.
     * @param queueName Value for String
     */
    @JsonSetter("queue_name")
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * Getter for Agents.
     * @return Returns the String
     */
    @JsonGetter("agents")
    public String getAgents() {
        return agents;
    }

    /**
     * Setter for Agents.
     * @param agents Value for String
     */
    @JsonSetter("agents")
    public void setAgents(String agents) {
        this.agents = agents;
    }

    /**
     * Getter for AgentType.
     * @return Returns the String
     */
    @JsonGetter("agent_type")
    public String getAgentType() {
        return agentType;
    }

    /**
     * Setter for AgentType.
     * @param agentType Value for String
     */
    @JsonSetter("agent_type")
    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    /**
     * Converts this QueueAddAgentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "QueueAddAgentRequest [" + "queueName=" + queueName + ", agents=" + agents
                + ", agentType=" + agentType + "]";
    }

    /**
     * Builds a new {@link QueueAddAgentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link QueueAddAgentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(queueName, agents, agentType);
        return builder;
    }

    /**
     * Class to build instances of {@link QueueAddAgentRequest}.
     */
    public static class Builder {
        private String queueName;
        private String agents;
        private String agentType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  queueName  String value for queueName.
         * @param  agents  String value for agents.
         * @param  agentType  String value for agentType.
         */
        public Builder(String queueName, String agents, String agentType) {
            this.queueName = queueName;
            this.agents = agents;
            this.agentType = agentType;
        }

        /**
         * Setter for queueName.
         * @param  queueName  String value for queueName.
         * @return Builder
         */
        public Builder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * Setter for agents.
         * @param  agents  String value for agents.
         * @return Builder
         */
        public Builder agents(String agents) {
            this.agents = agents;
            return this;
        }

        /**
         * Setter for agentType.
         * @param  agentType  String value for agentType.
         * @return Builder
         */
        public Builder agentType(String agentType) {
            this.agentType = agentType;
            return this;
        }

        /**
         * Builds a new {@link QueueAddAgentRequest} object using the set fields.
         * @return {@link QueueAddAgentRequest}
         */
        public QueueAddAgentRequest build() {
            return new QueueAddAgentRequest(queueName, agents, agentType);
        }
    }
}
