# Sistema de Folha de Pagamento: Polimorfismo e Heranca

Este projeto implementa um modelo de gerenciamento de funcionarios utilizando conceitos avancados de Programacao Orientada a Objetos em Java.

## Estrutura de Classes

- **Funcionario**: Classe base que define os atributos comuns (`nome`, `salarioBase`) e o metodo fundamental de `vencimento()`.
- **Gerente**: Especializacao que adiciona o atributo `bonus` ao calculo de vencimento.
- **Desenvolvedor**: Especializacao que integra `horasExtras` e `valorHora` ao calculo final.

## Conceitos Tecnicos Aplicados

1. **Heranca**: Reuso de codigo e definicao de hierarquia entre classes.
2. **Polimorfismo**: Processamento de diferentes tipos de funcionarios atraves de uma lista generica `ArrayList<Funcionario>`.
3. **Modificadores de Acesso**: Uso de `protected` para permitir acesso direto a atributos por subclasses, otimizando o desempenho e a leitura.
4. **Casting e Verificacao de Tipo**: 
   - **Upcasting**: Armazenamento de subtipos em referencias do supertipo.
   - **Downcasting**: Uso de `instanceof` para acessar metodos especificos de classes filhas durante a iteracao.

## Implementacao de Referencia

```java
for (Funcionario f : funcionarios) {
    System.out.println(f); // Chamada polimorfica ao toString()
    
    if (f instanceof Gerente) {
        Gerente g = (Gerente) f;
        System.out.println("Bonus: " + g.getBonus());
    }
}
