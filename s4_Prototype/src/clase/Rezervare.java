package clase;

public class Rezervare extends ARezervare{
    @Override
    public void descriere() {
        System.out.println("Aceasta este o rezervare");

    }


    @Override
    public ARezervare copiaza(){
        Rezervare rezervareNoua= new Rezervare();
    }
}
