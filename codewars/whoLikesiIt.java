public class whoLikesiIt {

    public static String solution(String... names) {
        /**Aquí estamos utilizando un tipo de argumento llamado varargs(Que se van a pasar cierta cantidad de argumentos de tipo String)
        Internamente todos los argumentos que se pasen serán tratados como una sola unidad (Array)
        En resumidas cuentas, convierte al varargs en un array */

        int cant = names.length;
        //Por la anterior razón es que podemos usar el método .lenght

        if (cant == 0) {
            return "no one likes this";
        } else if (cant == 1) {
            return names[0] + " likes this";
        } else if (cant == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (cant == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (cant - 2) + " others like this";
        }
    }
  }