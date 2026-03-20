static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    // 1. Casos base: si una lista se acaba, regresamos la otra
    if (head1 == null) return head2;
    if (head2 == null) return head1;

    // 2. Comparamos los valores
    if (head1.data <= head2.data) {
        // Si head1 es menor, su 'next' será el resultado de mezclar el resto
        head1.next = mergeLists(head1.next, head2);
        return head1;
    } else {
        // Si head2 es menor, su 'next' será el resultado de mezclar el resto
        head2.next = mergeLists(head1, head2.next);
        return head2;
    }
}
