package autograde;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Stack;

public class Autograder {

    public static void main(String[] args) {
        if (args.length == 0) {
            fail("Modo nao informado. Use: ex1 | ex2 | ex3 | ex4 | ex5 | ex6");
        }

        try {
            String mode = args[0].trim().toLowerCase();
            switch (mode) {
                case "ex1":
                    testEx1();
                    break;
                case "ex2":
                    testEx2();
                    break;
                case "ex3":
                    testEx3();
                    break;
                case "ex4":
                    testEx4();
                    break;
                case "ex5":
                    testEx5();
                    break;
                case "ex6":
                    testEx6();
                    break;
                default:
                    fail("Modo invalido: " + mode);
            }
            pass();
        } catch (AssertionError e) {
            fail(e.getMessage());
        } catch (Exception e) {
            fail("Erro ao executar avaliacao: " + e.getMessage());
        }
    }

    private static void testEx1() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("criarPilhaValoresFixos");

        Object result = method.invoke(null);
        assertTrue(result instanceof Stack, "criarPilhaValoresFixos deve retornar Stack");

        Stack<?> pilha = (Stack<?>) result;
        assertTrue(pilha.size() == 5, "A pilha deve ter 5 elementos");
        assertTrue(pilha.peek().equals(50), "O topo deve ser 50");
        assertTrue(pilha.pop().equals(50), "O elemento removido deve ser 50");
        assertTrue(pilha.size() == 4, "A pilha deve ficar com 4 elementos apos pop");
    }

    private static void testEx2() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("criarPilhaNomes");

        Object result = method.invoke(null);
        assertTrue(result instanceof Stack, "criarPilhaNomes deve retornar Stack");

        Stack<?> pilha = (Stack<?>) result;
        assertTrue(pilha.size() == 4, "A pilha deve ter 4 nomes");
        assertTrue(pilha.peek().equals("Juliana"), "O topo deve ser Juliana");
    }

    private static void testEx3() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("removerTodosElementos", Stack.class);

        Stack<Integer> pilha = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            pilha.push(i);
        }

        Object result = method.invoke(null, pilha);
        assertTrue(result instanceof List, "removerTodosElementos deve retornar List");

        List<?> removidos = (List<?>) result;
        assertTrue(pilha.empty(), "A pilha deve ficar vazia");
        assertTrue(removidos.size() == 10, "Devem ser removidos 10 elementos");
        assertTrue(removidos.get(0).equals(10), "O primeiro removido deve ser o topo");
        assertTrue(removidos.get(9).equals(1), "O ultimo removido deve ser a base");
    }

    private static void testEx4() throws Exception {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(15);
        pilha.push(30);

        assertTrue(pilha.peek().equals(30), "Mostrar topo deve apontar para o ultimo valor empilhado");
        assertTrue(pilha.pop().equals(30), "Desempilhar deve remover o topo");
        assertTrue(pilha.peek().equals(15), "O novo topo deve ser o valor anterior");
    }

    private static void testEx5() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method method = clazz.getMethod("inverterPalavra", String.class);

        Object result = method.invoke(null, "JAVA");
        assertTrue(result.equals("AVAJ"), "JAVA deve ser invertido para AVAJ");
    }

    private static void testEx6() throws Exception {
        Class<?> clazz = Class.forName("App");
        Method visitar = clazz.getMethod("visitarPagina", Stack.class, String.class);
        Method voltar = clazz.getMethod("voltarPagina", Stack.class);
        Method atual = clazz.getMethod("paginaAtual", Stack.class);

        Stack<String> historico = new Stack<>();
        visitar.invoke(null, historico, "google.com");
        visitar.invoke(null, historico, "github.com");

        assertTrue(atual.invoke(null, historico).equals("github.com"), "Pagina atual deve ser github.com");
        assertTrue(voltar.invoke(null, historico).equals("github.com"), "Voltar deve remover a pagina atual");
        assertTrue(atual.invoke(null, historico).equals("google.com"), "Pagina atual deve voltar para google.com");
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void pass() {
        System.out.println("OK!");
    }

    private static void fail(String message) {
        System.out.println("FAIL: " + message);
        System.exit(1);
    }
}
