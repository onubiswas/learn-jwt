package io.onubiswas.jwtauthentication.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustumUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername (String userName) throws UsernameNotFoundException{
        if(userName.equals("Anupama")){
            return new User("Anupama", "anupama@123", new ArrayList<>());
        }else{
            throw new UsernameNotFoundException("User not found !!");
        }



    }

}
