package com.digibizna.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author ekaranja
 */
@Entity
@Table(name = "businesses")
@EntityListeners(AuditingEntityListener.class)

public class Business implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonProperty("businessname")
    private String businessName;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("location")
    private String location;
    @JsonProperty("businessNature")
    private String businessNature;
    @JsonProperty("valid")
    private boolean valid;
    @JsonProperty("status")
    private String status;
    @JsonProperty("locked")
    private boolean locked;
    @JsonProperty("salonOwner")
    private String salonOwner;
    @JsonProperty("loginCode")
    private String loginCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getSalonOwner() {
        return salonOwner;
    }

    public void setSalonOwner(String salonOwner) {
        this.salonOwner = salonOwner;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }
    

}
