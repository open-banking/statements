package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBStatementDateTime1  {

    private java.time.LocalDateTime DateTime;
    private String Type;

    public OBStatementDateTime1 () {
    }

    @JsonProperty("DateTime")
    public java.time.LocalDateTime getDateTime() {
        return DateTime;
    }

    public void setDateTime(java.time.LocalDateTime DateTime) {
        this.DateTime = DateTime;
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

        OBStatementDateTime1 OBStatementDateTime1 = (OBStatementDateTime1) o;

        return Objects.equals(DateTime, OBStatementDateTime1.DateTime) &&
               Objects.equals(Type, OBStatementDateTime1.Type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DateTime, Type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatementDateTime1 {\n");
        sb.append("    DateTime: ").append(toIndentedString(DateTime)).append("\n");        sb.append("    Type: ").append(toIndentedString(Type)).append("\n");
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
