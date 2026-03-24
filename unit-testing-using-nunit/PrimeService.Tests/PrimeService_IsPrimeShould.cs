using NUnit.Framework;
using Prime.Services;

namespace Prime.UnitTests.Services
{    
    [TestFixture] // indica que la clase tiene tests
    public class PrimeService_IsPrimeShould
    {
        private PrimeService _primeService;
        
        [SetUp] // es el metodo de inicializacion
        public void SetUp()
        {
            _primeService = new PrimeService();
        }  

        [Test] // es el metodo de prueba
    
        public void IsPrime_InputIs1_ReturnFalse() 
        {
            var result = _primeService.IsPrime(1);
            Assert.That(result, Is.False, "1 should not be prime"); //Aqui es donde ocurria el error
        }
     }
}