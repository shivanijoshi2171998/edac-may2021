show databases;
use mysqlpl;
/*1.Write a program that computes the perimeter and the area of a rectangle. Define 
your own values for the length and width. (Assuming that L and W are the length 
and width of the rectangle, Perimeter = 2*(L+W) and Area = L*W.*/

use assignments;
CREATE table rectangle(
perimeter float,
area float
);
SELECT * FROM rectangle;

delimiter //
CREATE procedure rectangles()
begin
declare L float default 10.2;
declare W float default 11.65;
declare perimeter float;
declare area float;
SET perimeter = 2*(L+W);
SET area = L*W; 
INSERT INTO rectangle values (perimeter, area);
end;
//
/*delimiter ;*/
call rectangles();
SELECT * FROM rectangle;
DELETE FROM rectangle;
-- -------------------------------------------------------------------------------------------------------------

/*2.Write a program that declares an integer variable called num, assigns a value to it, 
and computes and inserts into the tempp table the value of the variable itself, its 
square, and its cube.*/

CREATE table tempp(
square float,
cuube float
);
-- drop table tempp;

delimiter //
create procedure SQcude(num float)
begin
declare square float;
declare cuube float;
SET square = num*num;
SET cuube = square*num;
INSERT INTO tempp values(square,cuube);
end; //
delimiter ;
DROP procedure SQcude;

CALL SQcude(5);
SELECT * FROM tempp;
DELETE FROM tempp;
-- -------------------------------------------------------------------------------------------------------------

/*3.Convert a temperature in Fahrenheit (F) to its equivalent in Celsius (C) and vice 
versa. The required formulae are:- C= (F-32)*5/9 
F= 9/5*C + 32*/

CREATE table temperature(
temp float,
unit varchar(10)
);
-- drop table temperature;
SELECT * FROM temperature;

delimiter //
CREATE procedure conversion( temp float, str varchar(10) )
begin
	declare C float;
    declare F float;
	if (str = 'Fahrenheit' or str = 'F')  then
		set C= (temp-32)*5/9;
        insert into temperature values(C,'Celsius');
	elseif (str = 'Celsius' or str = 'C') then
		set F= 9/5*temp + 32;
        insert into temperature values(F,'Fahrenheit');
	else 
		insert into temperature values(temp,'UNIT NOT VALID');
	end if;
end;//
delimiter ;

call conversion(102,'Fahrenheit');
call conversion(141,'Celsius');
call conversion(141,'RFT');
call conversion(141,'C');
SELECT * FROM temperature;
drop procedure conversion;
delete from temperature;
-- ------------------------------------------------------------------------------------------------------------

/*4.Convert a number of inches into yards, feet. For example, 124 inches 
equals 3 yards, 1 foot. */
CREATE table lengths(
yard int,
feet int,
inches int
); 
SELECT * FROM lengths;
DROP table lengths;

delimiter //
CREATE procedure calc(val int)
begin
     declare yard int;
     declare feet int;
	 declare inches int;
     declare temp int;
     declare temp1 int;
	
    
    /*
    SET yard = val/36;
	SET temp = mod(val,36);
    SET feet = temp/12;
    SET temp1 = mod(feet,12);
	*/
    INSERT into lengths values(yard, feet, temp1);
end; //
delimiter ;

DROP procedure calc;

CALL calc(124);
SELECT * FROM lengths;

-- inch/36 -- yard
-- inch/12 -- foot
-- -------------------------------------------------------------------------------------------------------------

/*5.Write a program that enables a user to input an integer. The program should then 
state whether the integer is evenly divisible by 5.*/
create table divisible
(
    x int,
    y char(100)
    
);
select * from divisible;
drop table divisible;

delimiter //
create procedure divisible5(num int)
begin
      if mod(num,5)=0 then
          insert into divisible values(num,'divisible by 5');
       else
          insert into divisible values(num,'not divisible by 5');
          end if;
end; //
delimiter ;
call divisible5(45);
drop procedure divisible5;
select * from divisible;
delete from divisible;

#SET SQL_SAFE_UPDATES = 0;          
-- ------------------------------------------------------------------------------------------------------------
/*6.Your block should read in two real numbers and tell whether the product of the two 
numbers is equal to or greater than 100.*/

create table realnum
(
  x float,
  y float,
  product float,
  z char(50)
);

select * from realnum;

delimiter //
create procedure productofreal(x float,y float)
begin 
declare prod float;
set prod =x*y;

if prod=100 then
  insert into realnum values(x,y,prod,'equal to 100');
 elseif prod >100 then
   insert into realnum values(x,y,prod,'greater than 100');
  end if;
end;//
delimiter ; 
call productofreal(10,21.35);
call productofreal(10.0,10.0);

select * from realnum;
drop procedure productofreal;
delete from realnum;

