package project.stuff;
/* **- interface Transformable (implementing classes Water, Sand)
 -- void mix() - mixes particles of stuff against each other*/

/* **- interface Transformable (implementing classes Water, Sand)
---- void setOpened(), который меняет состояние вещества на "открытое"
---- void setTemperature(int temperature) - mixes particles of stuff against each other*/

public interface Transformable {
    void setOpened();
    void mix();
    void setTemperature(int temperature);

}
