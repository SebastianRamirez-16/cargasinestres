package com.upc.cargasinestres.Users.service.impl;

import com.upc.cargasinestres.Shared.dto.enums.EStatus;
import com.upc.cargasinestres.Shared.dto.response.ApiResponse;
import com.upc.cargasinestres.Shared.exception.ResourceNotFoundException;
import com.upc.cargasinestres.Users.model.dto.UserResponseDto;
import com.upc.cargasinestres.Users.repository.IUserRepository;
import com.upc.cargasinestres.Users.service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private final IUserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(IUserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ApiResponse<UserResponseDto> profile(Long userId) {
        var user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("No se encontró el usuario con id " + userId));

        //se mapea el usuario a un DTO
        var userDto = modelMapper.map(user, UserResponseDto.class);

        return new ApiResponse<>("Usuario encontrado", EStatus.SUCCESS, userDto);
    }

    @Override
    public ApiResponse<Object> deleteById(Long userId) {
        var user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("No se encontró el usuario con id " + userId));

        //elimina al usuario
        userRepository.delete(user);

        return new ApiResponse<>("Usuario eliminado correctamente", EStatus.SUCCESS, null);
    }
}