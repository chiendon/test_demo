import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams, HttpErrorResponse  } from '@angular/common/http';
import {from} from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  productList: any;
  result: any;

  public httpOptions = {
    headers: new HttpHeaders(
      {
        // 'Authorization': this.getAccessToken(),
        'Content-Type': 'application/json; charset=utf-8',
        'Access-Control-Allow-Origin': '*'
      }
    )
  };
  // headers: new Headers
  //   (
  //     // 'Authorization': this.getAccessToken(),
  //     'Content-Type': 'application/json; charset=utf-8',
  //     // 'Access-Control-Allow-Origin': '*'
  // );
  
  constructor(private http: HttpClient) {

    // this.http.get('http://localhost:8080/api/user', this.httpOptions).subscribe((res) => this.productList = res);

    // headers.append('Access-Control-Allow-Origin', '*');
    // this.http.get('http://localhost:8080/api/user', option new {this.httpOptions}).subscribe((res) => this.productList = res);
    // this.http.get('http://localhost:8080/api/user', this.httpOptions).subscribe(res => {
    //   this.productList = res;
    // }, error => {
    //   console.log(error.message);
    // });

   this.productList = from( // wrap the fetch in a from if you need an rxjs Observable
      fetch(
        'http://localhost:8080/api/user',
        {
          // body: JSON.stringify(data)
          headers: {
            'Content-Type': 'application/json',
          },
          method: 'GET',
          mode: 'no-cors'
        }
      )
    );
  }

  ngOnInit(): void {
  }

}
