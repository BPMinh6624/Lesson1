/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lesson1;

import com.mycompany.lesson1.Common.Library;
import com.mycompany.lesson1.Model.Element;
import com.mycompany.lesson1.Controller.SortPrograming;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.size_array));
        new SortPrograming(element).run();
    }
}
