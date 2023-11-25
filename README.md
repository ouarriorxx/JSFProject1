# Gestion des Services et Employés avec JSF, XAMPP et NetBeans

Ce projet est une application web Java basée sur JSF qui permet la gestion des services et des employés d'une entreprise. Il utilise XAMPP comme serveur local pour la base de données MySQL et NetBeans comme environnement de développement intégré.


# Introduction à JavaServer Faces (JSF)
JavaServer Faces (JSF) est un framework Java destiné au développement d'applications web. Il simplifie la création d'interfaces utilisateur web en permettant la construction de composants d'interface utilisateur réutilisables. JSF suit le modèle de conception MVC (Modèle-Vue-Contrôleur), favorisant ainsi la séparation des préoccupations au sein des applications web.

# 📌Principales Caractéristiques de JSF :
1. Composants Réutilisables :
JSF propose une bibliothèque de composants d'interface utilisateur (UI) préconçus tels que boutons, champs de texte, tableaux, etc. Ces composants peuvent être réutilisés facilement à travers l'application, permettant un développement plus rapide et une maintenance simplifiée.

2. Modèle-Vue-Contrôleur (MVC) :
JSF suit le modèle MVC, encourageant la séparation claire entre le modèle (logique métier), la vue (interface utilisateur) et le contrôleur (logique de gestion des événements). Cela améliore la maintenabilité et la modularité des applications.

3. Gestion Automatique des États :
JSF gère automatiquement l'état des composants entre les requêtes HTTP, éliminant ainsi la nécessité pour les développeurs de gérer manuellement les états des composants. Cela simplifie le développement et améliore la productivité.

4. Intégration Transparente avec d'Autres Technologies Java :
JSF s'intègre facilement avec d'autres technologies Java telles que Java EE (Enterprise Edition), les servlets, les JSP (JavaServer Pages) et les bean CDI (Context and Dependency Injection).

5. Gestion des Événements et de la Navigation :
JSF offre une gestion robuste des événements, permettant aux développeurs de gérer les interactions utilisateur de manière efficace. La navigation entre les pages est également gérée de manière déclarative, simplifiant la configuration.

6. Support Internationalisation (i18n) :
JSF facilite la prise en charge de l'internationalisation en permettant aux développeurs de créer des applications multilingues de manière transparente.

Utilisation de JSF dans le Développement Web :
Création de Pages JSF : Les pages JSF sont généralement définies en utilisant des fichiers XHTML, avec des balises spécifiques pour les composants JSF.

Configuration du Contrôleur : Les contrôleurs, gérant les événements et la logique métier, sont généralement gérés par des managed beans.

Définition des Composants UI : Les composants d'interface utilisateur sont placés sur les pages XHTML et liés aux beans gérés. Ces composants sont automatiquement gérés par le cycle de vie de JSF.

Gestion des Événements : Les événements utilisateur déclenchent des actions définies dans les beans gérés, permettant une réaction appropriée côté serveur.

Navigation entre les Pages : La navigation entre les pages est souvent définie dans un fichier de configuration, simplifiant ainsi la gestion des flux de l'application.

En résumé, JSF fournit une structure solide pour le développement d'applications web Java, en mettant l'accent sur la réutilisation des composants, la gestion des états, la séparation des préoccupations et une intégration harmonieuse avec d'autres technologies Java. Son approche déclarative et son cycle de vie bien défini facilitent le développement d'applications web robustes et évolutives.

# Configuration requise

XAMPP : Télécharger XAMPP
NetBeans : Télécharger NetBeans

# Configuration de la base de données

Installez XAMPP sur votre machine.
Lancez XAMPP et démarrez les services Apache et MySQL.
Accédez à phpMyAdmin (http://localhost/phpmyadmin/) et créez une nouvelle base de données nommée gestion_employes.
Importez le fichier database.sql situé dans le répertoire database pour créer les tables nécessaires.

# Configuration du projet dans NetBeans

Ouvrez NetBeans et importez le projet.
Assurez-vous que le serveur GlassFish est configuré dans NetBeans.
Modifiez le fichier persistence.xml dans le répertoire src/META-INF pour correspondre à vos paramètres de base de données.
xml
Copy code
<persistence-unit name="GestionEmployesPU" transaction-type="JTA">
    <jta-data-source>jdbc/gestion_employes</jta-data-source>
    <properties>
        <!-- Configurations de la base de données -->
        <property name="javax.persistence.schema-generation.database.action" value="update" />
    </properties>
</persistence-unit>

# Exécution de l'application

Déployez l'application sur le serveur GlassFish depuis NetBeans.
Accédez à l'application à l'adresse http://localhost:8080/NomDuProjet/.

# Fonctionnalités

Gestion des Services :
Ajout, suppression et modification des services.

# ✅AJOUT 

![ajouterservice](https://github.com/ouarriorxx/JSF/assets/143946046/088d3286-443e-41fe-8570-3b569c5907a9)

# ❌SUPPRESSION

![supprimerservice1](https://github.com/ouarriorxx/JSF/assets/143946046/05372a20-50a3-4efa-8ce7-d3669d226830)
![supprimerservice2](https://github.com/ouarriorxx/JSF/assets/143946046/9143cf3c-b89e-469d-aa3c-ea6644cfba67)

# 🔧MODIFICATION

![modifierservice](https://github.com/ouarriorxx/JSF/assets/143946046/48e30604-50ae-4508-a9e3-8a85eebddd07)


Gestion des Employés :
Ajout, suppression et modification des employés.

# ✅AJOUT

![ajouteremployee](https://github.com/ouarriorxx/JSF/assets/143946046/5b845e9f-e406-4e3e-b075-33e9fd529b6a)

# ❌SUPPRESSION

![supprimeremployee](https://github.com/ouarriorxx/JSF/assets/143946046/167001ea-0a27-4133-b962-60eceb67f2a2)

# 🔧MODIFICATION

![modifieremployee](https://github.com/ouarriorxx/JSF/assets/143946046/9d678294-3bc1-4dbd-9bf2-b732c554a41d)



# 🔍Association des employés à des services.

![lk](https://github.com/ouarriorxx/JSF/assets/143946046/6a728bf5-bb8c-4adb-bd6f-7c8699dbc017)



sql
Copy code
/
|-- src/            # Code source de l'application
|-- WebContent/    # Ressources web (pages JSF, CSS, etc.)
|-- database/      # Script SQL pour la création de la base de données
|-- ...

# Contributeur
OUARARI kawtar 
