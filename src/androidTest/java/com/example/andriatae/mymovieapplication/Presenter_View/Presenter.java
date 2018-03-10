package com.example.andriatae.mymovieapplication.Presenter_View;

import com.example.andriatae.mymovieapplication.Interactor.APInteractorIMP;
import com.example.andriatae.mymovieapplication.Interactor.DatabaseInteractorIMP;
import com.example.andriatae.mymovieapplication.Interactor.FragmentInteractorIMP;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

/**
 * Created by Andria TAE on 10/03/2018.
 */

public class Presenter {


    //3 interactors for 3 actions to be performed in this application
    //I will create Mock versions of my interactors to perform certain actions




//Interactors

    @Mock
    APInteractorIMP myMockInteractorAPI;
    @Mock
    DatabaseInteractorIMP myMockInteractorDatabase;
    @Mock
    FragmentInteractorIMP myMockInteractorFragment;


    //View Imp
    @Mock ViewIMP myView;


    //categories
    String Action;
    String Adventure;
    String Thriller;
    String Comedy;


    // First STage

    //this method will be called when the pertaining Category button is clicked


    //This object would normally in the final implementation, make a call to realm based on the String passed in
    //This would then retrieve data based on category that would be contained in the realm database, which
    //is in turn stored from a APIinteractor call

    public Presenter(){


        //initialise the interactors, the APIInteractor has a constructor which will carry out a method based on
        //the condition that the database is EMPTY or a check that the database is NOT uptodate.

    }



    @Mock
    DatabaseInteractorIMP databaseMock;


    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Test
    public List ShowCategoryRecycleview(String Category) {

        //activate view method to show the category of film in recycleview

        return null;
    }


 @Test
 public void UpdateMovieList()
     {

         //will Update the ream with most resent movie list based on category

 }

 @Test
 public void ShowFragmentDetailView(Integer ID)

         //Call to a view method to update UI
         //This method will get the information for the fragment ready and the fragment itself
         //then call a view method to display this data on the fragment

 {




    }







}
