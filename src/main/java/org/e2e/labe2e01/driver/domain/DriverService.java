package org.e2e.labe2e01.driver.domain;

import lombok.RequiredArgsConstructor;
import org.e2e.labe2e01.driver.infrastructure.DriverRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepository repository;



}
