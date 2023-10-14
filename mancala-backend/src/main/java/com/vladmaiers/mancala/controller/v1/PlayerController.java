package com.vladmaiers.mancala.controller.v1;

import com.vladmaiers.mancala.exception.RestResponse;
import com.vladmaiers.mancala.model.Player;
import com.vladmaiers.mancala.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.UUID;

/**
 * Player Controller
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(PlayerApi.URL_API_PLAYER_V1)
public class PlayerController implements PlayerApi {

    private final PlayerService playerService;

    public RestResponse<Player> registerPlayer(String username) {
        return RestResponse.success(playerService.create(username));
    }

    public RestResponse<Player> getBy(UUID uuid) {
        return RestResponse.success(playerService.getBy(uuid));
    }

    public RestResponse<Set<Player>> getAll() {
        return RestResponse.success(playerService.getAll());
    }

}
