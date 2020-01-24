package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBTransaction4  {

    private OBEntryStatus1Code Status;
    private OBSupplementaryData1 SupplementaryData;
    private OBBranchAndFinancialInstitutionIdentification6 CreditorAgent;
    private OBCashAccount6 DebtorAccount;
    private String AccountId;
    private String TransactionReference;
    private Object ProprietaryBankTransactionCode;
    private String AddressLine;
    private OBActiveOrHistoricCurrencyAndAmount Amount;
    private OBCashAccount6 CreditorAccount;
    
    
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

    
    private OBCurrencyExchange5 CurrencyExchange;
    private java.util.List<String> StatementReference;
    private OBActiveOrHistoricCurrencyAndAmount ChargeAmount;
    private String TransactionId;
    private String TransactionInformation;
    private java.time.LocalDateTime BookingDateTime;
    private OBBankTransactionCodeStructure1 BankTransactionCode;
    private OBMerchantDetails1 MerchantDetails;
    private OBTransactionCardInstrument1 CardInstrument;
    private java.time.LocalDateTime ValueDateTime;
    private OBBranchAndFinancialInstitutionIdentification6 DebtorAgent;
    private OBTransactionCashBalance Balance;

    public OBTransaction4 () {
    }

    @JsonProperty("Status")
    public OBEntryStatus1Code getStatus() {
        return Status;
    }

    public void setStatus(OBEntryStatus1Code Status) {
        this.Status = Status;
    }

    @JsonProperty("SupplementaryData")
    public OBSupplementaryData1 getSupplementaryData() {
        return SupplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 SupplementaryData) {
        this.SupplementaryData = SupplementaryData;
    }

    @JsonProperty("CreditorAgent")
    public OBBranchAndFinancialInstitutionIdentification6 getCreditorAgent() {
        return CreditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification6 CreditorAgent) {
        this.CreditorAgent = CreditorAgent;
    }

    @JsonProperty("DebtorAccount")
    public OBCashAccount6 getDebtorAccount() {
        return DebtorAccount;
    }

    public void setDebtorAccount(OBCashAccount6 DebtorAccount) {
        this.DebtorAccount = DebtorAccount;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("TransactionReference")
    public String getTransactionReference() {
        return TransactionReference;
    }

    public void setTransactionReference(String TransactionReference) {
        this.TransactionReference = TransactionReference;
    }

    @JsonProperty("ProprietaryBankTransactionCode")
    public Object getProprietaryBankTransactionCode() {
        return ProprietaryBankTransactionCode;
    }

    public void setProprietaryBankTransactionCode(Object ProprietaryBankTransactionCode) {
        this.ProprietaryBankTransactionCode = ProprietaryBankTransactionCode;
    }

    @JsonProperty("AddressLine")
    public String getAddressLine() {
        return AddressLine;
    }

    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    @JsonProperty("Amount")
    public OBActiveOrHistoricCurrencyAndAmount getAmount() {
        return Amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount Amount) {
        this.Amount = Amount;
    }

    @JsonProperty("CreditorAccount")
    public OBCashAccount6 getCreditorAccount() {
        return CreditorAccount;
    }

    public void setCreditorAccount(OBCashAccount6 CreditorAccount) {
        this.CreditorAccount = CreditorAccount;
    }

    @JsonProperty("CreditDebitIndicator")
    public CreditDebitIndicatorEnum getCreditDebitIndicator() {
        return CreditDebitIndicator;
    }

    public void setCreditDebitIndicator(CreditDebitIndicatorEnum CreditDebitIndicator) {
        this.CreditDebitIndicator = CreditDebitIndicator;
    }

    @JsonProperty("CurrencyExchange")
    public OBCurrencyExchange5 getCurrencyExchange() {
        return CurrencyExchange;
    }

    public void setCurrencyExchange(OBCurrencyExchange5 CurrencyExchange) {
        this.CurrencyExchange = CurrencyExchange;
    }

    @JsonProperty("StatementReference")
    public java.util.List<String> getStatementReference() {
        return StatementReference;
    }

    public void setStatementReference(java.util.List<String> StatementReference) {
        this.StatementReference = StatementReference;
    }

    @JsonProperty("ChargeAmount")
    public OBActiveOrHistoricCurrencyAndAmount getChargeAmount() {
        return ChargeAmount;
    }

    public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount ChargeAmount) {
        this.ChargeAmount = ChargeAmount;
    }

    @JsonProperty("TransactionId")
    public String getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    @JsonProperty("TransactionInformation")
    public String getTransactionInformation() {
        return TransactionInformation;
    }

    public void setTransactionInformation(String TransactionInformation) {
        this.TransactionInformation = TransactionInformation;
    }

    @JsonProperty("BookingDateTime")
    public java.time.LocalDateTime getBookingDateTime() {
        return BookingDateTime;
    }

    public void setBookingDateTime(java.time.LocalDateTime BookingDateTime) {
        this.BookingDateTime = BookingDateTime;
    }

    @JsonProperty("BankTransactionCode")
    public OBBankTransactionCodeStructure1 getBankTransactionCode() {
        return BankTransactionCode;
    }

    public void setBankTransactionCode(OBBankTransactionCodeStructure1 BankTransactionCode) {
        this.BankTransactionCode = BankTransactionCode;
    }

    @JsonProperty("MerchantDetails")
    public OBMerchantDetails1 getMerchantDetails() {
        return MerchantDetails;
    }

    public void setMerchantDetails(OBMerchantDetails1 MerchantDetails) {
        this.MerchantDetails = MerchantDetails;
    }

    @JsonProperty("CardInstrument")
    public OBTransactionCardInstrument1 getCardInstrument() {
        return CardInstrument;
    }

    public void setCardInstrument(OBTransactionCardInstrument1 CardInstrument) {
        this.CardInstrument = CardInstrument;
    }

    @JsonProperty("ValueDateTime")
    public java.time.LocalDateTime getValueDateTime() {
        return ValueDateTime;
    }

    public void setValueDateTime(java.time.LocalDateTime ValueDateTime) {
        this.ValueDateTime = ValueDateTime;
    }

    @JsonProperty("DebtorAgent")
    public OBBranchAndFinancialInstitutionIdentification6 getDebtorAgent() {
        return DebtorAgent;
    }

    public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification6 DebtorAgent) {
        this.DebtorAgent = DebtorAgent;
    }

    @JsonProperty("Balance")
    public OBTransactionCashBalance getBalance() {
        return Balance;
    }

    public void setBalance(OBTransactionCashBalance Balance) {
        this.Balance = Balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBTransaction4 OBTransaction4 = (OBTransaction4) o;

        return Objects.equals(Status, OBTransaction4.Status) &&
               Objects.equals(SupplementaryData, OBTransaction4.SupplementaryData) &&
               Objects.equals(CreditorAgent, OBTransaction4.CreditorAgent) &&
               Objects.equals(DebtorAccount, OBTransaction4.DebtorAccount) &&
               Objects.equals(AccountId, OBTransaction4.AccountId) &&
               Objects.equals(TransactionReference, OBTransaction4.TransactionReference) &&
               Objects.equals(ProprietaryBankTransactionCode, OBTransaction4.ProprietaryBankTransactionCode) &&
               Objects.equals(AddressLine, OBTransaction4.AddressLine) &&
               Objects.equals(Amount, OBTransaction4.Amount) &&
               Objects.equals(CreditorAccount, OBTransaction4.CreditorAccount) &&
               Objects.equals(CreditDebitIndicator, OBTransaction4.CreditDebitIndicator) &&
               Objects.equals(CurrencyExchange, OBTransaction4.CurrencyExchange) &&
               Objects.equals(StatementReference, OBTransaction4.StatementReference) &&
               Objects.equals(ChargeAmount, OBTransaction4.ChargeAmount) &&
               Objects.equals(TransactionId, OBTransaction4.TransactionId) &&
               Objects.equals(TransactionInformation, OBTransaction4.TransactionInformation) &&
               Objects.equals(BookingDateTime, OBTransaction4.BookingDateTime) &&
               Objects.equals(BankTransactionCode, OBTransaction4.BankTransactionCode) &&
               Objects.equals(MerchantDetails, OBTransaction4.MerchantDetails) &&
               Objects.equals(CardInstrument, OBTransaction4.CardInstrument) &&
               Objects.equals(ValueDateTime, OBTransaction4.ValueDateTime) &&
               Objects.equals(DebtorAgent, OBTransaction4.DebtorAgent) &&
               Objects.equals(Balance, OBTransaction4.Balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Status, SupplementaryData, CreditorAgent, DebtorAccount, AccountId, TransactionReference, ProprietaryBankTransactionCode, AddressLine, Amount, CreditorAccount, CreditDebitIndicator, CurrencyExchange, StatementReference, ChargeAmount, TransactionId, TransactionInformation, BookingDateTime, BankTransactionCode, MerchantDetails, CardInstrument, ValueDateTime, DebtorAgent, Balance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransaction4 {\n");
        sb.append("    Status: ").append(toIndentedString(Status)).append("\n");        sb.append("    SupplementaryData: ").append(toIndentedString(SupplementaryData)).append("\n");        sb.append("    CreditorAgent: ").append(toIndentedString(CreditorAgent)).append("\n");        sb.append("    DebtorAccount: ").append(toIndentedString(DebtorAccount)).append("\n");        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    TransactionReference: ").append(toIndentedString(TransactionReference)).append("\n");        sb.append("    ProprietaryBankTransactionCode: ").append(toIndentedString(ProprietaryBankTransactionCode)).append("\n");        sb.append("    AddressLine: ").append(toIndentedString(AddressLine)).append("\n");        sb.append("    Amount: ").append(toIndentedString(Amount)).append("\n");        sb.append("    CreditorAccount: ").append(toIndentedString(CreditorAccount)).append("\n");        sb.append("    CreditDebitIndicator: ").append(toIndentedString(CreditDebitIndicator)).append("\n");        sb.append("    CurrencyExchange: ").append(toIndentedString(CurrencyExchange)).append("\n");        sb.append("    StatementReference: ").append(toIndentedString(StatementReference)).append("\n");        sb.append("    ChargeAmount: ").append(toIndentedString(ChargeAmount)).append("\n");        sb.append("    TransactionId: ").append(toIndentedString(TransactionId)).append("\n");        sb.append("    TransactionInformation: ").append(toIndentedString(TransactionInformation)).append("\n");        sb.append("    BookingDateTime: ").append(toIndentedString(BookingDateTime)).append("\n");        sb.append("    BankTransactionCode: ").append(toIndentedString(BankTransactionCode)).append("\n");        sb.append("    MerchantDetails: ").append(toIndentedString(MerchantDetails)).append("\n");        sb.append("    CardInstrument: ").append(toIndentedString(CardInstrument)).append("\n");        sb.append("    ValueDateTime: ").append(toIndentedString(ValueDateTime)).append("\n");        sb.append("    DebtorAgent: ").append(toIndentedString(DebtorAgent)).append("\n");        sb.append("    Balance: ").append(toIndentedString(Balance)).append("\n");
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
