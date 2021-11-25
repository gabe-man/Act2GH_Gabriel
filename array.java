public class array{

    public static void main(String[] args) {

        int[] array=new int[30];

        int cont=0;

        for (int i=0; i < array.length; i++)
        {
            array[i]=(int)((Math.random()*10)+1);
        }

        for (int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < array.length; j++) 
            {
                if (array[j]==i)
                {
                    cont++;
                }
            }
            System.out.println(i + " aparece " + cont + " veces");
            cont=0;
        }

        System.out.println("Esta fatal, arreglalo anda.");
        System.out.println("Seria mejor asi: ");

        for (int i=0; i < array.length; i++)
        {
            array[i]=(int)((Math.random()*10)+1);
        }

        for (int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < array.length; j++) 
            {
                if (array[j]==i)
                {
                    cont++;
                }
            }
            System.out.println(i + " aparece " + cont + " veces");
            cont=0;
        }

         System.out.println("Esta mal, te recomiendo hacer lo siguiente: ");
         
         for (int i=0; i < array.length; i++)
        {
            array[i]=(int)((Math.random()*10)+1);
        }

        for (int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < array.length; j++) 
            {
                if (array[j]==i)
                {
                    cont++;
                }
            }
            System.out.println(i + " aparece " + cont + " veces");
            cont=0;
        }

    }
}