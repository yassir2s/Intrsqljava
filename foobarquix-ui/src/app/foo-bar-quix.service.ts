import { Result } from './model/result';
import { EventEmitter, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TestCase } from './model/test-case';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {

  private url = 'http://localhost:8080/foo-bar-quix/';
  TestCasesChanged = new EventEmitter<TestCase[]>();

  TestCases: TestCase[] = [];

  constructor(private httpClient: HttpClient) { }

  onConvertNumber(input: number){
    this.httpClient.get(this.url+input)
            .subscribe(

              (res: Result) => {
                this.TestCases.push(new TestCase(input,res.result));
                this.TestCasesChanged.emit(this.TestCases);
             },
                err => console.log(err),
             );
  }

  getTestCases(){
    return this.TestCases;
  }


}
