Программа калькулятор, написаннай с использованием технологии Java EE, Jsp и БД PostgreSql.
Суть программы:
1. Вычисляем введенное значение;
2. Сохраняем вычисление в БД.
3. Выводим историю последних 10ти вычислений.

Скрипт для создания таблицы:

CREATE TABLE public.calculation_log
(
    param1 double precision,
    param2 double precision,
    operation "char",
    result double precision,
    creation_date timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    id bigint NOT NULL DEFAULT nextval('calculation_log_id_seq'::regclass),
    CONSTRAINT calculation_log_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.calculation_log
    OWNER to postgres;
