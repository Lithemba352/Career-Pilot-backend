package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.CompanyProfile;
import za.ac.cput.service.impl.CompanyProfileServiceImpl;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/companyProfile")
public class CompanyProfileController {

    @Autowired
    private CompanyProfileServiceImpl companyProfileService;


    @PostMapping("/add")
    public CompanyProfile add(@RequestBody CompanyProfile companyProfile){
        return companyProfileService.create(companyProfile);
    }

    @GetMapping("/getCompany/{email}")
    public CompanyProfile getCompanyByEmail(@PathVariable String email){
        return companyProfileService.read(email);
    }
}
