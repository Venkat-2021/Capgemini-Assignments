import { Component, OnInit } from '@angular/core';

export interface PeriodicElement {
  name: string;
  position: number;
  address: string;
  time: number;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'RestoWorld', address: 'Nagaram', time: 20},
  {position: 2, name: 'New Look restaurent', address: 'autonager', time: 15},
  {position: 3, name: 'Tasty Foods', address: 'colony', time: 25},
  {position: 4, name: 'Yummy Foods', address: 'autonager', time: 30},
 
];

@Component({
  selector: 'app-restaurent',
  templateUrl: './restaurent.component.html',
  styleUrls: ['./restaurent.component.css']
})
export class RestaurentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  displayedColumns: string[] = ['position', 'name', 'address', 'time'];
  dataSource = ELEMENT_DATA;
}
