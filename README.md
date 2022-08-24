# RCB-parsing

**Pre-requisite**

**OVERVIEW**
======================
The team "RCB (Royal Challengers Bangalore)" has submitted its team for an upcoming match. The details of the team are as described in the json at the end of this document.

**PROBLEM TO SOLVE**:
======================

1. Write a test that validates that the team has only 4 foreign players

2. Write a test that validates that there is at least one wicket keeper


**Json PAYLOAD**:
==================

https://gist.github.com/kumarpani/1e759f27ae302be92ad51ec09955e765


**Step by step instructions to execute the assignment**: -
========================================================

1.	Open eclipse IDE.
2.	Create maven folder structure.
3.	Add dependency of rest assured, selenium, TestNG, hamcrest, Jackson core
4.	Create test class in SRC /test/ Java folder.
5.	Create @BeforeMethod & copy- pasted the Jason body from the assignment and convert Jason format into the string.
6.	Convert string format into the Jason by using the Jason parsing.
7.	Create two test cases, one is for validates that the team has only 4 foreign players.
8.	Create another test case for validates that there is at least one wicket keeper.
9.	Run the program






