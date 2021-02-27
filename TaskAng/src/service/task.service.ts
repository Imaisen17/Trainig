import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Task} from 'protractor/built/taskScheduler';


@Injectable()
export class TaskService{
  urlTasks: string = 'http://localhost:8080/tasks';
  constructor(private http: HttpClient) {
  }
  getAllTasks() {
    return this.http.get<Task[]>(this.urlTasks);
  }

   getOneById(id: number){
   return  this.http.get<Task>(this.urlTasks + '/' + id);
  }

  saveTask(task: Task){
   return  this.http.post(this.urlTasks, task);
  }

  updateTask(task: Task){
    return this.http.put(this.urlTasks, task);
  }
  deleteTask(id: number){
    return this.http.delete(this.urlTasks + '/' + id);
  }
}
