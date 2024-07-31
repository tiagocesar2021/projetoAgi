package enums;

public enum AgiEnum {
    EMPRESTIMOS("empréstimo"),
    BLOG_AGI("https://blogdoagi.com.br/"),
    VALOR("----"),
    MENSAGEM_DE_ERRO("Lamentamos, mas nada foi encontrado para sua pesquisa, tente novamente com outras palavras.");




    public final String variacoes;
    AgiEnum(String keywords){
        this.variacoes = keywords;
    }

    public String getVariacoes() {
        return variacoes;
    }
}
