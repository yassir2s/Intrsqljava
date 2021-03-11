import { Component, EventEmitter, OnInit, Output } from '@angular/core';

import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {

  @Output() submitNumberOutput = new EventEmitter<number>();

  numberInput;

  constructor() {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.numberInput);
    this.numberInput = "";
  }

}
