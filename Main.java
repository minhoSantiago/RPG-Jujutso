package Jujutso;

public class Main {

    public static void main(String[] args) {

//Objeto 1
        Feiticeiros megumi = new Zenin();
        megumi.setName("Megumi");
        megumi.setSurname("Fugishiguro");
        megumi.setAge(17);
        megumi.setDomainExpansion("Jardim das Sombras Justapostas");
        megumi.setInnateTechnique("Invocação do Divino General Imoral da Espaada de Oito Cabos Mahoraga");
        megumi.useTechnique();


//Objeto 2
        Feiticeiros yuji = new Kamo();
        yuji.setName("Yuji");
        yuji.setSurname("Itadori");
        yuji.setAge(18);
        yuji.setDomainExpansion("Dominio sobre a Cidade Natal");
        yuji.useTechnique();


//Objeto 3
        Feiticeiros yuta = new Feiticeiros();
        yuta.setName("Yuta");
        yuta.setSurname("Okkotsu");
        yuta.setAge(21);
        yuta.setDomainExpansion("Vazio Ilimitado");
        yuta.setInnateTechnique("Cópia de Tecnica Inata");
        yuta.useTechnique();

//Objeto 4
        Feiticeiros nobara = new Kugisaki();
        nobara.setName("Nobara");
        nobara.setSurname("Kugisaki");
        nobara.setAge(21);
        nobara.setDomainExpansion("");
        nobara.setInnateTechnique("Boneco de Palha");
        nobara.useTechnique();

    }
}