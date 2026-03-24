namespace Prime.Services
{
    public class PrimeService
    {
        public bool IsPrime(int candidate)
        {
            if (candidate <= 1)
                return false;

            for (int i = 2; i < candidate; i++)
            {
                if (candidate % i == 0)
                    return false;
            }

            return true;
        }
    }
}