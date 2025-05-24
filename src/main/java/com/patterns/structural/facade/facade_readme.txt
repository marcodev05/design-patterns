Problème:

Imaginez que vous deviez faire fonctionner votre code avec un large ensemble d'objets appartenant à une bibliothèque ou à un framework sophistiqué.
Normalement, vous devez initialiser tous ces objets, suivre les dépendances, exécuter les méthodes dans le bon ordre, etc.

Solution
Une façade est une classe qui fournit une interface simple à un sous-système complexe contenant de nombreuses fonctionnalité/ composants.

CAS D'UTILISATIONS:

=> Système Applicatif :

Si votre système applicatif devient complexe avec plusieurs sous-systèmes interagissant les uns avec les autres,
 l'utilisation d'une façade peut simplifier l'interaction pour les autres parties du système.

=> Bibliothèque Réutilisable :

Si vous développez une bibliothèque réutilisable, vous pourriez envisager d'inclure une façade
 si votre bibliothèque offre un large éventail de fonctionnalités ou si son utilisation peut devenir complexe. 
La façade peut offrir une interface simplifiée pour les utilisateurs de la bibliothèque.