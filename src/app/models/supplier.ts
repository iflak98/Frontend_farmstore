import { Orders } from "./orders";

export class Supplier {

    supplierId:number = 0;
    supplierName:string = '';
    supplierMobile:string = '';
    supplierLocation:string = '';
    orders:Array<Orders> = [];
    credential:Credential = new Credential();

    constructor() {}

}
