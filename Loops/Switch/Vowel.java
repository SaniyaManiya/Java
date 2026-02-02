char ch = 'a';

switch (ch) {
    case 'a': case 'e': case 'i': case 'o': case 'u':
    case 'A': case 'E': case 'I': case 'O': case 'U':
        System.out.println("Vowel");
        break;
    default:
        System.out.println("Consonant");
}
