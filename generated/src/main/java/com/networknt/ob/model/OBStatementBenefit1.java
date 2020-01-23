package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBStatementBenefit1  {

    private String Type;
    private OBActiveOrHistoricCurrencyAndAmount Amount;

    public OBStatementBenefit1 () {
    }

    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @JsonProperty("Amount")
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return Amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount Amount) {
        this.Amount = Amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBStatementBenefit1 OBStatementBenefit1 = (OBStatementBenefit1) o;

        return Objects.equals(Type, OBStatementBenefit1.Type) &&
               Objects.equals(Amount, OBStatementBenefit1.Amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Type, Amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatementBenefit1 {\n");
        sb.append("    Type: ").append(toIndentedString(Type)).append("\n");        sb.append("    Amount: ").append(toIndentedString(Amount)).append("\n");
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
