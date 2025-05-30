
import {PresenzaControl} from 'Frontend/endpoint/PresenzaControl';



import Classe from 'Frontend/model/ClasseModel';
import Presenza from "Frontend/model/PresenzaModel";
import Professore from "Frontend/model/ProfessoreModel";
import Studente from "Frontend/model/ProfessoreModel"


class PresenceService {

    // Auto CRUD per classi
    async getAllClasses(): Promise<Classe[]> {
        return ClasseControl.list();
    }

    // Auto CRUD per studenti
    async getStudentsByClass(classId: number): Promise<Studente[]> {
        return PresenzaControl.getStudentiByClasse(classId);
    }

    // Metodo custom per presenze
    async getPresences(classId: number, date: Date): Promise<Presenza[]> {
        return PresenzaControl.getPresenzeByClasseAndDate(classId, date);
    }

    // Salvataggio presenze
    async savePresences(date: Date, presences: Presenza[]): Promise<void> {
        await PresenzaControl.savePresenzeForDate(date, presences);
    }

    // CRUD standard
    async updateStudent(student: Studente): Promise<Studente> {
        return StudenteControl.update(student);
    }
}

export const presenceService = new PresenceService();