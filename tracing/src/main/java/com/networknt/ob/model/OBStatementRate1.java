package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBStatementRate1  {

    private String Rate;
    private String Type;

    public OBStatementRate1 () {
    }

    @JsonProperty("Rate")
    public String getRate() {
        return Rate;
    }

    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBStatementRate1 OBStatementRate1 = (OBStatementRate1) o;

        return Objects.equals(Rate, OBStatementRate1.Rate) &&
               Objects.equals(Type, OBStatementRate1.Type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Rate, Type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatementRate1 {\n");
        sb.append("    Rate: ").append(toIndentedString(Rate)).append("\n");        sb.append("    Type: ").append(toIndentedString(Type)).append("\n");
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
