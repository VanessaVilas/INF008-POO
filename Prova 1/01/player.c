#include <string.h>
#include <stdio.h>

typedef struct {
    char name[31];
    int power;
} Player;

void printPlayer(Player *p) {
    printf("%s - %d\n", p->name, p->power);
}

void fight(Player *p1, Player *p2) {
    if (p1->power > p2->power) {
        printf("%s wins\n", p1->name);
        p1->power += 10;
        p2->power -= 10;
    } else if (p1->power < p2->power) {
        printf("%s wins\n", p2->name);
        p1->power -= 10;
        p2->power += 10;
    }
}

int main(int argc, char **argv) {
    Player p1, p2;
    strcpy(p1.name, "JOAO");
    p1.power = 100;
    strcpy(p2.name, "MARIA");
    p2.power = 110;

    fight(&p1, &p2);

    printPlayer(&p1);
    printPlayer(&p2);

    return 0; // exit code

    // Compilando e executando player.c:
    // gcc player.c -o player
    // ./player
}
