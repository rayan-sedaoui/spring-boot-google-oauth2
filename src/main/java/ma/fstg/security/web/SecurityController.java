package ma.fstg.security.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    /**
     * Affiche la page d'accueil publique (index.html)
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Affiche la page de profil privée (profile.html)
     * L'annotation @AuthenticationPrincipal permet de récupérer
     * directement l'utilisateur connecté via Google (OidcUser).
     */
    @GetMapping("/profile")
    public String profile(Model model, @AuthenticationPrincipal OAuth2User principal) {
        if (principal != null) {
            model.addAttribute("user", principal);
        }
        return "profile";
    }
}