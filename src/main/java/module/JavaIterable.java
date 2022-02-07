package module;

import java.util.function.Consumer;

public class JavaIterable {
    class MyConsumer<String> implements Consumer<String> {
        @Override
        public void accept(String text) {
            System.out.println(text);
        }
    }

    public void useConsumer1() {
        Consumer<String> consumer = (text) -> System.out.println(text);
        consumer.accept("consumer text1");
    }

    public void useConsumer2() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String text) {
                System.out.println(text);
            }
        };
        consumer.accept("consumer text2");
    }

    public void useConsumer3() {
        MyConsumer<String> consumer = new MyConsumer<>();
        consumer.accept("consumer text3");
    }
}
