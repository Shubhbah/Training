package Pojo;

	import java.util.List;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"pricesByArea"})
	
	@Generated("jsonschema2pojo")
	public class Pojo {

	@JsonProperty("pricesByArea")
	private List<PricesByArea> pricesByArea;

	@JsonProperty("pricesByArea")
	public List<PricesByArea> getPricesByArea() {
	return pricesByArea;
	}

	@JsonProperty("pricesByArea")
	public void setPricesByArea(List<PricesByArea> pricesByArea) 
	{
	this.pricesByArea = pricesByArea;
	}

	
}
