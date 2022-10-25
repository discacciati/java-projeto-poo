public class Piloto{
    public String name ;
    public Integer age ;
    public Sex sex ;
    public String team ;

    public Piloto(String name, Integer age, Sex sex, String team){
        this.name = name;
        this.age = age ;
        this.sex = sex ;
        this.team = team;
    }

    public String getName(){
        return name;
    }

    public void setName( String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge( Integer age){
        this.age = age;
    }

    public Sex getSex(){
        return sex;
    }

    public void setSex( Sex sex){
        this.sex = sex;
    }

    public String getTeam(){
        return team;
    }

    public void setTeam( String team){
        this.team = team;
    }

    @Override
    public String toString(){
        return "Piloto{" +
                " name=" + name +
                ", age=" + age +
                ", sex=" + sex +
                ", team=" + team +
                '}';

    }
}
