show databases;
use database1;

#1.Display the minimum Status in the Supplier table. 
select min(status) from s;
 
#2. Display the maximum Weight in the Parts table.
select max(weight) from p;

#3.Display the average Weight of the Parts.
select avg(weight) from p; 

#4.Display the total Quantity sold for part ‘P1’.
 select * from spj;
 select sum(Qty) from spj where pno='p1';
 insert into spj values('s4','p4','j4',800);
insert into spj values('s1','p1','j1',900),('s2','p2','j3',925),('s3','p3','j3',850);

#SET SQL_SAFE_UPDATES = 0;
#alter table p drop column soldQTY;

#5.Display the total Quantity sold for each part.
select pno,sum(Qty) as TOTAL from spj group by pno;

#6.Display the average Quantity sold for each part. 
select pno,avg(Qty) as TOTAL from spj group by pno;

#7.Display the maximum Quantity sold for each part, provided the maximum Quantity is greater than 800. 
select pno,greatest(800,sum(Qty)) from spj where qty>800 group by pno;

#8.Display the Status and the count of Suppliers with that Status.
select status,count(*) from s group by status;

#9.Display the count of Projects going on in different cities.
 select city,count(*) from j group by city; 
 
#10.What is the difference between COUNT(Status) and COUNT(*)?
       #COUNT(status) it does not contain null value
       #COUNT(*) it contains null value
 select count(status) from s;
 select count(*) from s;


#11.Display the Status and the Count of Suppliers with that Status in the following format as shown below:- 
 /*Status Count 
Ten 1 
Twenty 2 
Thirty 3*/
select status, count(sname) from s group by status;
select 
case
when status=10 then 'Ten'
when status=20 then 'Twenty'
when status=30 then 'Thirty'
else 'Others'
end 'status', count(sname) as 'count'
from s group by status;
