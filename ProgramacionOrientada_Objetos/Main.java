public class Main{

    public static void main(String[] args){

        Materia a;
        Materia b;
        a = new Materia();
        b = new Materia();
        Materia c = new Materia();
        a.setNombre("Fisica");
        a.setProfesor("Jose");
        b.setNombre("Ingles");
        b.setProfesor("Isadora");

        System.out.println("Nombre de materia a: "+a.getNombre());
        System.out.println("Nombre de materia b: "+b.getNombre());
        System.out.println("Nombre de materia c: "+c.getNombre());



    }


}