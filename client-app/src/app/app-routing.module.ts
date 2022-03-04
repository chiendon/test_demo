import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PageComponent } from './page/page.component';
import { HomeComponent } from './home/home.component';
import { AddComponent } from './add/add.component';


const routes: Routes = [
  {
    path: '',
    component: PageComponent,
    children: [
      {
        path: 'Home',
        component: HomeComponent
      },
      {
        path: 'Add',
        component: AddComponent
      },
    ]

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
