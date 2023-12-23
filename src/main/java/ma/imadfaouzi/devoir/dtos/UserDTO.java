package ma.imadfaouzi.devoir.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor @NoArgsConstructor
public class UserDTO {
    private  Long id;
    private String name;
    private String email;
    private String date_Naissance;
}