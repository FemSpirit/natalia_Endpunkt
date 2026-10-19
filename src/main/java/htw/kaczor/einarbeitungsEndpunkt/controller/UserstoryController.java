package htw.kaczor.einarbeitungsEndpunkt.controller;

import htw.kaczor.einarbeitungsEndpunkt.dto.UserStoryDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserstoryController {

    @GetMapping("/userstories")
    public ResponseEntity<List<UserStoryDto>> getUserStories() {

        List<UserStoryDto> allUserStories = List.of(
                new UserStoryDto(
                        1L,
                        "Login ermoeglichen",
                        "Als Nutzer möchte ich mich einloggen um ... ",
                        "Nutzer",
                        "Zugriff auf persoenliche Daten"
                ),
                new UserStoryDto(
                        2L,
                        "Profil bearbeiten",
                        "Als Nutzer möchte ich Profil bearbeiten um ...",
                        "Nutzer",
                        "Daten aktuell halten"
                )
        );

        return ResponseEntity.ok(allUserStories);
    }
}