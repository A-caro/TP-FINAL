-------------------------------------------------------TP_JAVACOACH------------------------------------------------------------------------
 create table Conceptos(
 id_concepto int auto_increment,
 nombre_concepto varchar(50),
 numero_concepto int (10),
 contenido_concepto longtext,
 primary key(id_concepto)
 );

CREATE table  Preguntas (
    id_pregunta int PRIMARY KEY,
    contenido_pregunta varchar(255),
    id_concepto int,
    FOREIGN KEY (id_concepto) references conceptos(id_concepto)
);


CREATE TABLE Respuestas (
    id_respuesta int primary key,
    contenido_respuestas varchar(255),
    id_pregunta int,
    es_correcta boolean,
    foreign key(id_pregunta) references Preguntas(id_pregunta)
);

CREATE TABLE Ejemplos (
    id_ejemplos int PRIMARY KEY,
    contenido_ejemplo varchar(255),
    descripcion_ejemplo varchar(255),
    id_concepto int,
    FOREIGN key (id_concepto) REFERENCES Conceptos(id_concepto)
);

select * from Conceptos

insert into Conceptos
(nombre_concepto,
numero_concepto,
contenido_concepto)
values ('Declaracion e inicialización de variables', 1,  'Una variable es un nombre para una pieza de memoria que almacena
datos.Una variable se declara indicando el tipo de dato 
junto con un nombre, luego de esto le asignamos un valor para finalmente inicializarla.');
 
insert into Conceptos 
(nombre_concepto,
numero_concepto,
contenido_concepto)
values ('Identificadores', 2,  'Los identificadores nombran variables, funciones, clases y objetos; cualquier cosa que el programador necesite identificar o usar.');


insert into Preguntas(id_pregunta, contenido_pregunta, id_concepto)
	values (1,'¿Que es una variable y cómo se declara?',4),
	(2,'¿Cuales son las caracteristicas de un identificador?',5);

insert into Respuestas(id_respuesta, contenido_respuestas, id_pregunta, es_correcta)
values (1,'Una variable es un nombre para una pieza de memoria que almacena
datos.Una variable se declara indicando el tipo de dato junto con un nombre,
 luego de esto le asignamos un valor para finalmente inicializarla.',1, true),
(2,' No pueden empezar por un dígito.No pueden contener ninguno de los caracteres especiales vistos en una entrada anterior. 
No puede ser una palabra reservada de Java. Las palabras reservadas en Java son todas las que aparecen en el punto siguiente.',2,true);


INSERT INTO ejemplos(id_ejemplos, descripcion_ejemplo,contenido_ejemplo, id_concepto) 
	VALUES (1,'Declaracion e inicializacion de variables','zooName = "The Best Zoo";
           numberAnimals = 100;',4),
	(2,'Identificadores','edad, nombre, precio, año_nacimiento',5); 








