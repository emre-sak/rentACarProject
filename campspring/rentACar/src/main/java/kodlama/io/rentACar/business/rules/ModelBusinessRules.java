package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelBusinessRules {

	private ModelRepository modelRepository;
	private BrandRepository brandRepository;

	public void checkIfModelNameExists(String name) {

		if (this.modelRepository.existsByName(name)) {
			throw new BusinessException("Model name already exists");
		}

	}

	public void checkIfModelIdExists(int id) {

		if (!this.modelRepository.existsById(id)) {
			throw new BusinessException("Model id does not exist");
		}

	}
	
	public void checkIfBrandIdExists(int id) {

		if (!this.brandRepository.existsById(id)) {
			throw new BusinessException("Brand id does not exist");
		}

	}

}
