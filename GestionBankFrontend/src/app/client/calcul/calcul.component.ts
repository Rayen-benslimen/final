import { Component, OnInit } from '@angular/core';
import { LocalDataSource } from 'ng2-smart-table';
import { AuthenticationService } from '../../services/authentication.service';
import { FicheService } from '../../services/fiche.service';

@Component({
  selector: 'app-calcul',
  templateUrl: './calcul.component.html',
  styleUrls: ['./calcul.component.css']
})
export class CalculComponent implements OnInit {
  public num;

  public listcalcul = [];

  public listcalculadmin = [];



  constructor(private authservice : AuthenticationService , private calculserv : FicheService ) { }

  ngOnInit(): void {
    this.getcalcul(this.authservice.currentUserValue['userid'])
    this.getcalculadmin()
  }


  getcalcul(userid : number) {
    this.num = userid;
    this.calculserv.getcalcul(userid).subscribe(
      (data : any[]) => {
        this.listcalcul = data ;
        console.log(this.listcalcul)
        console.log(userid)

      },
      error => console.log('on fetch calcul', error)
    );
  }
  getcalculadmin()
  {
    this.calculserv.getcalculs().subscribe(
      (data : any[]) => {
        this.listcalculadmin = data ;
        console.log(this.listcalculadmin)
      },
      error => console.log('on fetch calcul', error)
    );
  }
}
