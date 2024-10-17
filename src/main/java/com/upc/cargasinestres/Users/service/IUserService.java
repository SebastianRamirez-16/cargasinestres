package com.upc.cargasinestres.Users.service;

import com.upc.cargasinestres.Shared.dto.response.ApiResponse;
import com.upc.cargasinestres.Users.model.dto.UserResponseDto;

public interface IUserService {
    /**
     * Obtains the data of the users by it's Id
     * @param userId id of the user
     * @return Data of the user
     */
    ApiResponse<UserResponseDto> profile(Long userId);

    /**
     * Deletes a User by it's Id
     * @param userId id of the user
     * @return Response of the operation
     */
    ApiResponse<Object> deleteById(Long userId);
}