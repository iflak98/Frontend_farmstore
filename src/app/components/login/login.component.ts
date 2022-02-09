import { Component, OnInit } from '@angular/core';
import {NgForm, FormControl, FormGroup, Validators  } from '@angular/forms';
import { Router } from "@angular/router";
import { UserType } from 'src/app/models/userType';
import { AuthService } from 'src/app/services/auth.service';
import { LoginService } from 'src/app/services/login.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  addCredentialsData = {
    userName: '',
    password: '',
    Usertype: UserType.FARMER
  }

  constructor(private loginService: LoginService,private router: Router, private authService: AuthService) { }

  ngOnInit(): void {
  }

  login(){
    
      console.log(this.addCredentialsData);
      this.loginService.login(this.addCredentialsData).subscribe((response: any) => {
        console.log(response);
        this.authService.storeCredentialsDetails(JSON.stringify(response));
        this.authService.setUsertype(this.addCredentialsData.Usertype);
        if(this.addCredentialsData.Usertype == UserType.FARMER){
          this.router.navigate(['farmer-component']);
        }
       else if(this.addCredentialsData.Usertype == UserType.SUPPLIER){
          this.router.navigate(['supplier-component']);
        }
        else if(this.addCredentialsData.Usertype == UserType.ADMIN){
          this.router.navigate(['admin-component']);
        }
      },
      (error:any) => {
        console.log(error);
      })
    }


    navigateToRegister() {
      this.router.navigate(['registration-component'])
    }
}


