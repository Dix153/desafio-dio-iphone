

public class Iphone {
        public static void main(String[] args) {

            System.out.println("Java Phone: ");
            AparelhoTelefonico iphone = new AparelhoTelefonico();
            iphone.fazerLigacao();
            iphone.atenderLigacao();
            iphone.iniciarCorreioDeVoz();

            System.out.println("Java Web: ");
            NavegadorNaInternet web = new NavegadorNaInternet();
            web.exibirPagina();
            web.adicionarNovaAba();
            web.atualizarPagina();

            System.out.println("Java Music: ");
            ReprodutorMusical music = new ReprodutorMusical();
            music.tocar();
            music.pausar();
            music.selecionarMusica();
        
                                

        }
        
 }
