/*
Copyright (C) 2019 Vogju

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
/* 
    Created on : Dec 7, 2019, 1:40:09 PM
    Author     : Vogju
*/
package vector.shield;
    import java.io.*;

public class WriteSettings {
//Writes to txt file Function
   public void writeSettings(boolean[][] array, String[] names) {
      for (int y = 0;y < array.length; y++) {
         boolean[] curArray = array[y];
         File file = new File(names[y] + ".json");
         BufferedWriter bw = null;
         try {
            bw = new BufferedWriter(new FileWriter(file));
            for (int x = 0; x < curArray.length; x++) {
               bw.write(Boolean.toString(curArray[x]));
               bw.newLine();
            }
         } catch (IOException ex) {
         } finally {
            if (bw != null) {
               try { bw.close(); }
               catch (IOException ignored) { }
            }
         }
      }
   }
}
