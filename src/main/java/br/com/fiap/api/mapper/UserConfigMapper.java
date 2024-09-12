package br.com.fiap.api.mapper;

import br.com.fiap.api.mapper.request.UserConfigPostRequest;
import br.com.fiap.api.mapper.request.UserConfigPutRequest;
import br.com.fiap.api.mapper.response.UserConfigResponse;
import br.com.fiap.api.model.UserConfig;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserConfigMapper {

    UserConfig postToUserConfig(UserConfigPostRequest userConfigPostRequest);

    UserConfig putToUserConfig(UserConfigPutRequest userConfigPutRequest);

    UserConfigResponse toUserConfigResponse(UserConfig userConfig);

}
