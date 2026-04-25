package org.e2e.labe2e01.driver.application;


import lombok.RequiredArgsConstructor;
import org.e2e.labe2e01.driver.domain.DriverService;
import org.e2e.labe2e01.driver.infrastructure.DriverRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
@RequiredArgsConstructor
public class DriverController {
    private final DriverService service;
    private final DriverRepository repository;
}
