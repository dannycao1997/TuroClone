package com.example.carrental.service;
import com.example.carrental.entity.Rental;
import com.example.carrental.repository.RentalRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RentalService {

    private final RentalRepository rentalRepository;

    public RentalService(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @Transactional(readOnly = true)
    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Rental> getRentalById(Long id) {
        return rentalRepository.findById(id);
    }

    @Transactional
    public Rental saveRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    @Transactional
    public void deleteRental(Long id) {
        rentalRepository.deleteById(id);
    }
}
