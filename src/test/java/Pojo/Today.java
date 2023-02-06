package Pojo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"timestamp",
"price",
"tag"
})
@Generated("jsonschema2pojo")
public class Today {

@JsonProperty("timestamp")
private String timestamp;
@JsonProperty("price")
private Double price;
@JsonProperty("tag")
private String tag;

@JsonProperty("timestamp")
public String getTimestamp() {
return timestamp;
}

@JsonProperty("timestamp")
public void setTimestamp(String timestamp) {
this.timestamp = timestamp;
}

@JsonProperty("price")
public Double getPrice() {
return price;
}

@JsonProperty("price")
public void setPrice(Double price) {
this.price = price;
}

@JsonProperty("tag")
public String getTag() {
return tag;
}

@JsonProperty("tag")
public void setTag(String tag) {
this.tag = tag;
}

}
