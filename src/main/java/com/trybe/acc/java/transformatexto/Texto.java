package com.trybe.acc.java.transformatexto;

/** Sistema de processamento de texto. */
public class Texto {
  /** Processa o texto. */
  public String transformaTexto(String text) {
    String removeSimbol = text.replace("+", " ");

    if (text.indexOf("a") % 2 == 0) {
      // se a primeira letra "a" encontrada estiver em posição par, retorna o texto em
      // caixa alta.
      return removeSimbol.toUpperCase();
    } else {
      // retorna a primeira palavra encontrada
      return removeSimbol.split(" ")[0];
    }
  }
}
