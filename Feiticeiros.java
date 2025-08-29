package Jujutso;
  public class Feiticeiros {
    private int age;
    private String name;
    private String surname;
    private String domainExpansion;
    private String innateTechnique;


    public void setAge(int age) {
      this.age = age;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setSurname(String surname) {
      this.surname = surname;
    }

    public void setDomainExpansion(String domainExpansion) {
      this.domainExpansion = domainExpansion;
    }

    public void setInnateTechnique(String innateTechnique) {
      this.innateTechnique = innateTechnique;
    }

    public void useTechnique() {
      System.out.println("Meu nome é " + getName() + " " + getSurname() + ". EXPANSÃO DE DOMINIO " + getDomainExpansion() + "!");
    }

    public String getName() {
      return name;
    };

    public String getSurname() {
      return surname;
    };

    public int getAge() {
      return age;
    };

    protected String getInnateTecnic() {
      return innateTechnique;
    };

    public String getDomainExpansion() {
      return domainExpansion;
    };

  }

