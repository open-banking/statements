package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBTransactionCardInstrument1  {

    private String Identification;
    private OBExternalCardSchemeType1Code CardSchemeName;
    private OBExternalCardAuthorisationType1Code AuthorisationType;
    private String Name;

    public OBTransactionCardInstrument1 () {
    }

    @JsonProperty("Identification")
    public String getIdentification() {
        return Identification;
    }

    public void setIdentification(String Identification) {
        this.Identification = Identification;
    }

    @JsonProperty("CardSchemeName")
    public OBExternalCardSchemeType1Code getCardSchemeName() {
        return CardSchemeName;
    }

    public void setCardSchemeName(OBExternalCardSchemeType1Code CardSchemeName) {
        this.CardSchemeName = CardSchemeName;
    }

    @JsonProperty("AuthorisationType")
    public OBExternalCardAuthorisationType1Code getAuthorisationType() {
        return AuthorisationType;
    }

    public void setAuthorisationType(OBExternalCardAuthorisationType1Code AuthorisationType) {
        this.AuthorisationType = AuthorisationType;
    }

    @JsonProperty("Name")
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBTransactionCardInstrument1 OBTransactionCardInstrument1 = (OBTransactionCardInstrument1) o;

        return Objects.equals(Identification, OBTransactionCardInstrument1.Identification) &&
               Objects.equals(CardSchemeName, OBTransactionCardInstrument1.CardSchemeName) &&
               Objects.equals(AuthorisationType, OBTransactionCardInstrument1.AuthorisationType) &&
               Objects.equals(Name, OBTransactionCardInstrument1.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Identification, CardSchemeName, AuthorisationType, Name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransactionCardInstrument1 {\n");
        sb.append("    Identification: ").append(toIndentedString(Identification)).append("\n");        sb.append("    CardSchemeName: ").append(toIndentedString(CardSchemeName)).append("\n");        sb.append("    AuthorisationType: ").append(toIndentedString(AuthorisationType)).append("\n");        sb.append("    Name: ").append(toIndentedString(Name)).append("\n");
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
