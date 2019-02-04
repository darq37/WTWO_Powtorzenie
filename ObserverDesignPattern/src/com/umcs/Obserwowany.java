package com.umcs;

public interface Obserwowany {
    void dodajObserwatora(Obserwator obserwator);
    void usunObserwatora(Obserwator obserwator);
    void powiadomObserwatorow();
}
