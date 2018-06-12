#1
select p.tipodoc, p.documento, p.nombre, p.apellido, a.legajo
from alumno a
inner join persona p
on a.idpersona = p.identificador;

#2
select a.legajo, p.nombre, p.apellido, c.nombre, ic.fechainscripcion
from persona p
inner join alumno a
on p.identificador=a.idpersona
inner join inscripciones_carrera ic
on a.identificador=ic.idalumno
inner join carrera c
on ic.idcarrera=c.identificador
order by a.legajo desc;

#3
select ca.nombre, cu.nombre, count(ic.fechainscripcion) cant_inscriptos, cu.cupomaximo
from carrera ca
inner join curso cu
on ca.identificador=cu.idcarrera
left join inscripciones_curso ic
on cu.identificador=ic.idcurso
group by ca.nombre, cu.nombre, cu.cupomaximo;

#4
select ca.nombre, cu.nombre, count(ic.fechainscripcion) cant_inscriptos, cu.cupomaximo
from carrera ca
inner join curso cu
on ca.identificador=cu.idcarrera
left join inscripciones_curso ic
on cu.identificador=ic.idcurso
group by ca.nombre, cu.nombre, cu.cupomaximo
having count(ic.fechainscripcion) > cu.cupomaximo;

#5
update curso 
set cupomaximo = 10
where anio = 2018 and cupomaximo < 5;

#6
select c.idcarrera, c.identificador curso, c.nombre, ica.fechainscripcion insc_carrera, icu.fechainscripcion insc_curso
from curso c
inner join inscripciones_curso icu
on c.identificador = icu.idcurso
inner join inscripciones_carrera ica
on c.idcarrera = ica.idcarrera
where icu.fechainscripcion < ica.fechainscripcion;

select c.idcarrera, c.identificador curso, c.nombre, ica.fechainscripcion insc_carrera, icu.fechainscripcion insc_curso
from curso c
inner join inscripciones_curso icu
on c.identificador = icu.idcurso
inner join inscripciones_carrera ica
on c.idcarrera = ica.idcarrera
where icu.fechainscripcion < ica.fechainscripcion;

#7
start transaction;

select max(identificador) into @ult_pers
from persona;

select max(identificador) into @ult_alumn
from alumno;

insert into persona
values (@ult_pers+1,'DNI',39249660,'Andrés', 'Malvestiti', '19960216');

insert into alumno
values (@ult_alumn+1, @ult_pers+1, 41946);

commit;

#8
#Este cambio en la estructura, agregando la direccion, se debe efetuar en la tabla persona
ALTER TABLE `tecso`.`persona` 
ADD COLUMN `direccion` VARCHAR(200) NULL AFTER `fechanac`;
	
