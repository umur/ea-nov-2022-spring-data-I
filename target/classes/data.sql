INSERT INTO public.category (name)
VALUES ('Tech'),('Fashion'),('Tools');

INSERT INTO public.product (name, price, rating, catgory_id)
VALUES ('HP',  500, 3, 1),
       ('Mac',  1500, 4, 1),
       ('TShirt',  20, 5, 2),
       ('Screw Driver',  10, 2, 3);

INSERT INTO public.address (city, street, zip)
VALUES ('Fairfield', '4th', '52557');

INSERT INTO public.users (email, first_name, last_name, password, address_id)
VALUES ('bara@gmail.com', 'bara', 'batta', '1122', 1),
       ('batta@gmail.com', 'john', 'cina', '1122', 1);

INSERT INTO public.review (comment, product_id, user_id)
VALUES ('fine', 1, 1),
       ('too expensive', 2, 1),
       ('doing the job', 3, 1);
