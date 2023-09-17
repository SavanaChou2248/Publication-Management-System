# Publication-Management-System

# Overview
The Publication Management System is designed to manage various types of publications, including books, journals, and e-journals. It allows users to create, view, and delete publications, as well as print publication information to a file.

# Classes
Book:
- Book Publication
- Attributes: author, pages, bindingType
Journal:
- Journal publication
- Attributes: editor, issueNum
EJournal:
- Electronic journal publication
- Attributes: url, publciationFee
Publication:
- represents a generic publication
- Attributes: title, year, publisher, ISBN
Database:
- Provides methods for creating, viewing, and deleting publications.
- Allows printing publication information to a file.
- Includes a default user interface for interacting with the system.
MainPublication
- Contains the main method to run the Publication Management System.
- Creates an instance of the Database class and provides a user interface for managing publications.
