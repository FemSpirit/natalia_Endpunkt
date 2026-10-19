package htw.kaczor.einarbeitungsEndpunkt.dto;

public record UserStoryDto(
        Long id,
        String titel,
        String beschreibung,
        String rolle,
        String nutzen
) {
}
