import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DatailsTaskComponent } from './datails-task.component';

describe('DatailsTaskComponent', () => {
  let component: DatailsTaskComponent;
  let fixture: ComponentFixture<DatailsTaskComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DatailsTaskComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DatailsTaskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
