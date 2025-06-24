CREATE DATABASE tharindu;
USE tharindu;

CREATE USER 'tharindupy'@'localhost' IDENTIFIED BY 'tharindu';
GRANT ALL PRIVILEGES ON tharindu.* TO 'tharindupy'@'localhost';
FLUSH PRIVILEGES;

CREATE TABLE auth (
  `user` varchar(10) NOT NULL,
  `pass` varchar(45) NOT NULL,
  PRIMARY KEY (`user`)
);

CREATE TABLE Books (
    BookID INT AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(100) NOT NULL,
    Author VARCHAR(100) NOT NULL,
    Category VARCHAR(25) NOT NULL
);

CREATE TABLE Members (
    MemberID INT AUTO_INCREMENT PRIMARY KEY,
    FullName VARCHAR(100) NOT NULL,
    Email VARCHAR(100) UNIQUE,
    Phone VARCHAR(15),
    Address TEXT,
    JoinDate DATE DEFAULT (CURRENT_DATE)
);

CREATE TABLE BorrowedBooks (
    BorrowID INT AUTO_INCREMENT PRIMARY KEY,
    MemberID INT,
    BookID INT,
    BorrowDate DATE DEFAULT (CURRENT_DATE),
    ReturnDate DATE,
    FOREIGN KEY (MemberID) REFERENCES Members(MemberID) ON DELETE CASCADE,
    FOREIGN KEY (BookID) REFERENCES Books(BookID) ON DELETE CASCADE
);

CREATE TABLE Fines (
    FineID INT AUTO_INCREMENT PRIMARY KEY,
    Reason VARCHAR(100) NOT NULL,
    BorrowID INT,
    FineAmount DECIMAL(10, 2) NOT NULL,
    DateIssued DATE DEFAULT (CURRENT_DATE),
    DatePaid DATE,
    FOREIGN KEY (BorrowID) REFERENCES BorrowedBooks(BorrowID) ON DELETE CASCADE
);

-- Insert Books
INSERT INTO Books (Title, Author, Category)
VALUES 
('Madol Doova', 'Martin Wickramasinghe', 'Sinhala Fiction'),
('Gamperaliya', 'Martin Wickramasinghe', 'Historical Fiction'),
('Viragaya', 'Martin Wickramasinghe', 'Philosophical Fiction'),
('The Road from Elephant Pass', 'Nihal De Silva', 'War Fiction');

-- Insert Members
INSERT INTO Members (FullName, Email, Phone, Address)
VALUES 
('Tharindu Perera', 'tharindu.perera@example.lk', '0771234567', '12 Temple Road, Nugegoda'),
('Nirosha Fernando', 'nirosha.fernando@example.lk', '0712345678', '45 Galle Road, Colombo 03'),
('Kamal De Silva', 'kamal.desilva@example.lk', '0759876543', '78 Lake Drive, Kandy'),
('Sanduni Jayasuriya', 'sanduni.jayasuriya@example.lk', '0761122334', '101 Main Street, Matara');

-- Insert BorrowedBooks
INSERT INTO BorrowedBooks (MemberID, BookID)
VALUES 
(1, 1),  -- Tharindu Perera borrows 'Madol Doova'
(2, 3),  -- Nirosha Fernando borrows 'Viragaya'
(3, 2),  -- Kamal De Silva borrows 'Gamperaliya'
(4, 4);  -- Sanduni Jayasuriya borrows 'The Road from Elephant Pass'

-- Insert Fines
INSERT INTO Fines (Reason, BorrowID, FineAmount)
VALUES 
('Late Return', 1, 250.00),  -- Fine for Tharindu Perera
('Damaged Cover', 2, 150.00);  -- Fine for Nirosha Fernando

-- Insert into auth
INSERT INTO auth VALUES ('Admin','tharindu');
