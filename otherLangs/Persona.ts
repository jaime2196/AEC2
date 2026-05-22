/**
 * Datos básicos de una persona, de momento usada por la clase Visitante y EmpleadoEvento 
 */
export class Persona {
    private _id: number;
    private _nombre: string;
    private _apellido: string;
    private _sexo: string;

    constructor(id: number, nombre: string, apellido: string, sexo: string) {
        this._id = id;
        this._nombre = nombre;
        this._apellido = apellido;
        this._sexo = sexo;
    }

    public get id(): number {
        return this._id;
    }

    public set id(value: number) {
        this._id = value;
    }

    public get nombre(): string {
        return this._nombre;
    }

    public set nombre(value: string) {
        this._nombre = value;
    }

    public get apellido(): string {
        return this._apellido;
    }

    public set apellido(value: string) {
        this._apellido = value;
    }

    public get sexo(): string {
        return this._sexo;
    }

    public set sexo(value: string) {
        this._sexo = value;
    }
}