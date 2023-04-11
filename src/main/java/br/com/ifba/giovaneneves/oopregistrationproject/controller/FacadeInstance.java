package br.com.ifba.giovaneneves.oopregistrationproject.controller;

public class FacadeInstance {

    //----------------------------------{ ATTRIBUTES }----------------------------------//
    private static IFacade facadeInstance;
    private static final Object MONITOR = new Object();

    //----------------------------------{ CONSTRUCTOR }----------------------------------//
    public FacadeInstance(){

        super();

    }

    //----------------------------------{ METHODS }----------------------------------//

    /**
     *
     * @return A new instance of FacadeInstance if there's not.
     */
    public static IFacade getInstance(){

        synchronized (MONITOR){

            if(facadeInstance == null){
                facadeInstance = new Facade();
            }

        }

        return facadeInstance;

    }
}
