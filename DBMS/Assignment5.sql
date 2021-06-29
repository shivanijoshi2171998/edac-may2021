show databases;
use database1;
#1.Display the Supplier name and the Quantity sold.
select * from spj;
select * from s;
select sname,Qty from s,spj where s.sno=spj.sno;

#2.Display the Part name and Quantity sold.  
select pname,Qty from p,spj where p.pno=spj.pno;

#3.Display the Project name and Quantity sold.
select jname,Qty from j,spj where j.jno=spj.jno;

#4.Display the Supplier name, Part name, Project name and Quantity sold.
select sname,pname,jname, Qty from s,p,j,spj where s.sno=spj.sno and p.pno=spj.pno and j.jno=spj.jno;

#5.Display the Supplier name, Supplying Parts to a Project in the same City. 
select sname,pname ,jname,s.scity from s,p,j group by scity;

#6.Display the Part name that is ‘Red’ is color, and the Quantity sold.
select pname, qty from p,spj where color='Red' and p.pno=spj.pno;

#7.Display all the Quantity sold by Suppliers with the Status = 20.
select sname,qty from s,spj where status=20 and s.sno=spj.sno;

#8.Display all the Parts and Quantity with a Weight > 14.
select pname,qty ,weight from p,spj where spj.pno=p.pno and weight >14;

#9.Display all the Project names and City, which has bought more than 500 Parts. 
select jname,qty,city from j,spj where qty>500 and j.jno=spj.jno;

#10.Display all the Part names and Quantity sold that have a Weight less than 15.
select pname,qty,weight from p,spj where weight<15 and p.pno=spj.pno;
select * from p;




