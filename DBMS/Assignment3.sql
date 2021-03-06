show databases;
use database1;

#1.Display all the Supplier names with the initial letter capital
select concat(upper(substring(sname,1,1)),lower(substring(sname,2))) from s;

#2.Display all the Supplier names in upper case.
select upper(sname) from s;

#3.Display all the Supplier names in lower case.
select lower(sname) from s;

#4.Display all the Supplier names padded to 25 charactters, with spaces on the left.
select lpad(sname,25,'*') from s;

#5.Display all the Supplier names (with ‘la’ replaced by ‘ro’). HINT: REPLACE.
 select replace(sname,'sh','vh') from s;
 
 #6.Implement the above command such that ‘l’ is replaced with ‘r’ and ‘a’ is replaced with ‘o’.
 select replace(replace(sname,'s','r'),'a','o') from s;
 
 #7.Display the Supplier names and the lengths of the names.
 select sname,length(sname) from s;
 
 #8.Use the soundex function to search for a supplier by the name of ‘BLOKE’.
 select * from s where soundex(sname)=soundex('sheevani');
 
 #9.Display the Supplier name and the status (as Ten, Twenty, Thirty, etc.).
 