import { Component, OnInit } from '@angular/core';
import { ItemService } from 'src/app/services/item.service';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  items: any;
  currentItem = null;
  currentIndex = -1;
  folderId = '1';
  constructor(private itemService: ItemService) { }
  ngOnInit(): void {
    this.findByFolderId();
  }

  refreshList(): void {
    this.findByFolderId();
    this.currentItem = null;
    this.currentIndex = -1;
  }
  setActiveItem(item, index): void {
    this.currentItem = item;
    this.currentIndex = index;
  }

  findByFolderId(): void {
    this.itemService.findByFolderId(this.folderId)
      .subscribe(
        data => {
          this.items = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
}
