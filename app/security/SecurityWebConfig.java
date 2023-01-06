/*package security;
import org.springframework.beans.factory.annotation.Autowired;

@EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    PersonAuthenticationProvider personAuthenticationProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/loginProcess")
                .usernameParameter("email")
                .defaultSuccessUrl("/home")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .deleteCookies("JSESSIONID")
                .and()
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/", "/login", "/loginProcess", "/signup", "/signupProcess","/recoverPasswordProcess", "/recoverPassword").permitAll()
                .antMatchers("/home", "/profile").authenticated()
                .antMatchers().hasRole("ADMIN")
                .antMatchers().hasRole("EMPLOYEE")
                .antMatchers().hasRole("DOCTOR")
                .antMatchers().hasRole("PATIENT")
                .antMatchers("/styles/**", "/images/**", "/scripts/**", "/landing/**").permitAll()
                .antMatchers("**").denyAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(personAuthenticationProvider);
    }
}*/