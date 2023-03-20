package kodlama.io.rentACar.business.requests;
import jakarta.validation.constraints.Min;
/*
 * @NotNull, girilmesi zorunlu alan
 * @NotBlank, boş girilemez
 * @Size, min ve max girilecek karater kısıtı.
 * Bunlar validation oluyor.
 * 
 * Javax validation constraints list yazarak araştır.
 * 
 * Mesela validationları requestslerde kullanmamız daha faydalı olur. Mesela ekleme yaparken 3 güncelleme yaparken 
 * 5 karakter girilebir vs. diyebiliriz ama entity'de kullanırsak o her yerde geçerli olur.
 * 
 */
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
	
	@NotNull(message = "Model cannot be null")
	@NotBlank(message = "Model cannot be blank")
	@Size(min= 3, max = 20)
	private String name;
	@Min(value = 1, message = "ID must be greater than or equal to 1")
	private int brandId;

}
