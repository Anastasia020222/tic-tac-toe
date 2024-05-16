package org.example.general;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum Parameters {

    A(0, 0, 1),
    B(1, 0, 2),
    C(2, 0, 3),
    D(0, 1, 4),
    E(1, 1, 5),
    F(2, 1, 6),
    G(0, 2, 7),
    H(1, 2, 8),
    I(2, 2, 9);

    private final int x;
    private final int y;
    private final int location;

    @Override
    public String toString() {
        return "Parameters{" +
                "x=" + x +
                ", y=" + y +
                ", location=" + location +
                '}';
    }
}
