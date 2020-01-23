package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBStatementAmount1  {

    
    
    public enum CreditDebitIndicatorEnum {
        
        CREDIT ("Credit"), 
        
        DEBIT ("Debit"); 
        

        private final String value;

        CreditDebitIndicatorEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CreditDebitIndicatorEnum fromValue(String text) {
            for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                return b;
                }
            }
            return null;
        }
    }

    private CreditDebitIndicatorEnum CreditDebitIndicator;

    
    private String Type;
    private OBActiveOrHistoricCurrencyAndAmount Amount;

    public OBStatementAmount1 () {
    }

    @JsonProperty("CreditDebitIndicator")
    public CreditDebitIndicatorEnum getCreditDebitIndicator() {
        return CreditDebitIndicator;
    }

    public void setCreditDebitIndicator(CreditDebitIndicatorEnum CreditDebitIndicator) {
        this.CreditDebitIndicator = CreditDebitIndicator;
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

        OBStatementAmount1 OBStatementAmount1 = (OBStatementAmount1) o;

        return Objects.equals(CreditDebitIndicator, OBStatementAmount1.CreditDebitIndicator) &&
               Objects.equals(Type, OBStatementAmount1.Type) &&
               Objects.equals(Amount, OBStatementAmount1.Amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CreditDebitIndicator, Type, Amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatementAmount1 {\n");
        sb.append("    CreditDebitIndicator: ").append(toIndentedString(CreditDebitIndicator)).append("\n");        sb.append("    Type: ").append(toIndentedString(Type)).append("\n");        sb.append("    Amount: ").append(toIndentedString(Amount)).append("\n");
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
