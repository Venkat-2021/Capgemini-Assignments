import { Component, OnInit } from '@angular/core';

export interface PeriodicElement {
  name: string;
  position: number;
  quantity: number;
  price: number;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Chicken Tikka', quantity: 1, price: 200},
  {position: 2, name: 'Stufed pannerbread', quantity: 4, price: 250},
  {position: 3, name: 'Meal', quantity: 1, price: 300},
  {position: 4, name: 'Pizza small', quantity: 1, price: 350},
  {position: 5, name: 'Cheese Pizza', quantity: 1, price: 400},
  {position: 6, name: 'Veg Tikka', quantity: 2, price: 150},
  {position: 7, name: 'Sandwich', quantity: 1, price: 100},
  {position: 8, name: 'Mojito', quantity: 1, price: 100},
  {position: 9, name: 'Rich Dryfruit shake', quantity: 1, price: 150},
  {position: 10, name: 'Finger Chips', quantity: 1, price: 50},
];

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  displayedColumns: string[] = ['position', 'name', 'quantity', 'price'];
  dataSource = ELEMENT_DATA;

}
