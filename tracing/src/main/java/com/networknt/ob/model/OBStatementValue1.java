package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBStatementValue1  {

    private Integer Value;
    private String Type;

    public OBStatementValue1 () {
    }

    @JsonProperty("Value")
    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer Value) {
        this.Value = Value;
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

        OBStatementValue1 OBStatementValue1 = (OBStatementValue1) o;

        return Objects.equals(Value, OBStatementValue1.Value) &&
               Objects.equals(Type, OBStatementValue1.Type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Value, Type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatementValue1 {\n");
        sb.append("    Value: ").append(toIndentedString(Value)).append("\n");        sb.append("    Type: ").append(toIndentedString(Type)).append("\n");
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
