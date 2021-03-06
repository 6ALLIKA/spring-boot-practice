package com.ma.springboot.model.dto.mapper;

import com.ma.springboot.model.Client;
import com.ma.springboot.model.User;
import com.ma.springboot.model.dto.ClientRegistrationDto;
import com.ma.springboot.model.dto.CsvReviewDto;
import com.ma.springboot.model.dto.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User getUserFromParsedLineDto(CsvReviewDto csvReviewDto) {
        User user = new User();
        user.setId(csvReviewDto.getUserId());
        user.setProfileName(csvReviewDto.getProfileName());
        return user;
    }

    public UserResponseDto convertToResponseDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setProfileName(user.getProfileName());
        return userResponseDto;
    }

    public Client convertToClient(ClientRegistrationDto clientRegistrationDto) {
        Client client = new Client();
        client.setLogin(clientRegistrationDto.getLogin());
        client.setPassword(clientRegistrationDto.getPassword());
        return client;
    }
}
