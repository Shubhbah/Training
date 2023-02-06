package Pojo;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"deliveryArea",
"today",
"tomorrow"
})
@Generated("jsonschema2pojo")
public class PricesByArea {

@JsonProperty("deliveryArea")
private String deliveryArea;
@JsonProperty("today")
private List<Today> today;
@JsonProperty("tomorrow")
private List<Object> tomorrow;

@JsonProperty("deliveryArea")
public String getDeliveryArea() {
return deliveryArea;
}

@JsonProperty("deliveryArea")
public void setDeliveryArea(String deliveryArea) {
this.deliveryArea = deliveryArea;
}

@JsonProperty("today")
public List<Today> getToday() {
return today;
}

@JsonProperty("today")
public void setToday(List<Today> today) {
this.today = today;
}

@JsonProperty("tomorrow")
public List<Object> getTomorrow() {
return tomorrow;
}

@JsonProperty("tomorrow")
public void setTomorrow(List<Object> tomorrow) {
this.tomorrow = tomorrow;
}

}