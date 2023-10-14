package com.vladmaiers.mancala.controller.v1;

import com.vladmaiers.mancala.exception.RestResponse;
import com.vladmaiers.mancala.model.GameSession;
import com.vladmaiers.mancala.service.GameSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Game Session Controller
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(GameSessionApi.URL_API_GAME_V1)
public class GameSessionController implements GameSessionApi {

    private final GameSessionService gameSessionService;

    public RestResponse<GameSession> start(UUID waitingRoomUuid) {
        return RestResponse.success(gameSessionService.createOrJoinBy(waitingRoomUuid));
    }

    public RestResponse<GameSession> get(UUID uuid) {
        return RestResponse.success(gameSessionService.getBy(uuid));
    }

    public RestResponse<Void> finish(UUID uuid, GameSession gameSession) {
        gameSessionService.finishBy(uuid, gameSession);
        return RestResponse.success();
    }

}
