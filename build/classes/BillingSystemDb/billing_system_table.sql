
-- Drop table

-- DROP TABLE hotel.meal;

CREATE TABLE hotel.meal (
    mealid setial NOT NULL,
	mealname varchar(250) NULL,
	price int4 NULL,
	mealtypeid int4 NULL
);

-- Drop table

-- DROP TABLE hotel.mealtype;

CREATE TABLE hotel.mealtype (
	mealtypeid serial NOT NULL,
	mealtypename varchar(255) NULL
);

-- Drop table

-- DROP TABLE hotel.person;

CREATE TABLE hotel.person (
	personid serial NOT NULL,
	firstname varchar(30) NULL,
	surname varchar(30) NULL,
	address varchar(250) NULL,
	postcode varchar(30) NULL,
	mobile varchar(30) NULL,
	email varchar(250) NULL,
	nationality varchar(30) NULL,
	birthdate date NULL,
	idtype varchar(30) NULL,
	gender bpchar(1) NULL,
	checkin date NULL,
	checkout date NULL,
	roomid int4 NULL
);

-- Drop table

-- DROP TABLE hotel.room;

CREATE TABLE hotel.room (
	roomid serial NOT NULL,
	roomname varchar(30) NULL,
	numberofbed int2 NULL,
	roomprice int4 NULL
);


-- Drop table

-- DROP TABLE hotel.personmeal;

CREATE TABLE hotel.personmeal (
	personid int4 NULL,
	mealid int4 NULL
);

INSERT INTO hotel.mealtype (mealtypename) VALUES('Main');
INSERT INTO hotel.mealtype (mealtypename) VALUES('Dessert');
INSERT INTO hotel.mealtype (mealtypename) VALUES('Soup');

INSERT INTO hotel.room (roomname, numberofbed, roomprice) VALUES('Big room', 3, 500);
INSERT INTO hotel.room (roomname, numberofbed, roomprice) VALUES('Medium room', 2, 300);
INSERT INTO hotel.room (roomname, numberofbed, roomprice) VALUES('Small room', 1, 200);

INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Salmon and feta crepes', 14, 1);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Salmon salad with garlic dressing', 20, 1);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Salmon and turkey toastie', 21, 1);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Salmon tart with garlic sauce', 16, 1);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Slow-Cooked Parsnip & Pear Quail', 18, 2);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Infused Sweet n Sour Turkey', 13, 1);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Seared Mint & Berry Crab', 24, 1);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Tenderized Fennel & Orange Snapper', 13, 3);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Blanched Asparagus Tortilla', 15, 1);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Brined Raspberry & Peanut Lasagna', 16, 2);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Honey and Blueberry Bombe', 15, 2);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Milk Chocolate and Gooseberry Steamed Pudding', 10, 2);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Kiwi Pie', 17, 2);
INSERT INTO hotel.meal (mealname, price, mealtypeid) VALUES('Gooseberry Fudge', 11, 2);


