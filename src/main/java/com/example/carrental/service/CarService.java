package com.example.carrental.service;

import com.example.carrental.entity.Car;
import com.example.carrental.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Transactional(readOnly = true)
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    @Transactional
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Transactional
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
