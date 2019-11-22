/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes
        final String VOWELS = "AEIOU";
        final int VOWELS_LENGTH = VOWELS.length();

        //Variables
        boolean exitLoop = false;
        char userInput;
        int i;
        //Bucle principal
        while (!exitLoop) {
            System.out.print("Escriba una vocal inglesa ...: ");
            userInput = SCN.nextLine().charAt(0);

            for (i = 0; i < VOWELS_LENGTH; i++) {
                if (userInput == VOWELS.charAt(i)) {
                    System.out.printf("Usted escribió ..............: %s.%n",
                            userInput);
                    exitLoop = true;
                }
            }
            if (!exitLoop) {
                System.out.printf("ERROR: \"%s\" no es una vocal inglesa.%n",
                        userInput);
            }
        }
    }
}
