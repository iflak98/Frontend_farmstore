import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Credentials } from '../models/credential';
import { Farmer } from '../models/farmer';
import { Supplier } from '../models/supplier';
import { UserType } from '../models/userType';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  baseUrl = 'http://localhost:8083';
  constructor(private http: HttpClient) { }
  
newcredentials :Credentials={
  userName : '',
  password :'',
  Usertype : UserType.FARMER
}
  
  // registerFarmer(farmerData: Farmer): Observable<Farmer>{
  //   return this.http.post<Farmer>(this.baseUrl + '/register/registerfarmer', farmerData);
  // }

 


  // registerSupplier(supplierData: Supplier): Observable<Supplier>{
  //   return this.http.post<Supplier>(this.baseUrl + '/register/registersupplier', supplierData);
  // }

  login(newcredentials: Credentials): Observable<Credentials>{
    this.newcredentials=newcredentials;
    return this.http.post<Credentials>(this.baseUrl + '/login/userlogin', newcredentials);
  }
  
}
