package ex17;

public class Main {
    public static void main(String[] args) {

        // Participantes Pessoa Física
        Participante obiwan = new ParticipantePessoaFisica("ObiWan Kenobi", "(11)1111-1111", "111");
        Participante yoda = new ParticipantePessoaFisica("Mestre Yoda", "(11)1111-1111", "222");
        Participante vader = new ParticipantePessoaFisica("Darth Vader", "(11)1111-1111", "333");
        Participante leia = new ParticipantePessoaFisica("Léia Organa", "(11)1111-1111", "444");
        Participante sidius = new ParticipantePessoaFisica("Lorde Sidius", "(11)1111-1111", "555");

        // Participantes Pessoa Jurídica
        Participante cruzVermelha = new ParticipantePessoaJuridica("Cruz Vermelha", "(11)1111-1111", "1111");
        Participante oxfam = new ParticipantePessoaJuridica("Oxfam International", "(11)1111-1111", "2222");
        Participante cervejaria = new ParticipantePessoaJuridica("Cervejaria Rio Claro", "(11)1111-1111", "3333");
        Participante gurgel = new ParticipantePessoaJuridica("Automóveis Gurgel", "(11)1111-1111", "4444");
        Participante genco = new ParticipantePessoaJuridica("Genco Azeites", "(11)1111-1111", "5555");

        // Compromissos
        Compromisso c1 = new Compromisso("2022-04-10T12:00:00", TipoCompromisso.PAGAMENTO, "CPFL",
                "Pagar conta de luz");
        c1.adicionarParticipante(obiwan);
        c1.adicionarParticipante(leia);
        c1.adicionarParticipante(genco);
        c1.adicionarParticipante(yoda);
        Compromisso c2 = new Compromisso("2022-04-10T09:00:00", TipoCompromisso.PAGAMENTO, "CPFL",
                "Pagar conta de luz");
        c2.adicionarParticipante(cruzVermelha);
        Compromisso c3 = new Compromisso("2022-04-10T14:00:00", TipoCompromisso.REUNIÃO, "WORKSHOP",
                "Neuropatias");
        c3.adicionarParticipante(sidius);
        Compromisso c4 = new Compromisso("2022-04-10T11:00:00", TipoCompromisso.ENTREGA_PROJETO, "HP",
                "Projeto MapinFish");
        c4.adicionarParticipante(cervejaria);
        c4.adicionarParticipante(sidius);
        Compromisso c5 = new Compromisso("2022-04-10T05:00:00", TipoCompromisso.PAGAMENTO, "DAAE",
                "Pagar conta de água");
        c5.adicionarParticipante(yoda);
        c5.adicionarParticipante(yoda);
        c5.adicionarParticipante(cruzVermelha);

        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(c1);
        agenda.adicionarCompromisso(c2);
        agenda.adicionarCompromisso(c3);
        agenda.adicionarCompromisso(c4);
        agenda.adicionarCompromisso(c5);

//        agenda.imprimirTodaAgenda();
//        agenda.listarCompromissoPorData("2022-04-10T12:00:00");

        agenda.listarCompromissoPorParticipante(yoda);

    }
}
