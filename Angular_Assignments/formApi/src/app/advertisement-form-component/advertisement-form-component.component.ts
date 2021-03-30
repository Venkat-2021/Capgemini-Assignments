import { Component, OnInit } from '@angular/core';
import { Advertisement } from '../advertisement';

export interface PeriodicElement {
   title: string,
   name: string,
   category: string,
   description: string
}

@Component({
  selector: 'app-advertisement-form-component',
  templateUrl: './advertisement-form-component.component.html',
  styleUrls: ['./advertisement-form-component.component.css']
})
export class AdvertisementFormComponentComponent implements OnInit {

  categories = ['Furniture','Hardware','Mobile']

  AdvDetails = new Advertisement('','',this.categories[0],'');
  //AdvDetails : PeriodicElement [] = [{title:'',name:'',category:'',description:''}]
  

  submitted = false;  

  List: any [] = [this.AdvDetails]

  constructor() { }

  ngOnInit(): void {
    
  }
  
  onSubmit(){
    this.submitted = true;
    this.AdvDetails =new Advertisement('','',this.categories[0],'');
    this.List.push(this.AdvDetails)
    this.List
    console.log(this.List);
  }


}
