--
--  application_user
--

CREATE TABLE public.application_user (
  id       INTEGER PRIMARY KEY,
  username CHARACTER VARYING,
  password CHARACTER VARYING,
  is_admin BOOLEAN
);

-- make a sequence
DROP SEQUENCE public.application_user_id_seq;

-- create the sequence
CREATE SEQUENCE public.application_user_id_seq
INCREMENT BY 100
MINVALUE 1
MAXVALUE 928398324798324
START 1
CACHE 100;

--
--  game
--

CREATE TABLE public.book (
  book_id INTEGER PRIMARY KEY ,
  title CHARACTER VARYING,
  author CHARACTER VARYING,
  publish_date DATE,
  book_price DOUBLE,
  genre CHARACTER VARYING,
  isbn INTEGER
);

-- make a sequence
DROP SEQUENCE public.book_id_seq;

-- create the sequence
CREATE SEQUENCE public.book_id_seq
INCREMENT BY 100
MINVALUE 1
MAXVALUE 928398324798324
START 1
CACHE 100;

