package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
	
	@NotNull(message = "Plate cannot be null")
	@NotBlank(message = "Plate cannot be blank")
	private String plate;
	@DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
	private double dailyPrice;
	@Min(value = 2013, message = "Model cannot be less than 2013")
	private int modelYear;
	@Min(value = 1, message = "Can be at least 1")
	@Max(value = 3, message = "Can be up to 3")
	private int state;
	@Min(value = 1, message = "ID must be greater than or equal to 1")
	private int modelId;

}
