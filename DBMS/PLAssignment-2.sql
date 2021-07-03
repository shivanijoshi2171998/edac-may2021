use mysqlpl;

/*1.Select from any table a number and determine whether it is within a given range (for 
example, between 1 and 10). */

create table givenrange
(
   x int,
   y char(40)
);
select * from givenrange;

delimiter //
create procedure findrange(x int)
begin
    if (x>1 && x<10) then
      insert into givenrange values(x,'between 1 and 10');
    
    else
      insert into givenrange values(x,'not within range');
      
    end if;  
end; //
delimiter ;

call findrange(5);
call findrange(14);
select * from givenrange;
drop procedure findrange;
delete from givenrange;

-- ------------------------------------------------------------------------------------------------------------
/*2.Select from any table three positive integers representing the sides of a triangle, and 
determine whether they form a valid triangle. Hint: In a triangle, the sum of any two 
sides must always be greater than the third side.*/ 

create table triangle
(
    x int,
    y int,
    z int,
    statuss char(40)
);
select * from triangle;
drop table triangle;

delimiter //
create procedure sumgreater(x int,y int,z int)
begin
  #declare sum float;
  #set sum=x+y||y+z||x+y;
  
  if ((x+y)>z) and ((y+z)>x) and ((x+z)>y) then
      insert into triangle values(x,y,z,'valid triangle');
   else
      insert into triangle values(x,y,z,'Not valid triangle ');
    end if;
 end;//
 delimiter ;
 
 call sumgreater(10,40,20);
 select * from triangle;
 drop procedure sumgreater;
 
 -- -----------------------------------------------------------------------------------------------------------
 
/* 3.Check if a given a year is a leap year. The condition is:- year should be (divisible by 4 
and not divisible by 100) or (divisible by 4 and divisible by 400.). The year should be 
Selected from some table. */

create table yearsTable
(
   sno int,
   years int
);
insert into yearsTable values(1,1996);
insert into yearsTable values(2,2000);
insert into yearsTable values(3,2015);

select * from yearsTable;

create table yearResult     -- for storing the result
(
   years int,
   status char(40)
);
select * from yearResult;

delimiter //
create procedure Leapyear()
begin
  declare y int;
  select years into y from yearsTable where sno=2;
  
   if ((mod(y,4)=0 and mod(y,100)!=0) || (mod(y,4)=0 and mod(y,100)=0)) then
       insert into yearResult values(y,'leap year');
   else
      insert into yearResult values(y,'Not leap year');
      end if;
  end;//
  delimiter ;
  call Leapyear();
  select * from yearResult;
  drop procedure Leapyear;
  
 -- ------------------------------------------------------------------------------------------------------------
/*4. Write a program that Selects from any table two character strings. Your program should 
then determine if one character string exists inside another character string.*/

create table strchar
(
   str1 varchar(20),
   str2 varchar(20)
);
insert into strchar values('shivani','shiva');
select * from strchar;

create table strResult
(
   str varchar(20),
   statuss varchar(20)
);

delimiter //
create procedure InString()
begin 
     declare x varchar(20);
     declare y varchar(20);
     declare statuss int;
       select str1,str2 into x,y from strchar;
          if instr(x,y)>0 then
             insert into strResult values(str,'present');
          end if;
  end;//
  delimiter ;
  call InString();
  select * from strResult;
  drop procedure InString;
  select * from strchar;

