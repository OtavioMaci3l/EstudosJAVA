package estudandojava.maratonajava.javacore.Bintroducaometodos.dominio;

public class People {
    private String name;
    private int age;

    public void imprime(){
        System.out.println(this.name); //o this. faz o "mesmo" que o getName já que ambos está retornado o valor da variavel
        System.out.println(getAge()); //logo tem como fazer isso, mas não faça isso é inútilmente feio
    }


    //set para setar a variavel dentro do objeto de forma mais coesa e menos aclopamento
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){ //dessa forma usando o set mantemos uma alta coesão e um baixo aclopamento
        if (age < 0){
            System.out.println("idade invalida");
            age=0;
            return;
        }
        this.age = age;
    }

    //get para pegar o valor da variavel dentro do objeto de forma mais coesa e menos aclopamento
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
