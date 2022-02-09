import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FarmerComponent } from './components/farmer/farmer.component';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from "./components/registration/registration.component";
import { SupplierComponent } from './components/supplier/supplier.component';

const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'registration-component',component:RegistrationComponent},
  {path:'farmer-component',component:FarmerComponent},
  {path:'supplier-component',component:SupplierComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


