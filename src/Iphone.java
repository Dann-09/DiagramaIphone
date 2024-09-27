import Funcionalidades.Galeria;
import Funcionalidades.Navegador;
import Funcionalidades.ReprodutorMusical;
import Funcionalidades.Telefone;
import Funcionalidades.SMS;


public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical itunes = new ReprodutorMusical();
        System.out.println("Reprodutor Musical");
        itunes.escolherAlbum();
        itunes.escolherMusica();
        itunes.reproduzirMusica();
        itunes.aumentarVolume();
        itunes.diminuirVolume();
        itunes.avaliarAlbum();
        itunes.pararMusica();
        itunes.passarMusica();
        itunes.voltarMusica();

        System.out.println();
        System.out.println("Galeria");
        Galeria galeria = new Galeria();
        galeria.visualizarFotos();
        galeria.passarFotos();
        galeria.zoom();

        System.out.println();
        System.out.println("Navegador");
        Navegador safari = new Navegador();
        safari.pesquisarWeb("www.amazom.com");
        safari.alterarPagina();

        System.out.println();
        System.out.println("Telefone");
        Telefone telefone = new Telefone();
        telefone.atenderChamada();
        telefone.recusarChamada();
        telefone.verContato();
        telefone.addFavorito();
        telefone.removerContato();

        System.out.println();
        System.out.println("SMS");
        SMS sms = new SMS();
        sms.receberrSms();
        sms.enviarSms();
        sms.verHistorico();




    }


}
