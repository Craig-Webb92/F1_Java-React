package com.example.f1.controller;
import com.example.f1.dto.DriverDto;
import com.example.f1.service.DriverService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/drivers")
public class DriverController
{
    private final DriverService driverService;
    public DriverController(DriverService driverService)
    {
        this.driverService = driverService;
    }
    @GetMapping("/{number}")
    public DriverDto getDriver(@PathVariable int number)
    {
        return driverService.getDriver(number);
    }
}