
package trabalhodepoo;
import java.util.ArrayList;

public class Imoveis {
    private int codigo;
    private ArrayList<Conta> contas;
    
    public Imoveis(int codigo){
        this.codigo=codigo;
        this.contas = new ArrayList<>();
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void adicionarConta(Conta conta){
        if (contas.size() == 12){
        contas.remove(0);
    }
        contas.add(conta);
    }
    
    public double calcularValorMedio(){
        if (contas.isEmpty()){
            return 0;
        }
        double soma = 0;
        for (Conta c : contas){
            soma+=c.calculoTarifa();
        }
        return soma/contas.size();
    }
    
    public Conta contaMaisCara(){
        if(contas.isEmpty()){
            return null;
        }
        Conta maisCara = contas.get(0);
        for (Conta c : contas){
            if (c.maisCara(maisCara)){
                maisCara= c;
            }
        }
        return maisCara;
    }
    
    public void relatorioContasAcimaDaMedia (){
        double media = calcularValorMedio();
        System.out.println("Contas acima da média (R$ " + media + ") - Imóvel "+ codigo);
        for (Conta c: contas){
            if (c.calculoTarifa()>media){
                System.out.println(c.resumo());
            }
        }
    }
    
    public void relatorioAnual(){
        System.out.println("Resumo Anucla - Imovel "+ codigo);
        
        for (Conta c:contas){
            System.out.println(c.resumo());
        }
    }
}

