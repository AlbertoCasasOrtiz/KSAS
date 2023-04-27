# KSAS - Kenpo Set Assisting System

An application for assisting the learning of American Kenpo Karate's Blocking Set I using an Android smartphone.

## Model

The application already comes with one tensorflow lite model trained for each arm that can be found in this [link](https://github.com/AlbertoCasasOrtiz/KSAS/tree/master/app/src/main/assets). This model was trained using a dataset composed of 240 movements captured from 20 subjects. The model used consists in a LSTM and the code used for training it can be found in this [link](https://github.com/AlbertoCasasOrtiz/Martial-Arts-Movements-Classifier). The LSTM achieved 100% of accuracy in the training set and 94% of accuracy in the testing set.

## KSAS Instructions

The application starts and asks you to put your device as a wearable. This can be done through the use of a wrist band similar to those used by athletes and runners.

Then, the applications ask you to select a set. The only available set is Blocking Set I.

Once the set is selected, the applications tell you some information about the set, and a video with the full execution of the set is shown.

In the next Activity, the user is asked to get into the starting position, and the motion capture starts:

* If the user executes a movement correctly, the app will congratulate the user and ask him to execute the next movement. A victory sound is played.

* If the user executed the wrong movement, the device will vibrate, the app will tell the user that the movement has been wrongly executed and will ask the user to execute the movement again. A buzz sound is played.

* If no movement has been detected, the app will ask the user to execute the movement again.

## License
This software is licensed under the [AGPL](https://choosealicense.com/licenses/agpl-3.0/) license.

## Cite
*Casas-Ortiz, A., Echeverria, J. & Santos, O.C.* (2023). [Intelligent Systems for Psychomotor Learning: A Systematic Review and Two Cases of Study. In Handbook of Artificial Intelligence in Education](https://www.elgaronline.com/edcollchap/book/9781800375413/book-part-9781800375413-30.xml). Edward Elgar Publishing: Cheltenham, Inglaterra, pp. 390–421, ISBN 9781800375413.

*Casas-Ortiz, A. & Santos, O. C.* (2021). [KSAS: A Mobile App with Neural Networks to Guide the Learning of Motor Skills.](https://caepia20-21.uma.es/inicio_files/caepia20-21-actas.pdf) In Proceedings of Conference of the Spanish Association of Artificial Intelligence (CAEPIA 20/21) (pp. 997-1000)

*Casas-Ortiz, A. & Santos, O. C.* (2021). [KSAS: An AI Application to learn Martial Arts Movements in on-line Settings.](https://aied2021.science.uu.nl/file/KSAS-An-AI-Application-to-learn-Martial-Arts-Movements-in-on-line-Settings.pdf) In 22nd International Conference on Artificial Intelligence in Education (AIED 2021) (pp. 1-4).



