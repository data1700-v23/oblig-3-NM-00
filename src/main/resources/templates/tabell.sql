CREATE TABLE PersonObjekt(
    id        INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    film      VARCHAR(255) NOT NULL,
    antall    INT          NOT NULL,
    fornavn   VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    telefonnr       VARCHAR(255) NOT NULL,
    email     VARCHAR(255) NOT NULL
);