package ma.imadfaouzi.devoir.services;

import ma.imadfaouzi.devoir.dtos.UserDTO;
import ma.imadfaouzi.devoir.entities.User;

public interface UserManager {
        UserDTO saveUser(User user);
        UserDTO deleteUser(User user);
}
