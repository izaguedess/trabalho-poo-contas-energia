
package trabalhodepoo;

public class App {

    public static void main(String[] args) {
        Imoveis imovel = new Imoveis(101);
        
        Conta c1 = new Conta ("Janeiro", 1000, 1150);
        Conta c2 = new Conta ("Fevereiro", 1150, 1230);
        Conta c3 = new Conta ("Março", 1230, 1400);
        Conta c4 = new Conta ("Abril", 1400, 1520);
        Conta c5 = new Conta ("Maio", 1520, 1590);
        Conta c6 = new Conta ("Junho", 1590, 1700);
        Conta c7 = new Conta ("Julho", 1700, 1860);
        Conta c8 = new Conta ("Agosto", 1860, 2060);
        Conta c9 = new Conta ("Setembro", 2060, 2170);
        Conta c10 = new Conta ("Outubro", 2170, 2290);
        Conta c11 = new Conta ("Novembro", 2290, 2370);
        Conta c12 = new Conta ("Dezembro", 2370, 2560);
        
        imovel.adicionarConta(c1);
        imovel.adicionarConta(c2);
        imovel.adicionarConta(c3);
        imovel.adicionarConta(c4);
        imovel.adicionarConta(c5);
        imovel.adicionarConta(c6);
        imovel.adicionarConta(c7);
        imovel.adicionarConta(c8);
        imovel.adicionarConta(c9);
        imovel.adicionarConta(c10);
        imovel.adicionarConta(c11);
        imovel.adicionarConta(c12);
        
        imovel.relatorioAnual();
        System.out.println();
        
        System.out.println("Valor médio das contas : R$ "+ imovel.calcularValorMedio());
        System.out.println();
        
        Conta maisCara = imovel.contaMaisCara();
        System.out.println("Conta mais cara: "+ maisCara.resumo());
        System.out.println();
        
        imovel.relatorioContasAcimaDaMedia();
        System.out.println();
        
        if (c1.maisCara(c2)){
            System.out.println("A conta de Janeiro doi mais cara que a de Fevereiro.");
            
        }else {
            System.out.println("A conta de Fevereiro foi mais cara que a de Janeiro");
        }
    }
}
