package java8_pratico.Cap7;

import java8_pratico.Cap6.Usuario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Seleciona10Antigo {
    public static void main(String[] args) {
        List<Usuario2> usuarios = new ArrayList<>();
        usuarios.add(new Usuario2("Carlos", 150));
        usuarios.add(new Usuario2("Ana", 200));
        usuarios.add(new Usuario2("Alice", 90));
        usuarios.add(new Usuario2("Bruno", 180));
        usuarios.add(new Usuario2("Manuela", 300));
        usuarios.add(new Usuario2("Luiza", 320));
        usuarios.add(new Usuario2("Luis", 210));
        usuarios.add(new Usuario2("Daniela", 321));
        usuarios.add(new Usuario2("Eduardo", 478));
        usuarios.add(new Usuario2("Fernanda", 150));

        usuarios.add(new Usuario2("Gabriel", 62));
        usuarios.add(new Usuario2("Helena", 500));
        usuarios.add(new Usuario2("Igor", 275));
        usuarios.add(new Usuario2("Juliana", 120));

        Collections.sort(usuarios, new Comparator<Usuario2>() {
            @Override
            public int compare(Usuario2 u1, Usuario2 u2) {
                return u1.getPontos() - u2.getPontos();
            }
        });
        Collections.reverse(usuarios);
        List<Usuario2> top10 = usuarios.subList(0, 10);
        for (Usuario2 usuario : top10) {
            usuario.tornaModerador();
        }

        System.out.println("Usu�rios: ");
        usuarios.forEach(System.out::println);
    }
}
