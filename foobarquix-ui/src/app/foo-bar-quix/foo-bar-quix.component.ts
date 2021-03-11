import { TestCase } from './../model/test-case';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  testCases: TestCase[];
  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {
    this.testCases = this.fooBarQuixService.getTestCases();
    this.fooBarQuixService.TestCasesChanged.subscribe((testCases: TestCase[])=>{
      this.testCases = testCases;
    });
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.onConvertNumber(inputNumber);
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
