/*
package pt.upskill.grupoecentrohospitalar.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import pt.upskill.grupoecentrohospitalar.entities.Person;
import pt.upskill.grupoecentrohospitalar.services.AuthenticationService;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    AuthenticationService authenticationService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        Person person = authenticationService.validateLogin(email, password);
        if(person != null) {
            List<SimpleGrantedAuthority> roleList = new ArrayList<>();
            roleList.add(new SimpleGrantedAuthority(person.getRole().getName()));
            return new UsernamePasswordAuthenticationToken(email, password, roleList);
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
*/
