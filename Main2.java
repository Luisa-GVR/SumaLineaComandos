public class Main2 {
    public static void main(String[] args) {
        boolean existe = false;
        int valor1 = 0, valor2 = 0;
        for (int i = 1; i < args.length; i++) {
            for (int j = 1; j < args.length; j++) {
                if (i!=j) {
                    if ((Integer.parseInt(args[i]) + Integer.parseInt(args[j])) == Integer.parseInt(args[0])) {
                        valor1 = Integer.parseInt(args[i]);
                        valor2 = Integer.parseInt(args[j]);
                        existe = true;
                        break;
                    }
                }
            }
            if (existe)
                break;
        }
        if (existe){
            System.out.println("Si existe, los valores son: " + valor1 + " y " + valor2);
        } else {
            System.out.println("no existe");
        }

    }
}
