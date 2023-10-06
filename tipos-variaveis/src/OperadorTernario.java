public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        // if = ? 
        // else = :

        System.out.println(resultado);

        String nomeUm = "Matheus";
        String nomeDois = new String("Matheus");

        System.out.println(nomeUm.equals(nomeDois));
    }
}
