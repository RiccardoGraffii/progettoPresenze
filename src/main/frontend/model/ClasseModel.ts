import type Studente from './StudenteModel';

export default interface Classe {
    id?: number;
    nome?: string;
    professore?: any;  // Tipo generico se non definito esplicitamente
    studenti?: Studente[];
}