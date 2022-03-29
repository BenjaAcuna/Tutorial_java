public abstract class Animal {
    
    private String nombre;

    public Animal(){}

        public void comer(){
            System.out.println("El" +nombre+ "esta comiendo.");
        }

        public abstract void moverse();

        public void setNombre(String s){
            nombre = s;
        }

        public String getNombre(){
            return nombre;
        }

    }



