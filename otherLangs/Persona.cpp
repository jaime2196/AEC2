

Persona::Persona(int id, const std::string& nombre, const std::string& apellido, const std::string& sexo)
    : id(id), nombre(nombre), apellido(apellido), sexo(sexo) {}

int Persona::getID() const {
    return id;
}

void Persona::setID(int id) {
    this->id = id;
}

std::string Persona::getNombre() const {
    return nombre;
}

void Persona::setNombre(const std::string& nombre) {
    this->nombre = nombre;
}

std::string Persona::getApellido() const {
    return apellido;
}

void Persona::setApellido(const std::string& apellido) {
    this->apellido = apellido;
}

std::string Persona::getSexo() const {
    return sexo;
}

void Persona::setSexo(const std::string& sexo) {
    this->sexo = sexo;
}