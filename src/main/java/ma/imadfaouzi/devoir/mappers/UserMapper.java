package ma.imadfaouzi.devoir.mappers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import ma.imadfaouzi.devoir.dtos.UserDTO;
import ma.imadfaouzi.devoir.entities.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class UserMapper {

    private final ModelMapper modelMapper;


    public UserDTO fromUser(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    public User fromUser(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
