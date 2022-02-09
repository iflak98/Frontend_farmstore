import { Component, OnInit } from '@angular/core';
import { UserType } from 'src/app/models/userType';
import { RegistrationService } from 'src/app/services/registration.service';
import { Router } from "@angular/router";
import { Orders } from 'src/app/models/orders';
import { Farmer } from 'src/app/models/farmer';
import { Supplier } from 'src/app/models/supplier';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  
farmer: Farmer = new Farmer();
supplier: Supplier = new Supplier();
isFarmer: boolean = true;

  addFarmerData = {
    farmerId : 0,
    farmerName : '',
    farmerMobile : '',
    farmerLocation : '',
    credential :{
      userName : '',
      password : '',
      Usertype : UserType.FARMER
    }
  }

    addSupplierData = {
      supplierId : 0,
      supplierName : '',
      supplierMobile : '',
      supplierLocation : '',
      orders:Array<Orders>(),
      credential :{
        userName : '',
        password : '',
        Usertype : UserType.SUPPLIER
      }
    
    }

  constructor(private registrationService: RegistrationService,
    private router: Router) { }

  ngOnInit(): void {
  }
  registerFarmer(){

    
    console.log(this.addFarmerData);
    this.registrationService.registerFarmer(this.addFarmerData).subscribe((response) => {
      console.log(response);
      
    })
    this.router.navigate(['']);
    }

    setFarmer() {
      this.isFarmer = true;
    }
    setSupplier() {
      this.isFarmer = false;
    }

    registerSupplier() {
    console.log(this.addSupplierData);
    this.registrationService.registerSupplier(this.addSupplierData).subscribe((response) => {
      console.log(response);
      
    })
    this.router.navigate(['']);
  }

}

