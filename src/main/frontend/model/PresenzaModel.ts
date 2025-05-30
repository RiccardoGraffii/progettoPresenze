import type Studente from './StudenteModel';

export default interface Presenza {
    id?: number;
    data?: string;  // LocalDate viene convertito in string
    presente?: boolean;
    studente?: Studente;
}