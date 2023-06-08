package sg.edu.nus.iss.sa56_day01.model;

import lombok.Data;
import lombok.Getter;

import javax.annotation.Generated;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class Employee {
    
    private String id;
    private String firstName;
    private String lastName;

}
