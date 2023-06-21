package dio.webapi.repositories;

import dio.webapi.handler.BusinessException;
import org.springframework.stereotype.Repository;

import dio.webapi.model.UserModel;

import java.util.ArrayList;
import java.util.List;


@Repository
// Todo: Podemos se quiser centralizar os nomes das requisicoes usando o
//Todo: @RequestMapping("/users") - uma vez que todos metodos tem esse prefixo.
/*
 * Esse ee um comentario
 * */
public class UserRepository {

    public void save(UserModel user) {
    if (user.getLogin()==null){
        throw new BusinessException("O campo Login ee obrigatorio");
    }
        if (user.getId() == null) {
            System.out.println("SAVE - Recebendo o ususrio na camada do repository");
        } else {
            System.out.println("UDATE - Recebendo o usuario na camada do repository");

        }
        System.out.println(user);

    }

    public void deleteById(Integer id){
        System.out.println(String.format("Delete/id - Rebendo o id para ser excliudo"));
        System.out.println(id);
    }

    public List<UserModel> findAll(){
        System.out.println("LIST - Listando os usuarios do sistema");
        List<UserModel> users = new ArrayList<>();

        users.add(new UserModel("Hidelgio","1234H"));
        users.add(new UserModel("Amelia","2000G"));
        return users;

    }

    public UserModel findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: " +id+ " para localisar o user"));
        return new UserModel("Hidelgio","1234H" );
    }

    public UserModel findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: "+username+" para localizar o user"));

        return new UserModel(username,"1234H" );
    }
}
