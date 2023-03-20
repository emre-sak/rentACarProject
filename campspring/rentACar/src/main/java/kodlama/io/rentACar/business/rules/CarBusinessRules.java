package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CarBusinessRules {
	
	private CarRepository carRepository;
	private ModelRepository modelRepository;
	
	public void checkIfCarIdExists(int id) {
		if(!this.carRepository.existsById(id)) {
			throw new BusinessException("Car id does not exist");
		}
	}
	
	public void checkIfModelIdExists(int id) {
		if(!this.modelRepository.existsById(id)) {
			throw new BusinessException("Model id does not exist");
		}
	}
	
}
