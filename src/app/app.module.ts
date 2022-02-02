import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OrdersComponent } from './orders/orders.component';
import { SupplierComponent } from './supplier/supplier.component';
import { ItemComponent } from './item/item.component';
import { FarmerComponent } from './farmer/farmer.component';
import { CredentialComponent } from './credential/credential.component';

@NgModule({
  declarations: [
    AppComponent,
    OrdersComponent,
    SupplierComponent,
    ItemComponent,
    FarmerComponent,
    CredentialComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
