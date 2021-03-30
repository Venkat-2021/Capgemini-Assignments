import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { AuthGuard } from './auth.guard';
import { MenuComponent } from './menu/menu.component';
import { RestaurentComponent } from './restaurent/restaurent.component';
import { UserComponent } from './user/user.component';


const routes: Routes = [
  {
    component: AdminComponent,
    path: 'admin'
  },
  
  {
    component: MenuComponent,
    path: 'menu',
    canActivate: [AuthGuard]
  },

  {
    component: RestaurentComponent,
    path: 'restaurent',
    canActivate: [AuthGuard]
  },

  {
    component: UserComponent,
    path: 'user'
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes),],
  exports: [RouterModule]
})
export class AppRoutingModule { }
