class Persona:
    """
    Datos básicos de una persona, de momento usada por la clase Visitante y EmpleadoEvento
    """
    def __init__(self, id_persona: int, nombre: string, apellido: string, sexo: string):
        self.__id = id_persona
        self.__nombre = nombre
        self.__apellido = apellido
        self.__sexo = sexo

    @property
    def id(self) -> int:
        return self.__id

    @id.setter
    def id(self, value: int):
        self.__id = value

    @property
    def nombre(self) -> string:
        return self.__nombre

    @nombre.setter
    def nombre(self, value: string):
        self.__nombre = value

    @property
    def apellido(self) -> string:
        return self.__apellido

    @apellido.setter
    def apellido(self, value: string):
        self.__apellido = value

    @property
    def sexo(self) -> string:
        return self.__sexo

    @sexo.setter
    def sexo(self, value: string):
        self.__sexo = value