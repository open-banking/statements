package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBCurrencyExchange5  {

    private String SourceCurrency;
    private java.math.BigDecimal ExchangeRate;
    private java.time.LocalDateTime QuotationDate;
    private String UnitCurrency;
    private String ContractIdentification;
    private OBActiveOrHistoricCurrencyAndAmount InstructedAmount;
    private String TargetCurrency;

    public OBCurrencyExchange5 () {
    }

    @JsonProperty("SourceCurrency")
    public String getSourceCurrency() {
        return SourceCurrency;
    }

    public void setSourceCurrency(String SourceCurrency) {
        this.SourceCurrency = SourceCurrency;
    }

    @JsonProperty("ExchangeRate")
    public java.math.BigDecimal getExchangeRate() {
        return ExchangeRate;
    }

    public void setExchangeRate(java.math.BigDecimal ExchangeRate) {
        this.ExchangeRate = ExchangeRate;
    }

    @JsonProperty("QuotationDate")
    public java.time.LocalDateTime getQuotationDate() {
        return QuotationDate;
    }

    public void setQuotationDate(java.time.LocalDateTime QuotationDate) {
        this.QuotationDate = QuotationDate;
    }

    @JsonProperty("UnitCurrency")
    public String getUnitCurrency() {
        return UnitCurrency;
    }

    public void setUnitCurrency(String UnitCurrency) {
        this.UnitCurrency = UnitCurrency;
    }

    @JsonProperty("ContractIdentification")
    public String getContractIdentification() {
        return ContractIdentification;
    }

    public void setContractIdentification(String ContractIdentification) {
        this.ContractIdentification = ContractIdentification;
    }

    @JsonProperty("InstructedAmount")
    public OBActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
        return InstructedAmount;
    }

    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount InstructedAmount) {
        this.InstructedAmount = InstructedAmount;
    }

    @JsonProperty("TargetCurrency")
    public String getTargetCurrency() {
        return TargetCurrency;
    }

    public void setTargetCurrency(String TargetCurrency) {
        this.TargetCurrency = TargetCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBCurrencyExchange5 OBCurrencyExchange5 = (OBCurrencyExchange5) o;

        return Objects.equals(SourceCurrency, OBCurrencyExchange5.SourceCurrency) &&
               Objects.equals(ExchangeRate, OBCurrencyExchange5.ExchangeRate) &&
               Objects.equals(QuotationDate, OBCurrencyExchange5.QuotationDate) &&
               Objects.equals(UnitCurrency, OBCurrencyExchange5.UnitCurrency) &&
               Objects.equals(ContractIdentification, OBCurrencyExchange5.ContractIdentification) &&
               Objects.equals(InstructedAmount, OBCurrencyExchange5.InstructedAmount) &&
               Objects.equals(TargetCurrency, OBCurrencyExchange5.TargetCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SourceCurrency, ExchangeRate, QuotationDate, UnitCurrency, ContractIdentification, InstructedAmount, TargetCurrency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBCurrencyExchange5 {\n");
        sb.append("    SourceCurrency: ").append(toIndentedString(SourceCurrency)).append("\n");        sb.append("    ExchangeRate: ").append(toIndentedString(ExchangeRate)).append("\n");        sb.append("    QuotationDate: ").append(toIndentedString(QuotationDate)).append("\n");        sb.append("    UnitCurrency: ").append(toIndentedString(UnitCurrency)).append("\n");        sb.append("    ContractIdentification: ").append(toIndentedString(ContractIdentification)).append("\n");        sb.append("    InstructedAmount: ").append(toIndentedString(InstructedAmount)).append("\n");        sb.append("    TargetCurrency: ").append(toIndentedString(TargetCurrency)).append("\n");
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
