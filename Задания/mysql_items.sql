CREATE TABLE Item
(
   ITEM_ID INT NOT NULL AUTO_INCREMENT,
   Title VARCHAR(40),
   Artist VARCHAR(40),
   ReleaseDate DATE,
   ListPrice DECIMAL(5,2),
   Price DECIMAL(5,2),
   Version DECIMAL(5),
   PRIMARY KEY(ITEM_ID)
);

INSERT INTO Item VALUES (1, 'Diva', 'Annie Lennox', date '1992-01-04', 17.97, 13.99,1);
INSERT INTO Item VALUES (2, 'Trouble is...', 'Kenny Wayne Shepherd Band',date  '1997-08-08', 17.97, 14.99,1);
INSERT INTO Item VALUES (3, 'Lie to Me', 'Jonny Lang',date  '1997-08-26', 17.97, 14.99,1);
INSERT INTO Item VALUES (4, 'Little Earthquakes', 'Tori Amos',date  '1992-01-18', 17.97, 14.99,1);
INSERT INTO Item VALUES (5, 'Seal', 'Seal',date  '1991-08-18', 17.97, 14.99,1);
INSERT INTO Item VALUES (6, 'Ian Moore', 'Ian Moore',date  '1993-12-05', 9.97, 9.97,1);
INSERT INTO Item VALUES (7, 'So Much for the Afterglow', 'Everclear',date  '1997-01-19', 16.97, 13.99,1);
INSERT INTO Item VALUES (8, 'Surfacing', 'Sarah McLachlan',date  '1997-12-04', 17.97, 13.99,1);
INSERT INTO Item VALUES (9, 'Hysteria', 'Def Leppard',date  '1987-06-20', 17.97, 14.99,1);
INSERT INTO Item VALUES (10, 'A Life of Saturdays', 'Dexter Freebish',date  '2000-12-06', 16.97, 12.99,1);
INSERT INTO Item VALUES (11, 'Human Clay', 'Creed',date  '1999-10-21', 18.97, 13.28,1);
INSERT INTO Item VALUES (12, 'My, I''m Large', 'Bobs',date  '1987-02-20', 11.97, 11.97,1);
INSERT INTO Item VALUES (13, 'So', 'Peter Gabriel',date  '1986-10-03', 17.97, 13.99,1);
INSERT INTO Item VALUES (14, 'Big Ones', 'Aerosmith',date  '1994-05-08', 18.97, 14.99,1);
INSERT INTO Item VALUES (15, '90125', 'Yes',date  '1983-10-16', 11.97, 11.97,1);
INSERT INTO Item VALUES (16, '1984', 'Van Halen',date  '1984-08-19', 11.97, 11.97,1);
INSERT INTO Item VALUES (17, 'Escape', 'Journey',date  '1981-02-25', 11.97, 11.97,1);
INSERT INTO Item VALUES (18, 'Greatest Hits', 'Jay and the Americans',date  '1966-12-05', 13.99, 9.97,1);
INSERT INTO Item VALUES (19, 'Ray of Light', 'Madonna',date  '2000-12-15', 14.99, 10.97,1);
INSERT INTO Item VALUES (20, 'Music', 'Madonna',date  '2002-02-27', 14.99, 11.97,1);
INSERT INTO Item VALUES (21, 'Dream of the Blue Turtles', 'Sting', date '1985-02-05', 17.97, 14.99,1);
