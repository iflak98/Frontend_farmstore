import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OrdersComponent } from './components/orders/orders.component';
import { SupplierComponent } from './components/supplier/supplier.component';
import { ItemComponent } from './components/item/item.component';
import { FarmerComponent } from './components/farmer/farmer.component';
import { CredentialComponent } from './components/credential/credential.component';

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
