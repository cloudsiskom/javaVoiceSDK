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
 * This is a model class for IVRNewRequest type.
 */
public class IVRNewRequest {
    private String action;
    private String ivrName;
    private String ivrTitle;
    private String lang;
    private String gender;
    private String annauncementText;
    private String maxTrying;
    private String exitKey;
    private String backMenu;
    private String mainMenu;
    private String keyPressed;
    private String ivrParent;
    private String ivrAction;

    /**
     * Default constructor.
     */
    public IVRNewRequest() {
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  ivrName  String value for ivrName.
     * @param  ivrTitle  String value for ivrTitle.
     * @param  lang  String value for lang.
     * @param  gender  String value for gender.
     * @param  annauncementText  String value for annauncementText.
     * @param  maxTrying  String value for maxTrying.
     * @param  exitKey  String value for exitKey.
     * @param  backMenu  String value for backMenu.
     * @param  mainMenu  String value for mainMenu.
     * @param  keyPressed  String value for keyPressed.
     * @param  ivrParent  String value for ivrParent.
     * @param  ivrAction  String value for ivrAction.
     */
    public IVRNewRequest(
            String action,
            String ivrName,
            String ivrTitle,
            String lang,
            String gender,
            String annauncementText,
            String maxTrying,
            String exitKey,
            String backMenu,
            String mainMenu,
            String keyPressed,
            String ivrParent,
            String ivrAction) {
        this.action = action;
        this.ivrName = ivrName;
        this.ivrTitle = ivrTitle;
        this.lang = lang;
        this.gender = gender;
        this.annauncementText = annauncementText;
        this.maxTrying = maxTrying;
        this.exitKey = exitKey;
        this.backMenu = backMenu;
        this.mainMenu = mainMenu;
        this.keyPressed = keyPressed;
        this.ivrParent = ivrParent;
        this.ivrAction = ivrAction;
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
     * Getter for IvrName.
     * @return Returns the String
     */
    @JsonGetter("ivr_name")
    public String getIvrName() {
        return ivrName;
    }

    /**
     * Setter for IvrName.
     * @param ivrName Value for String
     */
    @JsonSetter("ivr_name")
    public void setIvrName(String ivrName) {
        this.ivrName = ivrName;
    }

    /**
     * Getter for IvrTitle.
     * @return Returns the String
     */
    @JsonGetter("ivr_title")
    public String getIvrTitle() {
        return ivrTitle;
    }

    /**
     * Setter for IvrTitle.
     * @param ivrTitle Value for String
     */
    @JsonSetter("ivr_title")
    public void setIvrTitle(String ivrTitle) {
        this.ivrTitle = ivrTitle;
    }

    /**
     * Getter for Lang.
     * @return Returns the String
     */
    @JsonGetter("lang")
    public String getLang() {
        return lang;
    }

    /**
     * Setter for Lang.
     * @param lang Value for String
     */
    @JsonSetter("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * Getter for Gender.
     * @return Returns the String
     */
    @JsonGetter("gender")
    public String getGender() {
        return gender;
    }

    /**
     * Setter for Gender.
     * @param gender Value for String
     */
    @JsonSetter("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter for AnnauncementText.
     * @return Returns the String
     */
    @JsonGetter("annauncement_text")
    public String getAnnauncementText() {
        return annauncementText;
    }

    /**
     * Setter for AnnauncementText.
     * @param annauncementText Value for String
     */
    @JsonSetter("annauncement_text")
    public void setAnnauncementText(String annauncementText) {
        this.annauncementText = annauncementText;
    }

    /**
     * Getter for MaxTrying.
     * @return Returns the String
     */
    @JsonGetter("max_trying")
    public String getMaxTrying() {
        return maxTrying;
    }

    /**
     * Setter for MaxTrying.
     * @param maxTrying Value for String
     */
    @JsonSetter("max_trying")
    public void setMaxTrying(String maxTrying) {
        this.maxTrying = maxTrying;
    }

    /**
     * Getter for ExitKey.
     * @return Returns the String
     */
    @JsonGetter("exit_key")
    public String getExitKey() {
        return exitKey;
    }

    /**
     * Setter for ExitKey.
     * @param exitKey Value for String
     */
    @JsonSetter("exit_key")
    public void setExitKey(String exitKey) {
        this.exitKey = exitKey;
    }

    /**
     * Getter for BackMenu.
     * @return Returns the String
     */
    @JsonGetter("back_menu")
    public String getBackMenu() {
        return backMenu;
    }

    /**
     * Setter for BackMenu.
     * @param backMenu Value for String
     */
    @JsonSetter("back_menu")
    public void setBackMenu(String backMenu) {
        this.backMenu = backMenu;
    }

    /**
     * Getter for MainMenu.
     * @return Returns the String
     */
    @JsonGetter("main_menu")
    public String getMainMenu() {
        return mainMenu;
    }

    /**
     * Setter for MainMenu.
     * @param mainMenu Value for String
     */
    @JsonSetter("main_menu")
    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }

    /**
     * Getter for KeyPressed.
     * @return Returns the String
     */
    @JsonGetter("key_pressed")
    public String getKeyPressed() {
        return keyPressed;
    }

    /**
     * Setter for KeyPressed.
     * @param keyPressed Value for String
     */
    @JsonSetter("key_pressed")
    public void setKeyPressed(String keyPressed) {
        this.keyPressed = keyPressed;
    }

    /**
     * Getter for IvrParent.
     * @return Returns the String
     */
    @JsonGetter("ivr_parent")
    public String getIvrParent() {
        return ivrParent;
    }

    /**
     * Setter for IvrParent.
     * @param ivrParent Value for String
     */
    @JsonSetter("ivr_parent")
    public void setIvrParent(String ivrParent) {
        this.ivrParent = ivrParent;
    }

    /**
     * Getter for IvrAction.
     * @return Returns the String
     */
    @JsonGetter("ivr_action")
    public String getIvrAction() {
        return ivrAction;
    }

    /**
     * Setter for IvrAction.
     * @param ivrAction Value for String
     */
    @JsonSetter("ivr_action")
    public void setIvrAction(String ivrAction) {
        this.ivrAction = ivrAction;
    }

    /**
     * Converts this IVRNewRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IVRNewRequest [" + "action=" + action + ", ivrName=" + ivrName + ", ivrTitle="
                + ivrTitle + ", lang=" + lang + ", gender=" + gender + ", annauncementText="
                + annauncementText + ", maxTrying=" + maxTrying + ", exitKey=" + exitKey
                + ", backMenu=" + backMenu + ", mainMenu=" + mainMenu + ", keyPressed=" + keyPressed
                + ", ivrParent=" + ivrParent + ", ivrAction=" + ivrAction + "]";
    }

    /**
     * Builds a new {@link IVRNewRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IVRNewRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, ivrName, ivrTitle, lang, gender, annauncementText,
                maxTrying, exitKey, backMenu, mainMenu, keyPressed, ivrParent, ivrAction);
        return builder;
    }

    /**
     * Class to build instances of {@link IVRNewRequest}.
     */
    public static class Builder {
        private String action;
        private String ivrName;
        private String ivrTitle;
        private String lang;
        private String gender;
        private String annauncementText;
        private String maxTrying;
        private String exitKey;
        private String backMenu;
        private String mainMenu;
        private String keyPressed;
        private String ivrParent;
        private String ivrAction;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  ivrName  String value for ivrName.
         * @param  ivrTitle  String value for ivrTitle.
         * @param  lang  String value for lang.
         * @param  gender  String value for gender.
         * @param  annauncementText  String value for annauncementText.
         * @param  maxTrying  String value for maxTrying.
         * @param  exitKey  String value for exitKey.
         * @param  backMenu  String value for backMenu.
         * @param  mainMenu  String value for mainMenu.
         * @param  keyPressed  String value for keyPressed.
         * @param  ivrParent  String value for ivrParent.
         * @param  ivrAction  String value for ivrAction.
         */
        public Builder(String action, String ivrName, String ivrTitle, String lang, String gender,
                String annauncementText, String maxTrying, String exitKey, String backMenu,
                String mainMenu, String keyPressed, String ivrParent, String ivrAction) {
            this.action = action;
            this.ivrName = ivrName;
            this.ivrTitle = ivrTitle;
            this.lang = lang;
            this.gender = gender;
            this.annauncementText = annauncementText;
            this.maxTrying = maxTrying;
            this.exitKey = exitKey;
            this.backMenu = backMenu;
            this.mainMenu = mainMenu;
            this.keyPressed = keyPressed;
            this.ivrParent = ivrParent;
            this.ivrAction = ivrAction;
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
         * Setter for ivrName.
         * @param  ivrName  String value for ivrName.
         * @return Builder
         */
        public Builder ivrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }

        /**
         * Setter for ivrTitle.
         * @param  ivrTitle  String value for ivrTitle.
         * @return Builder
         */
        public Builder ivrTitle(String ivrTitle) {
            this.ivrTitle = ivrTitle;
            return this;
        }

        /**
         * Setter for lang.
         * @param  lang  String value for lang.
         * @return Builder
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }

        /**
         * Setter for gender.
         * @param  gender  String value for gender.
         * @return Builder
         */
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Setter for annauncementText.
         * @param  annauncementText  String value for annauncementText.
         * @return Builder
         */
        public Builder annauncementText(String annauncementText) {
            this.annauncementText = annauncementText;
            return this;
        }

        /**
         * Setter for maxTrying.
         * @param  maxTrying  String value for maxTrying.
         * @return Builder
         */
        public Builder maxTrying(String maxTrying) {
            this.maxTrying = maxTrying;
            return this;
        }

        /**
         * Setter for exitKey.
         * @param  exitKey  String value for exitKey.
         * @return Builder
         */
        public Builder exitKey(String exitKey) {
            this.exitKey = exitKey;
            return this;
        }

        /**
         * Setter for backMenu.
         * @param  backMenu  String value for backMenu.
         * @return Builder
         */
        public Builder backMenu(String backMenu) {
            this.backMenu = backMenu;
            return this;
        }

        /**
         * Setter for mainMenu.
         * @param  mainMenu  String value for mainMenu.
         * @return Builder
         */
        public Builder mainMenu(String mainMenu) {
            this.mainMenu = mainMenu;
            return this;
        }

        /**
         * Setter for keyPressed.
         * @param  keyPressed  String value for keyPressed.
         * @return Builder
         */
        public Builder keyPressed(String keyPressed) {
            this.keyPressed = keyPressed;
            return this;
        }

        /**
         * Setter for ivrParent.
         * @param  ivrParent  String value for ivrParent.
         * @return Builder
         */
        public Builder ivrParent(String ivrParent) {
            this.ivrParent = ivrParent;
            return this;
        }

        /**
         * Setter for ivrAction.
         * @param  ivrAction  String value for ivrAction.
         * @return Builder
         */
        public Builder ivrAction(String ivrAction) {
            this.ivrAction = ivrAction;
            return this;
        }

        /**
         * Builds a new {@link IVRNewRequest} object using the set fields.
         * @return {@link IVRNewRequest}
         */
        public IVRNewRequest build() {
            return new IVRNewRequest(action, ivrName, ivrTitle, lang, gender, annauncementText,
                    maxTrying, exitKey, backMenu, mainMenu, keyPressed, ivrParent, ivrAction);
        }
    }
}