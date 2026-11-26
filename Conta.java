
package trabalhodepoo;

public class Conta {
    private String mesReferencia;
    private double valorMesAnterior;
    private double valorMesAtual;
    
    public Conta (String mesReferencia, double valorMesAnterior, double valorMesAtual){
        if (valorMesAtual < valorMesAnterior){
            throw new IllegalArgumentException ("O valor da conta do mês anterior não pode ser inferior ao valor da conta do mês atual!");
        }
        this.mesReferencia = mesReferencia;
        this.valorMesAnterior = valorMesAnterior;
        this.valorMesAtual = valorMesAtual;
    }
    
    public String getMesReferencia(){
        return mesReferencia;
    }
    
    public double getValorMesAnterior (){
        return valorMesAnterior;
    }
    
    public double getValorMesAtual(){
        return valorMesAtual;
    }
    
    public double consumo(){
        return valorMesAtual - valorMesAnterior;
    }
    
    public double calculoTarifa(){
        double tarifa = 0.92;
        double valorConsumo = tarifa*consumo();
        
        if(consumo() < 90){
            return valorConsumo;
        }
        
        double iluminacaoPublica = valorConsumo * 0.025;
        double subtotal = valorConsumo + iluminacaoPublica;
        double icms = subtotal * 0.22;
        return icms + subtotal;
    }
    
    public boolean maisCara (Conta outra){
        if (this.calculoTarifa()>outra.calculoTarifa()) {
            return true;
        } else {
            return false;
        }
    }
    
    public String resumo(){
        return "Mês: "+ mesReferencia + " Consumo: "+consumo()+" Valor total: " + calculoTarifa();
    }
}
