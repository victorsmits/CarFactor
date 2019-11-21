

#
# Etat d&#39;avancement du projet

# CarFactor

**Réception du projet le 14/11/209 :**

Processus :

- Le projet ne compile pas au départ, il faut changer dans Project Structure la version de Java. Il ne compile toujours pas, il faut installer le plugin JSON Parser.
- Les tests fonctionnent, et le code compile :

Quand le programme nous demande de rentrer un chiffre entre 1 et 5 :

1. Cela produit une question : «Add minimum buy year: » et en entrant une année dans le terminal Error
2. Error directement
3. Error directement
4. Ne produit rien
5. Ne produit rien

- Au niveau du Maven : Zakariya a réalisé le job sur [https://jenkins.ecam.be](https://jenkins.ecam.be) et après moulte péripéties, ça a build et nous avons désormais des graphes plus ou moins valides. A noter que le site Jenkins ne fonctionne que dans la périphérie de l&#39;ECAM.

**Le 21/11/209 :**

- Fix du problème du case 1 dans main() : 106 : Integer.parseInt Double.parseDouble
  - Résultat : ça compile sans erreur.
- Case 2 and 3 put in commentaires.
- PMD Warnings all fixed (6 out of 6).

