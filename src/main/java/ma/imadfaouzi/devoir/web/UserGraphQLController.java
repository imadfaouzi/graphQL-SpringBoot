package ma.imadfaouzi.devoir.web;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.imadfaouzi.devoir.dtos.UserDTO;
import ma.imadfaouzi.devoir.entities.User;
import ma.imadfaouzi.devoir.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
//@AllArgsConstructor @NoArgsConstructor
public class UserGraphQLController {

      @Autowired
      private UserRepository userRepository;


      @QueryMapping
      public List<User> usersList(){
           return userRepository.findAll();
      }

      @QueryMapping
      public User getUserByEmail(@Argument String email){
            return userRepository.findUserByEmail(email);
      }


      @MutationMapping
      public User saveUser(@Argument User user){
            System.out.println("i m Here !!!!!!");
            return userRepository.save(user);
      }

      @MutationMapping
      public void deleteUser(@Argument Long id) {
            User userToDelete = userRepository.findById(id).orElse(null);
            userRepository.deleteById(id);
      }



//    getUserByEmail
}
