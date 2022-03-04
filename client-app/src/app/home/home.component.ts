import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams, HttpErrorResponse  } from '@angular/common/http';
import {from, of} from 'rxjs';
import { switchMap, catchError } from 'rxjs/operators';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  productList: any;
  result: any;
  smartphone :any;

  public httpOptions = {
    headers: new HttpHeaders(
      {
        // 'Authorization': this.getAccessToken(),
        'Content-Type': 'application/json; charset=utf-8',
        'Access-Control-Allow-Origin': '*'
      }
    )
  };
  
  constructor(private http: HttpClient) {
    this.http.get('http://localhost:8080/api/work').subscribe(res => {
      this.productList = res;
    }, error => {
      console.log(error.message);
    });
  }
  // constructor(private http: HttpClient) {

    
  
  //   this.httpOptions = {
  //     headers: new HttpHeaders(
  //       {
  //         // 'Authorization': this.getAccessToken(),
  //         'Content-Type': 'application/json',
  //         'Access-Control-Allow-Origin': '*'
  //       }
  //     )
  //   };
  //   this.http.get('http://localhost:8080/api/user', this.httpOptions).subscribe(data => {
  //     for (const d of (data as any)) {
  //       this.smartphone.push({
  //         name: d.name,
  //         price: d.price
  //       });
  //     }
  //     console.log(this.smartphone);
  //   });
  //   const observable = from( // wrap the fetch in a from if you need an rxjs Observable
  //     fetch(
  //       'http://localhost:8080/api/user',
  //       {
  //         // body: JSON.stringify(data)
  //         headers: {
  //           'Content-Type': 'application/json',
  //         },
  //         method: 'GET',
  //         mode: 'no-cors',
  //       }
  //     )
  //   )
  //   // console.log(this.productList);
  // }

  ngOnInit(): void {
  }

}
