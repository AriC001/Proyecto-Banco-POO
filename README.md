# Proyecto-Banco-POO
#### English:
# Bank manager application
## Introduction
For the Programming Paradigms assignment, I had to create a simulation of a day in a Bank, mostly managing clientes with their requirements and specifications. I had to make it Object Oriented, so Java was the chosen language.

### Description:
 This application has 40 clientes with their data, and their operation to be attended. It has specific types of employees, such as Manager, Administrative, Operations Manager and Cashier, each one has their job and the tasks they can attend. Each tasks has its time, so if an employee is busy it will not process another client operation. 
 The Bank will be open for 1 minute, and the different operations will vary between 10 to 15 seconds to be finish, in that time the employees will be busy, so they wont process another client operation. If the bank closes, no further clients will be attend 
 Clients that cannot be attend will make a waiting line, so every time and operation is complete, the line will try to get a  new client operation process.
 In total there are 5 Cashiers, 3 Operations Managers, 2 Administrative and 1 Manager all with a salary, name etc. 
 Cashiers and Operations Managers can be promoted, every time they complete an operation successfully they have 1 of 3 chances to get a point, if they accumulate 5 points the manager will promote them.
 At the end of the day, the bank has like a report (displayed in console) that will show all 40 clients with their data and if they were attended or not, every Loan that was given, the amount and what kind of loan was, and the bank reserve. It will also show all the employees with their data.


## Operations
A clients may have one of these operations:
 - Deposit: 
 - Transfer
 - Money Exchange
 - Ask for a Loan

#### Deposit:
Mainly Cashiers will process this operation, clientes can deposit AR$ (Argentinian Pesos) or USD (Dollars). If the amount to be deposit excedes 100.000 AR$ or 10.000 U$D, the Manager will need to process it. 

#### Transfer:
Similar as the Deposit but instead of adding to the clients balance, it will reduce it. Also if the amount excedes 100.000 AR$ or 10.000 U$D, the Manager will have to process it.

#### Money Exchange:
This Operation will be attend by Administrative and Operations Managers, clients will be able exchange, Pesos to Dollars and viceversa, all with their balance money, if it's enough. 

#### Loan: 
They are many different types of Loans, but it can be differentiated in 3 Categories:
- For PYMES: Max of 10 Million Pesos, with 2% monthly interest, to be paid on 36 months or less.
- Mortgage: Max of 50 Million Pesos, with 12.5% monthly interest, to be paid on 240 months or less.
- Others: Max of 2 Million Pesos, with 5% monthly interest, to be paid on 12 months or less.

These kinds of operations will be process by Administrative and Operations Managers, and the money will be deduce from the Bank reserve.
