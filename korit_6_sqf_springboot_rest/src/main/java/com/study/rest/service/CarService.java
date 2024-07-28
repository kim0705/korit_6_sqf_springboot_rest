package com.study.rest.service;

import com.study.rest.entity.Car;
import com.study.rest.repository.CarRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    // final -> 상수: 무조건 한번은 초기화를 해줘야 한다.
    private final CarRepository carRepository;
    private final CarRepository carRepository2;

    public Car getCar(String model) {
        return carRepository.findCarByModel(model);
    }
}
