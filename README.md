**Question:**
Given a list of employee records, each containing an ID, name, salary, and department, how can we remove duplicate entries based on the combination of salary and department? The goal is to retain only the
first occurrence of each unique combination of salary and department, ensuring that records with the same salary and department are treated as duplicates.

**Explanation:**
The code uses a Map to keep track of unique combinations of salary and department.
It iterates through the list of employees, creating a key based on salary and department for each employee.
If a key is already present in the map, indicating a duplicate combination, the current record is removed.
The map is used to ensure that only the first encountered record with a specific combination of salary and department is retained.
The resulting list contains only unique records based on salary and department, keeping the one with the lowest ID in case of duplicates.
