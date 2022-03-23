import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
const baseUrl = 'http://192.168.0.7:8080/items';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(baseUrl);
  }
  get(id): Observable<any> {
    return this.http.get(`${baseUrl}/${id}`);
  }
  create(data): Observable<any> {
    return this.http.post(baseUrl, data);
  }
  update(id, data): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }
  delete(id): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  findByFolderId(folderId): Observable<any> {
    return this.http.get(`${baseUrl}/${folderId}`);
  }
}
