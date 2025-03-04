//CREATE TABLE Department (
//        dept_id INTEGER PRIMARY KEY AUTOINCREMENT,
//        dept_name TEXT NOT NULL UNIQUE
//);
//
//CREATE TABLE Employee (
//        emp_id INTEGER PRIMARY KEY AUTOINCREMENT,
//        emp_name TEXT NOT NULL,
//        age INTEGER NOT NULL CHECK (age > 18),
//salary REAL NOT NULL CHECK (salary > 0),
//dept_id INTEGER,
//CONSTRAINT fk_department FOREIGN KEY (dept_id) REFERENCES Department(dept_id) ON DELETE SET NULL
//);
//
//        -- Insert data into Department table
//INSERT INTO Department (dept_name) VALUES ('HR');
//INSERT INTO Department (dept_name) VALUES ('IT');
//
//        -- Insert data into Employee table
//INSERT INTO Employee (emp_name, age, salary, dept_id) VALUES ('John Doe', 30, 5000, 1);
//INSERT INTO Employee (emp_name, age, salary, dept_id) VALUES ('Jane Smith', 28, 7000, 2);
//
//        -- a) Retrieve all employees' details
//SELECT * FROM Employee;
//
//-- b) Filter employees based on department name
//SELECT * FROM Employee WHERE dept_id = (SELECT dept_id FROM Department WHERE dept_name = 'IT');
//
//        -- c) Rename columns in the result using AS
//SELECT emp_name AS "Employee Name", age AS "Employee Age", salary AS "Monthly Salary" FROM Employee;
//
//-- d) Calculate the total salary expenses of the company
//SELECT SUM(salary) AS "Total Salary Expense" FROM Employee;
//
//-- e) Join Employee and Department tables and retrieve selected columns
//SELECT Employee.emp_name AS "Employee Name", Employee.salary AS "Salary", Department.dept_name AS "Department"
//FROM Employee
//JOIN Department ON Employee.dept_id = Department.dept_id;
