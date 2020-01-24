package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBMerchantDetails1  {

    private String MerchantName;
    private String MerchantCategoryCode;

    public OBMerchantDetails1 () {
    }

    @JsonProperty("MerchantName")
    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    @JsonProperty("MerchantCategoryCode")
    public String getMerchantCategoryCode() {
        return MerchantCategoryCode;
    }

    public void setMerchantCategoryCode(String MerchantCategoryCode) {
        this.MerchantCategoryCode = MerchantCategoryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBMerchantDetails1 OBMerchantDetails1 = (OBMerchantDetails1) o;

        return Objects.equals(MerchantName, OBMerchantDetails1.MerchantName) &&
               Objects.equals(MerchantCategoryCode, OBMerchantDetails1.MerchantCategoryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MerchantName, MerchantCategoryCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBMerchantDetails1 {\n");
        sb.append("    MerchantName: ").append(toIndentedString(MerchantName)).append("\n");        sb.append("    MerchantCategoryCode: ").append(toIndentedString(MerchantCategoryCode)).append("\n");
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
