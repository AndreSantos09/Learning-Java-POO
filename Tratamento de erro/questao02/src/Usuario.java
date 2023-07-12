import java.time.LocalDate;

public class Usuario {
    public void cadastrar(String nome, int dataNascimento) throws NomeInvalidoException, IdadeInvalidaException{
        int idade = dataNascimento;
        if(nome == null){
            throw new NomeInvalidoException("\"Nome não pode ser vazio.");
        }
        if(dataNascimento == null){
            throw new IdadeInvalidaException ("Data de nascimento não pode ser nula.");
        }
        if(idade < 18 || idade > 100){
            throw new IdadeInvalidaException("Idade inválida. A idade deve estar entre 18 e 100 anos.");
        }
    }

    }







