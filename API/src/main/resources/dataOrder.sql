INSERT INTO customers (name, email,phone) VALUES ('Ahmet', 'ahmet@gmail.com','05553334444');
INSERT INTO customers (name, email,phone) VALUES ('Mehmet', 'Mehmet@gmail.com','05553334411'); 	
INSERT INTO customers (name, email,phone) VALUES ('Kadir Yaşar', 'kyasar@gmail.com','05553334412');
INSERT INTO customers (name, email,phone) VALUES ('Kemal Kurt', 'kemal@gmail.com','05553334413');
INSERT INTO customers (name, email,phone) VALUES ('Aslan pay', 'aslan@gmail.com','05553334414');
INSERT INTO customers (name, email,phone) VALUES ('Ayşe Keser', 'ayse@gmail.com','05553334415');
INSERT INTO customers (name, email,phone) VALUES ('Selvi Göz', 'selvi@gmail.com','05553334416');
INSERT INTO customers (name, email,phone) VALUES ('Can Sever', 'can@gmail.com','05553334417');

INSERT INTO orders (time, status, customer_id) VALUES ('2022-05-27T23:30:00Z', 1, 1);
INSERT INTO orders (time, status, customer_id) VALUES ('2022-04-22T19:30:00Z', 1, 1);
INSERT INTO orders (time, status, customer_id) VALUES ('2022-06-20T08:30:00Z', 1, 6);
INSERT INTO orders (time, status, customer_id) VALUES ('2022-04-21T17:30:00Z', 1, 5);
INSERT INTO orders (time, status, customer_id) VALUES ('2022-04-29T14:30:00Z', 1, 2);

INSERT INTO products (name, price) VALUES ('Samsung S100"', 3000);
INSERT INTO products (name, price) VALUES ('Samsung S101', 5000);
INSERT INTO products (name, price) VALUES ('Samsung S102', 7000);
INSERT INTO products (name, price) VALUES ('Samsung S103', 9000);
INSERT INTO products (name, price) VALUES ('Samsung S104', 11000);
INSERT INTO products (name, price) VALUES ('Samsung S105', 12000);

INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (1, 3000, 1, 1);
INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (2, 11000, 5, 1);
INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (1, 5000, 2, 2);
INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (1, 9000, 4, 2);
INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (5, 12000, 6, 3);
INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (2, 11000, 5, 3);
INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (1, 7000, 3, 4);
INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (1, 3000, 1, 4);
INSERT INTO orders_item (quantity, price, product_id, order_id) VALUES (33, 12000, 6, 5);