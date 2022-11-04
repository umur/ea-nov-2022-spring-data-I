INSERT INTO category (name) VALUES ('Electronics'), ('Fashion'), ('Food');

INSERT INTO product(name, price, rating, id_category) VALUES ('Iphone 14 Pro Max', 1200, 5, 1), ('Columbia Fur Jacket', 200, 4, 2), ('Parle G Hide & Seek', 3, 4, 3);

INSERT INTO address (street, zip, city) VALUES ('1000 N. 4th. St.', 52557, 'Fairfield'),('2000 N. 4th. St.', 52558, 'Darling LakeCity');

INSERT INTO users (email, password, first_name, last_name, id_address) VALUES ('john@doe.com', '123', 'John', 'Doe', 1), ('von@doe.com', '321', 'Von', 'Doe', 2);

INSERT INTO review(comment, id_user, id_product) VALUES ('The camera is amazing', 1, 1),('It is warm and windproof', 2, 2)