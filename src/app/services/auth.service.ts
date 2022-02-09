import { Injectable } from '@angular/core';
import { UserType } from '../models/userType';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() { }
  Usertype : UserType= UserType.SUPPLIER;

  storeCredentialsDetails(userData: string){
    sessionStorage.setItem('userData', userData);
  }
  
  retrieveUserDetails(){
    return sessionStorage.getItem('userData');
  }

  removeUserDetails(){
    sessionStorage.removeItem('userData');
  }
  
  setUsertype(usertype :UserType){
    sessionStorage.setItem('Usertype',JSON.stringify(usertype));
  }
  
  getUsertype (){
    return sessionStorage.getItem('Usertype');
  }
  
  removeUsertype(){
    sessionStorage.removeItem('Usertype');
  }
}
