package test.doublecolon;

@FunctionalInterface
public interface Convert<I, R> {
    R convert(I from);
}
