package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
	
	@Min(value = 1, message = "ID must be greater than or equal to 1")
	private int id;
	@NotNull(message = "Name cannot be null")
	@NotBlank(message = "Name cannot be blank")
	private String name;
}
