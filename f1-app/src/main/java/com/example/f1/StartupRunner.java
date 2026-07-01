package com.example.f1;
import com.example.f1.dto.DriverDto;
import com.example.f1.service.DriverService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class StartupRunner implements CommandLineRunner {

    private final DriverService driverService;
    
    public StartupRunner(DriverService driverService) 
    { 
        this.driverService = driverService; 
    }

    @Override
    public void run(String... args) 
    {
        DriverDto driver = driverService.getDriver(2);
        System.out.println(driver);
    }
}