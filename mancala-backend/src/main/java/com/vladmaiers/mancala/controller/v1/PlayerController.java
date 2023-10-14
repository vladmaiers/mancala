package com.vladmaiers.mancala.controller.v1;

import com.vladmaiers.mancala.exception.RestResponse;
import com.vladmaiers.mancala.model.Player;
import com.vladmaiers.mancala.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Player Controller
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(PlayerApi.URL_API_GAME_V1)
public class PlayerController implements PlayerApi {

    private final PlayerService playerService;

    public RestResponse<Set<Player>> getAll() {
        return RestResponse.success(playerService.getAll());
    }

    public RestResponse<Player> registerPlayer(String username) {
        return RestResponse.success(playerService.create(username));
    }

}
