package dayone;
public class MinhaClasse {
    
    public static void main (String[] args) {
        String pNome = "Guilherme";
        String sNome = "Costa Bellentani";
        
        String nomeCompleto = nomeCompleto(pNome, sNome);

        System.out.print(nomeCompleto);
    }
    public static String nomeCompleto (String pNome, String sNome) {
        return "Nome Completo: " + pNome.concat(" ").concat(sNome);
    }

}
