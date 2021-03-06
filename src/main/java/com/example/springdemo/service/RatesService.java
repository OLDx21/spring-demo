package com.example.springdemo.service;

import com.example.springdemo.domain.Rates;
import com.example.springdemo.mapper.RatesMapper;
import com.example.springdemo.model.RatesDto;
import com.example.springdemo.repository.RatesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RatesService {

    private final RatesRepository ratesRepository;

    private final RatesMapper ratesMapper;

    public List<RatesDto> findAll() {
        List<Rates> rates = ratesRepository.findAll();
        return ratesMapper.toDto(rates);
    }
}
