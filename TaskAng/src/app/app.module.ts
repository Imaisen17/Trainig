import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TasksComponent } from './tasks/tasks.component';
import { AddTaskComponent } from './add-task/add-task.component';
import { DatailsTaskComponent } from './datails-task/datails-task.component';
import { EditTaskComponent } from './edit-task/edit-task.component';
import {AppRoutingModule} from './app.routing.module';
import {HttpClientModule} from '@angular/common/http';
import {TaskService} from '../service/task.service';

@NgModule({
  declarations: [
    AppComponent,
    TasksComponent,
    EditTaskComponent,
    AddTaskComponent,
    DatailsTaskComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [TaskService],
  bootstrap: [AppComponent]
})
export class AppModule { }
