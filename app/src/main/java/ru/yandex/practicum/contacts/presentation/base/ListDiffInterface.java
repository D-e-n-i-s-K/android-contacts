package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;

public interface ListDiffInterface <T> {

    boolean theSameAs(T type);
    boolean equals(Object o);

}
