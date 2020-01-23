package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBTransactionCashBalance  {

    
    
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

    
    private OBBalanceType1Code Type;
    private OBActiveOrHistoricCurrencyAndAmount Amount;

    public OBTransactionCashBalance () {
    }

    @JsonProperty("CreditDebitIndicator")
    public CreditDebitIndicatorEnum getCreditDebitIndicator() {
        return CreditDebitIndicator;
    }

    public void setCreditDebitIndicator(CreditDebitIndicatorEnum CreditDebitIndicator) {
        this.CreditDebitIndicator = CreditDebitIndicator;
    }

    @JsonProperty("Type")
    public OBBalanceType1Code getType() {
        return Type;
    }

    public void setType(OBBalanceType1Code Type) {
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

        OBTransactionCashBalance OBTransactionCashBalance = (OBTransactionCashBalance) o;

        return Objects.equals(CreditDebitIndicator, OBTransactionCashBalance.CreditDebitIndicator) &&
               Objects.equals(Type, OBTransactionCashBalance.Type) &&
               Objects.equals(Amount, OBTransactionCashBalance.Amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CreditDebitIndicator, Type, Amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransactionCashBalance {\n");
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
