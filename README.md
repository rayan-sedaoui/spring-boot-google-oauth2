# Spring Boot Google OAuth2 Login

Ce projet est une application de démonstration implémentant l'authentification **OAuth2** et **OpenID Connect (OIDC)** avec Google en utilisant Spring Boot 3/4.

## Fonctionnalités
- Authentification sécurisée via Google Cloud Console.
- Récupération et affichage des informations du profil (Nom, Email, Photo).
- Interface utilisateur moderne et responsive avec **Bootstrap 5**.
- Gestion sécurisée des secrets via des variables d'environnement.

## Technologies utilisées
- **Backend** : Java 17, Spring Boot, Spring Security OAuth2 Client.
- **Frontend** : Thymeleaf, Bootstrap 5.
- **Outils** : Maven, Git.

##  Aperçu du résultat
L'application permet à un utilisateur de se connecter avec son compte Google et d'accéder à une page de profil personnalisée affichant ses informations.

<img width="961" height="521" alt="Screenshot 2026-03-27 022927" src="https://github.com/user-attachments/assets/f696e03b-e397-4841-b61c-62c54da8ab44" />
<img width="957" height="662" alt="Screenshot 2026-03-27 023136" src="https://github.com/user-attachments/assets/e3453c4e-0d30-4488-aeb1-9972926809bd" />
<img width="956" height="454" alt="Screenshot 2026-03-27 023202" src="https://github.com/user-attachments/assets/e438b2c1-f0ad-4b73-8a76-36e1d9ec12b5" />


## Architecture du projet 


<img width="533" height="955" alt="Screenshot 2026-03-27 022830" src="https://github.com/user-attachments/assets/91d5cf9e-348e-40d6-9e09-f28e2b31f3bd" />


##  Installation et Configuration

### 1. Prérequis
- Un compte [Google Cloud Console](https://console.cloud.google.com/).
- Java 17 ou supérieur installé.
<img width="1915" height="943" alt="Screenshot 2026-03-27 023311" src="https://github.com/user-attachments/assets/d5b1a69d-5518-4c34-ae6b-9a42290d7200" />


### 2. Configuration Google Cloud
1. Créez un projet dans Google Cloud Console.
2. Configurez l'écran de consentement OAuth.
3. Créez des identifiants **ID de client OAuth 2.0**.
4. Ajoutez l'URI de redirection : `http://localhost:8080/login/oauth2/code/google`.

### 3. Variables d'environnement
Pour des raisons de sécurité, les identifiants ne sont pas stockés en dur dans le code. Vous devez configurer les variables suivantes dans votre IDE (IntelliJ) ou votre système :

- `GOOGLE_CLIENT_ID` : Votre ID de client Google.
- `GOOGLE_CLIENT_SECRET` : Votre code secret client Google.

