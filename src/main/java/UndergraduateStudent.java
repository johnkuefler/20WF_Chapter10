/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class UndergraduateStudent extends Student {

    @Override
    public void setYear(String year) {
        if (year == "Freshman" ) //
        {   this.year = year;
        }
        // else return error
    }

    @Override
    public String getYear(String year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
