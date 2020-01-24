package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBStatement1  {

    private String AccountId;
    private String StatementReference;
    private java.util.List<OBStatementDateTime1> StatementDateTime;
    private java.util.List<OBStatementInterest1> StatementInterest;
    private OBExternalStatementType1Code Type;
    private java.time.LocalDateTime StartDateTime;
    private java.time.LocalDateTime CreationDateTime;
    private java.util.List<OBStatementRate1> StatementRate;
    private java.time.LocalDateTime EndDateTime;
    private String StatementId;
    private java.util.List<OBStatementValue1> StatementValue;
    private java.util.List<OBStatementBenefit1> StatementBenefit;
    private java.util.List<OBStatementFee1> StatementFee;
    private java.util.List<String> StatementDescription;
    private java.util.List<OBStatementAmount1> StatementAmount;

    public OBStatement1 () {
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("StatementReference")
    public String getStatementReference() {
        return StatementReference;
    }

    public void setStatementReference(String StatementReference) {
        this.StatementReference = StatementReference;
    }

    @JsonProperty("StatementDateTime")
    public java.util.List<OBStatementDateTime1> getStatementDateTime() {
        return StatementDateTime;
    }

    public void setStatementDateTime(java.util.List<OBStatementDateTime1> StatementDateTime) {
        this.StatementDateTime = StatementDateTime;
    }

    @JsonProperty("StatementInterest")
    public java.util.List<OBStatementInterest1> getStatementInterest() {
        return StatementInterest;
    }

    public void setStatementInterest(java.util.List<OBStatementInterest1> StatementInterest) {
        this.StatementInterest = StatementInterest;
    }

    @JsonProperty("Type")
    public OBExternalStatementType1Code getType() {
        return Type;
    }

    public void setType(OBExternalStatementType1Code Type) {
        this.Type = Type;
    }

    @JsonProperty("StartDateTime")
    public java.time.LocalDateTime getStartDateTime() {
        return StartDateTime;
    }

    public void setStartDateTime(java.time.LocalDateTime StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    @JsonProperty("CreationDateTime")
    public java.time.LocalDateTime getCreationDateTime() {
        return CreationDateTime;
    }

    public void setCreationDateTime(java.time.LocalDateTime CreationDateTime) {
        this.CreationDateTime = CreationDateTime;
    }

    @JsonProperty("StatementRate")
    public java.util.List<OBStatementRate1> getStatementRate() {
        return StatementRate;
    }

    public void setStatementRate(java.util.List<OBStatementRate1> StatementRate) {
        this.StatementRate = StatementRate;
    }

    @JsonProperty("EndDateTime")
    public java.time.LocalDateTime getEndDateTime() {
        return EndDateTime;
    }

    public void setEndDateTime(java.time.LocalDateTime EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    @JsonProperty("StatementId")
    public String getStatementId() {
        return StatementId;
    }

    public void setStatementId(String StatementId) {
        this.StatementId = StatementId;
    }

    @JsonProperty("StatementValue")
    public java.util.List<OBStatementValue1> getStatementValue() {
        return StatementValue;
    }

    public void setStatementValue(java.util.List<OBStatementValue1> StatementValue) {
        this.StatementValue = StatementValue;
    }

    @JsonProperty("StatementBenefit")
    public java.util.List<OBStatementBenefit1> getStatementBenefit() {
        return StatementBenefit;
    }

    public void setStatementBenefit(java.util.List<OBStatementBenefit1> StatementBenefit) {
        this.StatementBenefit = StatementBenefit;
    }

    @JsonProperty("StatementFee")
    public java.util.List<OBStatementFee1> getStatementFee() {
        return StatementFee;
    }

    public void setStatementFee(java.util.List<OBStatementFee1> StatementFee) {
        this.StatementFee = StatementFee;
    }

    @JsonProperty("StatementDescription")
    public java.util.List<String> getStatementDescription() {
        return StatementDescription;
    }

    public void setStatementDescription(java.util.List<String> StatementDescription) {
        this.StatementDescription = StatementDescription;
    }

    @JsonProperty("StatementAmount")
    public java.util.List<OBStatementAmount1> getStatementAmount() {
        return StatementAmount;
    }

    public void setStatementAmount(java.util.List<OBStatementAmount1> StatementAmount) {
        this.StatementAmount = StatementAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBStatement1 OBStatement1 = (OBStatement1) o;

        return Objects.equals(AccountId, OBStatement1.AccountId) &&
               Objects.equals(StatementReference, OBStatement1.StatementReference) &&
               Objects.equals(StatementDateTime, OBStatement1.StatementDateTime) &&
               Objects.equals(StatementInterest, OBStatement1.StatementInterest) &&
               Objects.equals(Type, OBStatement1.Type) &&
               Objects.equals(StartDateTime, OBStatement1.StartDateTime) &&
               Objects.equals(CreationDateTime, OBStatement1.CreationDateTime) &&
               Objects.equals(StatementRate, OBStatement1.StatementRate) &&
               Objects.equals(EndDateTime, OBStatement1.EndDateTime) &&
               Objects.equals(StatementId, OBStatement1.StatementId) &&
               Objects.equals(StatementValue, OBStatement1.StatementValue) &&
               Objects.equals(StatementBenefit, OBStatement1.StatementBenefit) &&
               Objects.equals(StatementFee, OBStatement1.StatementFee) &&
               Objects.equals(StatementDescription, OBStatement1.StatementDescription) &&
               Objects.equals(StatementAmount, OBStatement1.StatementAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AccountId, StatementReference, StatementDateTime, StatementInterest, Type, StartDateTime, CreationDateTime, StatementRate, EndDateTime, StatementId, StatementValue, StatementBenefit, StatementFee, StatementDescription, StatementAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement1 {\n");
        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    StatementReference: ").append(toIndentedString(StatementReference)).append("\n");        sb.append("    StatementDateTime: ").append(toIndentedString(StatementDateTime)).append("\n");        sb.append("    StatementInterest: ").append(toIndentedString(StatementInterest)).append("\n");        sb.append("    Type: ").append(toIndentedString(Type)).append("\n");        sb.append("    StartDateTime: ").append(toIndentedString(StartDateTime)).append("\n");        sb.append("    CreationDateTime: ").append(toIndentedString(CreationDateTime)).append("\n");        sb.append("    StatementRate: ").append(toIndentedString(StatementRate)).append("\n");        sb.append("    EndDateTime: ").append(toIndentedString(EndDateTime)).append("\n");        sb.append("    StatementId: ").append(toIndentedString(StatementId)).append("\n");        sb.append("    StatementValue: ").append(toIndentedString(StatementValue)).append("\n");        sb.append("    StatementBenefit: ").append(toIndentedString(StatementBenefit)).append("\n");        sb.append("    StatementFee: ").append(toIndentedString(StatementFee)).append("\n");        sb.append("    StatementDescription: ").append(toIndentedString(StatementDescription)).append("\n");        sb.append("    StatementAmount: ").append(toIndentedString(StatementAmount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
