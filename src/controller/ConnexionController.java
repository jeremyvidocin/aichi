package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modele.User;
import modele.UserDAO;
import views.FConnexionView;

public class ConnexionController {

    private FConnexionView view;
    private UserDAO userDAO;

    public ConnexionController(FConnexionView view, UserDAO userDAO) {
        this.view = view;
        this.userDAO = userDAO;

        view.addValiderListener(new ValiderListener());
        view.addQuitterListener(new QuitterListener());
    }

    private class ValiderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nom = view.getNom();
            String motDePasse = view.getMotDePasse();

            User user = userDAO.authenticate(nom, motDePasse);
            if (user != null) {
                view.showMessage("Connexion réussie!");
                // Ajoutez ici la logique pour ouvrir la fenêtre principale de l'application
            } else {
                view.showMessage("Nom d'utilisateur ou mot de passe incorrect.");
            }
        }
    }

    private class QuitterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.fermerFenetre();
        }
    }
}
