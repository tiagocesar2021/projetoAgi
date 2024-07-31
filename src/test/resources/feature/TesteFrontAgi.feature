# language: pt
# encoding: UTF-8
Funcionalidade: Validar resultados de pesquisa na lupa

  Cenário: Validar pesquisa de valor valido na lupa
    Dado que estou na tela inicial do "BLOG_AGI"
    Quando eu escrever na lupa a palavra "EMPRESTIMOS"
    Entao o blogue retona informações sobre empréstimos

  Cenário: Validar pesquisa de valor invalido na lupa
    Dado que estou na tela inicial do "BLOG_AGI"
    Quando eu escrever na lupa "VALOR" inválido
    Entao o blogue retona "MENSAGEM_DE_ERRO"

  Cenário: Validar pesquisa de valor vazio na lupa
    Dado que estou na tela inicial do "BLOG_AGI"
    Quando pesquiso na lupa em branco
    Entao blogue retona "MENSAGEM_VAZIA"
