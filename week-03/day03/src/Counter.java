public class Counter {
  int value;
  int x = value;

  public Counter() {
    this(0);
    x = value;
  }

  public Counter(int value) {
    this.value = value;
    x = value;
  }

  void add(int number) {
    this.value += number;
  }

  void add() {
    this.value++;
  }

   int get() {
    return this.value;
  }

  void reset() {
    this.value = x;
  }


}
