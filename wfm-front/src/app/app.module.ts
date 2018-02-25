import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { UserListComponent } from './components/user/user-list/user-list.component';
import { UserCreateComponent } from './components/user/user-create/user-create.component';
import { UserRoutingModule } from './components/user/user-routing.module';
import {HashLocationStrategy, LocationStrategy} from "@angular/common";


@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserCreateComponent
  ],
  imports: [
    BrowserModule,
    UserRoutingModule
  ],
  providers: [{ provide: LocationStrategy, useClass: HashLocationStrategy }],
  bootstrap: [AppComponent]
})
export class AppModule { }
