package com.example.rest.service;

import com.example.rest.model.Movimiento;
import com.example.rest.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoService {
    @Autowired
    private MovimientoRepository movimientoRepository;

    public List<Movimiento> findAll() {
        return movimientoRepository.findAll();
    }

    public Optional<Movimiento> findById(Long id) {
        return movimientoRepository.findById(id);
    }

    public Movimiento save(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public void deleteById(Long id) {
        movimientoRepository.deleteById(id);
    }
}