import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FooBarQuixFormComponent } from './foo-bar-quix-form/foo-bar-quix-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FooBarQuixComponent } from './foo-bar-quix/foo-bar-quix.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { FrontEndInstructionComponent } from './front-end-instruction/front-end-instruction.component';
import { BackEndInstructionComponent } from './back-end-instruction/back-end-instruction.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    FooBarQuixFormComponent,
    FooBarQuixComponent,
    HomeComponent,
    NavBarComponent,
    FrontEndInstructionComponent,
    BackEndInstructionComponent
  ],
  imports: [
    BrowserModule, ReactiveFormsModule, HttpClientModule,FormsModule,
    RouterModule.forRoot([
      { path: '', redirectTo: 'home', pathMatch: 'full' },
      { path: 'home', component: HomeComponent },
      { path: 'FooBarQuix', component: FooBarQuixComponent }
    ])
  ],
  providers: [
    { provide: 'SERVER_URL', useValue: 'http://localhost:8080' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
