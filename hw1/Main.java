interface ТорговыйАвтомат {
   ГорячийНапиток getProduct(int name, int volume);
}

class ГорячийНапиток {
   private int name;
   private int volume;

   public ГорячийНапиток(int name, int volume) {
      this.name = name;
      this.volume = volume;
   }

   public int getName() {
      return name;
   }

   public int getVolume() {
      return volume;
   }
}

class НаследникГорячийНапиток extends ГорячийНапиток {
   private int температура;

   public НаследникГорячийНапиток(int name, int volume, int температура) {
      super(name, volume);
      this.температура = температура;
   }

   public int getТемпература() {
      return температура;
   }
}

class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
   @Override
   public НаследникГорячийНапиток getProduct(int name, int volume) {
      return new НаследникГорячийНапиток(name, volume, 0);
   }

   public НаследникГорячийНапиток getProduct(int name, int volume, int температура) {
      return new НаследникГорячийНапиток(name, volume, температура);
   }
}

public class Main {
   public static void main(String[] args) {
      ГорячихНапитковАвтомат автомат = new ГорячихНапитковАвтомат();

      НаследникГорячийНапиток напиток1 = автомат.getProduct(1, 200);
      НаследникГорячийНапиток напиток2 = автомат.getProduct(2, 300, 80);

      System.out.println("Напиток 1: " + напиток1.getName() + ", объем: " + напиток1.getVolume());
      System.out.println("Напиток 2: " + напиток2.getName() + ", объем: " + напиток2.getVolume() + ", температура: "
            + напиток2.getТемпература());
   }
}
