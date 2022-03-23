import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemListComponent } from './components/item-list/item-list.component';
import { ItemDetailsComponent } from './components/item-details/item-details.component';
import { AddItemComponent } from './components/add-item/add-item.component';

const routes: Routes = [

  { path: '', redirectTo: 'item', pathMatch: 'full' },
  { path: 'item', component: ItemListComponent },
  { path: 'item/:id', component: ItemDetailsComponent },
  { path: 'item/add', component: AddItemComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
