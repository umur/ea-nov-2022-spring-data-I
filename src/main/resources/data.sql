INSERT INTO public.category (id, name)
VALUES (1, 'Apple');

INSERT INTO public.product (id, name, price, rating, category_id)
VALUES (1, 'Macbook Pro M1',  2499, 100, 1),
       (2, 'Macbook Air M2',  1499, 90, 1),
       (3, 'Macbook Air M1',  1299, 80, 1),
       (4, 'Macbook Pro 13 inch M2',  1799, 100, 1);

INSERT INTO public.address (id, city, street, zip)
VALUES (1, 'Fairfield', 'Main', '52556'),
       (2, 'Fairfield', '4th', '52557');

INSERT INTO public.user_info (id, email, first_name, lastname, password, address_id)
VALUES (1, 'abc@gmail.com', 'Ba Luan', 'Tran', '123', 1),
       (2, 'qwe@gmail.com', 'Thomas', 'Tran', '123', 2);

UPDATE public.address SET user_id = 1 WHERE id = 1;
UPDATE public.address SET user_id = 2 WHERE id = 2;

INSERT INTO public.review (id, comment, product_id, user_id)
VALUES (1, 'Good product', 1, 1),
       (2, 'It''s expensive', 2, 1),
       (3, 'It''s less expensive than the latest model and more than fast enough for the things most people use a computer for—web browsing, working on documents, coding, and light photo and video editing', 3, 1),
       (4, 'It''s Good laptop', 4, 2),
       (5, 'It''s exciting', 1, 2),
       (6, 'It''s good computer', 2, 2),
       (7, 'It''s perfect', 3, 2),
       (8, 'I''m very like it', 4, 2);
