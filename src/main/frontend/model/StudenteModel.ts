import type Classe from './ClasseModel';
import type Presenza from './PresenzaModel';

export default interface Studente {
    id?: number;
    nome?: string;
    cognome?: string;
    classe?: Classe;
    presenze?: Presenza[];
}