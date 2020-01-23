package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBReadTransaction4  {

    private Links Links;
    private Meta Meta;
    private Object Data;

    public OBReadTransaction4 () {
    }

    @JsonProperty("Links")
    public Links getLinks() {
        return Links;
    }

    public void setLinks(Links Links) {
        this.Links = Links;
    }

    @JsonProperty("Meta")
    public Meta getMeta() {
        return Meta;
    }

    public void setMeta(Meta Meta) {
        this.Meta = Meta;
    }

    @JsonProperty("Data")
    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBReadTransaction4 OBReadTransaction4 = (OBReadTransaction4) o;

        return Objects.equals(Links, OBReadTransaction4.Links) &&
               Objects.equals(Meta, OBReadTransaction4.Meta) &&
               Objects.equals(Data, OBReadTransaction4.Data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Links, Meta, Data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadTransaction4 {\n");
        sb.append("    Links: ").append(toIndentedString(Links)).append("\n");        sb.append("    Meta: ").append(toIndentedString(Meta)).append("\n");        sb.append("    Data: ").append(toIndentedString(Data)).append("\n");
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
