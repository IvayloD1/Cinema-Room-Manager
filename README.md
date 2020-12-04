# Cinema Room Manager
### JetBrains Academy
### Java project: Cinema Room Manager

Instructions:
Create an application that helps to manage a cinema theatre: sell tickets, check available seats, see sales statistics, showing the current income, total income, the number of available seats, and the percentage of occupancy.

Objectives:
 Your menu should look like this:
 
1. Show the seats

2. Buy a ticket

3. Statistics

0. Exit

 Show the seats  should print the current seating arrangement. The empty seats should be marked with an S symbol, and taken seats are marked with a B symbol.
 Buy a ticket  should read the seat coordinates from the input and print the ticket price. After that, the chosen seat should be marked with a B when the item  Show the seats      is called.
 Exit  should stop the program.


When the item Statistics is chosen, your program should print the following information:

    • The number of purchased tickets;
    
    • The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
    
    • Current income;
    
    • Total income that shows how much money the theatre will get if all the tickets are sold.
    
The  item Buy a ticket shouldn't allow a user to buy a ticket that has already been purchased.

If a user chooses an already taken seat, print "That ticket has already been purchased" and ask them to enter different seat coordinates until they pick an available seat. Of course, you shouldn't allow coordinates that are out of bounds. If this happens, print "Wrong input!" and ask to enter different seat coordinates until the user picks an available seat.

The ticket price is determined by the rules:
    • If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.
    • In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. Please note that the number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the rest 5 rows.

Examples

The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.


Enter the number of rows:

> 6

Enter the number of seats in each row:

> 6

1. Show the seats

2. Buy a ticket

3. Statistics

0. Exit

> 3

Number of purchased tickets: 0

Percentage: 0.00%

Current income: $0

Total income: $360

1. Show the seats

2. Buy a ticket

3. Statistics

0. Exit

> 2

Enter a row number:

> 1

Enter a seat number in that row:

> 1

Ticket price: $10

1. Show the seats

2. Buy a ticket

3. Statistics

0. Exit

> 3

Number of purchased tickets: 1

Percentage: 2.78%

Current income: $10

Total income: $360

1. Show the seats

2. Buy a ticket

3. Statistics

0. Exit

> 2

Enter a row number:

> 1

Enter a seat number in that row:

> 1

That ticket has already been purchased!

Enter a row number:

> 10

Enter a seat number in that row:

> 20

Wrong input!

Enter a row number:

> 4

Enter a seat number in that row:

> 4

Ticket price: $10

1. Show the seats

2. Buy a ticket

3. Statistics

0. Exit

> 1

Cinema:

  1 2 3 4 5 6
  
1 B S S S S S

2 S S S S S S

3 S S S S S S

4 S S S B S S

5 S S S S S S

6 S S S S S S

1. Show the seats

2. Buy a ticket

3. Statistics

0. Exit

> 3

Number of purchased tickets: 2

Percentage: 5.56%

Current income: $20

Total income: $360

1. Show the seats

2. Buy a ticket

3. Statistics

0. Exit

> 0
