package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBBankTransactionCodeStructure1  {

    private String SubCode;
    private String Code;

    public OBBankTransactionCodeStructure1 () {
    }

    @JsonProperty("SubCode")
    public String getSubCode() {
        return SubCode;
    }

    public void setSubCode(String SubCode) {
        this.SubCode = SubCode;
    }

    @JsonProperty("Code")
    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBBankTransactionCodeStructure1 OBBankTransactionCodeStructure1 = (OBBankTransactionCodeStructure1) o;

        return Objects.equals(SubCode, OBBankTransactionCodeStructure1.SubCode) &&
               Objects.equals(Code, OBBankTransactionCodeStructure1.Code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SubCode, Code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBankTransactionCodeStructure1 {\n");
        sb.append("    SubCode: ").append(toIndentedString(SubCode)).append("\n");        sb.append("    Code: ").append(toIndentedString(Code)).append("\n");
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
