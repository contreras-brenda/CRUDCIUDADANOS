-- Database: db_crud

-- DROP DATABASE IF EXISTS db_crud;

CREATE DATABASE db_crud
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.UTF-8'
    LC_CTYPE = 'en_US.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
    
    
    
    
    
-- Table: public.ciudadanos

-- DROP TABLE IF EXISTS public.ciudadanos;

CREATE TABLE IF NOT EXISTS public.ciudadanos
(
    id_ciudadano integer NOT NULL,
    apellido_materno character varying(50) COLLATE pg_catalog."default" NOT NULL,
    apellido_paterno character varying(50) COLLATE pg_catalog."default" NOT NULL,
    "fecha_nacimiento:" date NOT NULL,
    nombre character varying(50) COLLATE pg_catalog."default" NOT NULL,
    version bigint,
    CONSTRAINT ciudadanos_pkey PRIMARY KEY (id_ciudadano)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.ciudadanos
    OWNER to postgres;
    
    
    
    
    
 -- Table: public.domicilio

-- DROP TABLE IF EXISTS public.domicilio;

CREATE TABLE IF NOT EXISTS public.domicilio
(
    id_domicilio integer NOT NULL DEFAULT nextval('domicilio_id_domicilio_seq'::regclass),
    calle character varying(50) COLLATE pg_catalog."default" NOT NULL,
    colonia character varying(50) COLLATE pg_catalog."default" NOT NULL,
    numero integer NOT NULL,
    tipo_domicilio character varying(20) COLLATE pg_catalog."default" NOT NULL,
    version bigint,
    id_ciudadano integer,
    CONSTRAINT domicilio_pkey PRIMARY KEY (id_domicilio),
    CONSTRAINT fkq8o7lfk6rp0x5n2c9wjjxyhyd FOREIGN KEY (id_ciudadano)
        REFERENCES public.ciudadanos (id_ciudadano) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.domicilio
    OWNER to postgres;   
    
    
    
    
    
-- Inserts: public.ciudadanos    
 
INSERT INTO public.ciudadanos(
	id_ciudadano, apellido_materno, apellido_paterno, "fecha_nacimiento:", nombre, version)
	VALUES (6,'Casas','Torres','1977-03-17','Tamara',1),
	       (5,'Rodríguez','Ugalde','2000-01-09','Francisco',1),
	       (4,'Ayala','Trejo','1978-09-07','Rafael',1),
	       (3,'Sosa','Chávez','1964-09-03','Frida',1),
	       (2,'Ramirez','Cardenas','1996-08-02','Cristina',1),
	       (1,'Díaz','Toro','1980-01-01','Roberto',1),
	       (7,'Zapata','Ríos','1985-04-08','Isabel',1);
	       
	       
	       
	       
	          
 -- Inserts Table: public.domicilio
INSERT INTO public.domicilio(
	id_domicilio, calle, colonia, numero, tipo_domicilio, version, id_ciudadano)
	VALUES (1,'Las Rosas','Las Flores',123,'Real',1,1),
	       (2,'Bernal','Ezequiel',345,'Legal',1,1),
	       (3,'Privada Monte Albán','Valle Alameda',234,'Fiscal',1,7),
	       (4,'5 de mayo','Centro',105,'Legal',1,7),
	       (5,'Sol','La estrella',65,'Convencional',1,7),
	       (6,'Campanario de la Piedad','El Campanario',896,'Real',1,7);
