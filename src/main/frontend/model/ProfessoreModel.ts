import type Classe from './ClasseModel';

export default interface Professore {
    id?: number;
    username?: string;
    password?: string;
    classi?: Classe[];
}