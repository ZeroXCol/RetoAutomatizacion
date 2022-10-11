#language: es
  @tag
  Característica: Modulo Reunión
    Como gestor de unidades de negocio
    Quiero ingresar al modulo reunion
    Para agendar una reunion a una unidad de negocio

  @tag1
  Escenario: Validar la agenda de reuniones para una unidad de negocio
    Dado Ingreso exitosamente al aplicativo
    Y Me dirijo al modulo Reunion para seleccionar la opcion reuniones
    Cuando Diligencio todo el formulario de Reunion
    Entonces Guardo la nueva reunion