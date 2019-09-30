package code.pattern.filter.filterClass;

import java.util.List;

public interface Filter<T> {

    List<T> filter(List<T> data);
}
