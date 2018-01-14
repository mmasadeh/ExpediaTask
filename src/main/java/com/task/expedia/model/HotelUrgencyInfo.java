
package com.task.expedia.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "airAttachRemainingTime",
    "numberOfPeopleViewing",
    "numberOfPeopleBooked",
    "numberOfRoomsLeft",
    "lastBookedTime",
    "almostSoldStatus",
    "link",
    "airAttachEnabled"
})
public class HotelUrgencyInfo {

    @JsonProperty("airAttachRemainingTime")
    private String airAttachRemainingTime;
    @JsonProperty("numberOfPeopleViewing")
    private String numberOfPeopleViewing;
    @JsonProperty("numberOfPeopleBooked")
    private String numberOfPeopleBooked;
    @JsonProperty("numberOfRoomsLeft")
    private String numberOfRoomsLeft;
    @JsonProperty("lastBookedTime")
    private String lastBookedTime;
    @JsonProperty("almostSoldStatus")
    private String almostSoldStatus;
    @JsonProperty("link")
    private String link;
    @JsonProperty("airAttachEnabled")
    private Boolean airAttachEnabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("airAttachRemainingTime")
    public String getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    @JsonProperty("airAttachRemainingTime")
    public void setAirAttachRemainingTime(String airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    @JsonProperty("numberOfPeopleViewing")
    public String getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    @JsonProperty("numberOfPeopleViewing")
    public void setNumberOfPeopleViewing(String numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    @JsonProperty("numberOfPeopleBooked")
    public String getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    @JsonProperty("numberOfPeopleBooked")
    public void setNumberOfPeopleBooked(String numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    @JsonProperty("numberOfRoomsLeft")
    public String getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    @JsonProperty("numberOfRoomsLeft")
    public void setNumberOfRoomsLeft(String numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    @JsonProperty("lastBookedTime")
    public String getLastBookedTime() {
        return lastBookedTime;
    }

    @JsonProperty("lastBookedTime")
    public void setLastBookedTime(String lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    @JsonProperty("almostSoldStatus")
    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    @JsonProperty("almostSoldStatus")
    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("airAttachEnabled")
    public Boolean getAirAttachEnabled() {
        return airAttachEnabled;
    }

    @JsonProperty("airAttachEnabled")
    public void setAirAttachEnabled(Boolean airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
