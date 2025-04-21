import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) //Utilizamos la anotacion @RunWith para indicar que se va a ejecutar una suite de pruebas
@Suite.SuiteClasses({FactorialTestTest.class, MultiplicaTestTest.class}) //Indicamos los clases que se van a incluir en la suite


public class TestSuiteMultiFact { //Clase que indica que esta suite de pruebas se va a ejecutar

}
