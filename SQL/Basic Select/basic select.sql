/* Revising the Select Query I */
select * from city where population > "100000";

/* Revising the select Query II */
select name from city where population > 120000 and countrycode = "USA";

/* Select All */
select * from city;

/* Select By ID */
select * from city where id = "1661";

/* Japanese Cities' Attributes */
select * from city where countrycode = "JPN";

/* Japanese Cities' Names */
select name from city where countrycode = "JPN";

/* Weather Observation Station 1 */
select city,state from station;

/* Weather Observation Station 3 */
select DISTINCT city from station where (id % 2 == 0)

/* Weather Observation Station 4 */
select count(city) - count(distinct city) from station;

/* Weather Observation Station 5 */
select city,char_length(city) from station order by char_length(city),city asc limit 1;
select city,char_length(city) from station order by char_length(city) desc,city asc limit 1;

/* Weather Observation Station 6 */
select distinct city from station where city RLIKE '^[aeiouAEIOU]';

/* Weather Observation Station 7 */
select distinct city from station where city RLIKE '[aeiouAEIOU]$';

/* Weather Observation Station 8 */
select distinct city from station where city RLIKE '^[aeiouAEIOU]' and city RLIKE '[aeiouAEIOU]$';

/* Weather Observation Station 9 */
select distinct city from station where city RLIKE '^[^aeiouAEIOU]';

/* Weather Observation Station 10 */
select distinct city from station where city RLIKE '[^aeiouAEIOU]$';

/* Weather Observation Station 11 */
select distinct city from station where city RLIKE '^[^aeiouAEIOU]' or city RLIKE '[^aeiouAEIOU]$';

/* Weather Observation Station 12 */
select distinct city from station where city RLIKE '^[^aeiouAEIOU]' and city RLIKE '[^aeiouAEIOU]$';

/* Higher Than 75 Marks */
select name from students where Marks > 75 order by RIGHT(name, 3) ASC,id asc;

/* Employee Names */
select name from employee order by name asc;

/* Employee Salaries */
select name from employee where salary > 2000 and months < 10;